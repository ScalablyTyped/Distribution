package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.BingMapsLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.BingMapsLayer")
@js.native
/**
  * This layer supports Microsoft's Bing tiled map content. Three map styles are supported - `road`, `aerial` and `hybrid`. Please note that a valid [Bing Maps key](https://msdn.microsoft.com/en-us/library/ff428642.aspx) is required to use this layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html)
  */
class BingMapsLayerCls ()
  extends typings.arcgisJsApi.esri.BingMapsLayer {
  def this(properties: BingMapsLayerProperties) = this()
}

