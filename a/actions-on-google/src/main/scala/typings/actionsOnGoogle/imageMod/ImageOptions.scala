package typings.actionsOnGoogle.imageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageOptions extends js.Object {
  /**
    * Text to replace for image for accessibility.
    * @public
    */
  var alt: String = js.native
  /**
    * Height of the image.
    * @public
    */
  var height: js.UndefOr[Double] = js.native
  /**
    * Image source URL.
    * @public
    */
  var url: String = js.native
  /**
    * Width of the image.
    * @public
    */
  var width: js.UndefOr[Double] = js.native
}

object ImageOptions {
  @scala.inline
  def apply(alt: String, url: String): ImageOptions = {
    val __obj = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageOptions]
  }
  @scala.inline
  implicit class ImageOptionsOps[Self <: ImageOptions] (val x: Self) extends AnyVal {
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
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

