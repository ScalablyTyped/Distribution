package typings.appleMusicApi.AppleMusicApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://developer.apple.com/documentation/applemusicapi/preview
@js.native
trait Preview extends js.Object {
  var artwork: js.UndefOr[Artwork] = js.native
  var url: String = js.native
}

object Preview {
  @scala.inline
  def apply(url: String): Preview = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Preview]
  }
  @scala.inline
  implicit class PreviewOps[Self <: Preview] (val x: Self) extends AnyVal {
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
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setArtwork(value: Artwork): Self = this.set("artwork", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArtwork: Self = this.set("artwork", js.undefined)
  }
  
}

