package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureSourced extends js.Object {
  var angle: js.UndefOr[Double] = js.native
   // "<base64EncodedImageData>";
  var contentType: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
   // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
  var xoffset: js.UndefOr[Double] = js.native
  var yoffset: js.UndefOr[Double] = js.native
}

object PictureSourced {
  @scala.inline
  def apply(): PictureSourced = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PictureSourced]
  }
  @scala.inline
  implicit class PictureSourcedOps[Self <: PictureSourced] (val x: Self) extends AnyVal {
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
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setImageData(value: String): Self = this.set("imageData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageData: Self = this.set("imageData", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setXoffset(value: Double): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXoffset: Self = this.set("xoffset", js.undefined)
    @scala.inline
    def setYoffset(value: Double): Self = this.set("yoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoffset: Self = this.set("yoffset", js.undefined)
  }
  
}

