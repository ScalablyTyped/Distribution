package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerSymbolProperties extends SymbolProperties {
  /**
    * The angle of the marker relative to the screen in degrees.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle)
    *
    * @default 0
    */
  var angle: js.UndefOr[Double] = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-marker` | `picture-marker`] = js.native
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.native
  /**
    * The offset on the y-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.native
}

object MarkerSymbolProperties {
  @scala.inline
  def apply(): MarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerSymbolProperties]
  }
  @scala.inline
  implicit class MarkerSymbolPropertiesOps[Self <: MarkerSymbolProperties] (val x: Self) extends AnyVal {
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
    def setType(value: `simple-marker` | `picture-marker`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setXoffset(value: Double | String): Self = this.set("xoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXoffset: Self = this.set("xoffset", js.undefined)
    @scala.inline
    def setYoffset(value: Double | String): Self = this.set("yoffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYoffset: Self = this.set("yoffset", js.undefined)
  }
  
}

