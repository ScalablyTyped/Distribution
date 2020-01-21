package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayerOptions
  extends Accessor
     with JSONSupport {
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html). Indicates whether or not only the topmost raster should be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#returnTopmostRaster)
    *
    * @default false
    */
  var returnTopmostRaster: Boolean = js.native
  /**
    * Applicable to [Imagery Layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html). Indicates whether records without data should display within the popup.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-LayerOptions.html#showNoDataRecords)
    *
    * @default true
    */
  var showNoDataRecords: Boolean = js.native
}

@JSGlobal("__esri.LayerOptions")
@js.native
object LayerOptions extends TopLevel[LayerOptionsConstructor]

