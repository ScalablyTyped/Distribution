package typings.arcgisJsApi.bingMapsLayerMod

import typings.arcgisJsApi.esri.BingMapsLayer
import typings.arcgisJsApi.esri.BingMapsLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/BingMapsLayer", JSImport.Namespace)
@js.native
/**
  * This layer supports Microsoft's Bing tiled map content. Three map styles are supported - `road`, `aerial` and `hybrid`. Please note that a valid [Bing Maps key](https://msdn.microsoft.com/en-us/library/ff428642.aspx) is required to use this layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html)
  */
class Class () extends BingMapsLayer {
  def this(properties: BingMapsLayerProperties) = this()
}

