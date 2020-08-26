package typings.arcgisJsApi.graphicsLayerMod

import typings.arcgisJsApi.esri.GraphicsLayer
import typings.arcgisJsApi.esri.GraphicsLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/GraphicsLayer", JSImport.Namespace)
@js.native
/**
  * A GraphicsLayer contains one or more client-side [Graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html). Each [graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics) in the GraphicsLayer is rendered in a [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) inside either a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). The [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html#graphics) contain discrete vector [geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) that represent real-world phenomena.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html)
  */
class Class () extends GraphicsLayer {
  def this(properties: GraphicsLayerProperties) = this()
}

