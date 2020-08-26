package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/artwork
@js.native
trait Artwork extends js.Object {
  var bgColor: js.UndefOr[String] = js.native
  var height: Double = js.native
  var textColor1: js.UndefOr[String] = js.native
  var textColor2: js.UndefOr[String] = js.native
  var textColor3: js.UndefOr[String] = js.native
  var textColor4: js.UndefOr[String] = js.native
  var url: String = js.native
  var width: Double = js.native
}

object Artwork {
  @scala.inline
  def apply(height: Double, url: String, width: Double): Artwork = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Artwork]
  }
  @scala.inline
  implicit class ArtworkOps[Self <: Artwork] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setBgColor(value: String): Self = this.set("bgColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBgColor: Self = this.set("bgColor", js.undefined)
    @scala.inline
    def setTextColor1(value: String): Self = this.set("textColor1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor1: Self = this.set("textColor1", js.undefined)
    @scala.inline
    def setTextColor2(value: String): Self = this.set("textColor2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor2: Self = this.set("textColor2", js.undefined)
    @scala.inline
    def setTextColor3(value: String): Self = this.set("textColor3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor3: Self = this.set("textColor3", js.undefined)
    @scala.inline
    def setTextColor4(value: String): Self = this.set("textColor4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextColor4: Self = this.set("textColor4", js.undefined)
  }
  
}

