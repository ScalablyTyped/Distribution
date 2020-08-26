package typings.arcgisJsApi.symbol3DLayerMod

import typings.arcgisJsApi.esri.Symbol3DLayer
import typings.arcgisJsApi.esri.Symbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/Symbol3DLayer", JSImport.Namespace)
@js.native
/**
  * Symbol layers are used to define the visualization of [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html), [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html), and mesh geometries rendered with [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html). [3D symbols](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3D.html) may only be used to render features in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), or standalone [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). There is no support for 3D symbols in 2D [MapViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol3DLayer.html)
  */
class Class () extends Symbol3DLayer {
  def this(properties: Symbol3DLayerProperties) = this()
}

