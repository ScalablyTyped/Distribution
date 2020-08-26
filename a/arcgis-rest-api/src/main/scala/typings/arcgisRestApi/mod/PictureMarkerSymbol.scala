package typings.arcgisRestApi.mod

import typings.arcgisRestApi.arcgisRestApiStrings.esriPMS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisRestApi.mod.PictureSourced because var conflicts: angle, xoffset, yoffset. Inlined url, imageData, contentType, width, height */ @js.native
trait PictureMarkerSymbol extends MarkerSymbol {
   // "<base64EncodedImageData>";
  var contentType: js.UndefOr[String] = js.native
  var height: js.UndefOr[Double] = js.native
   // Relative URL for static layers and full URL for dynamic layers. Access relative URL using http://<mapservice-url>/<layerId1>/images/<imageUrl11>
  var imageData: js.UndefOr[String] = js.native
  @JSName("type")
  var type_PictureMarkerSymbol: esriPMS = js.native
  var url: js.UndefOr[String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object PictureMarkerSymbol {
  @scala.inline
  def apply(`type`: esriPMS): PictureMarkerSymbol = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureMarkerSymbol]
  }
  @scala.inline
  implicit class PictureMarkerSymbolOps[Self <: PictureMarkerSymbol] (val x: Self) extends AnyVal {
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
    def setType(value: esriPMS): Self = this.set("type", value.asInstanceOf[js.Any])
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
  }
  
}

