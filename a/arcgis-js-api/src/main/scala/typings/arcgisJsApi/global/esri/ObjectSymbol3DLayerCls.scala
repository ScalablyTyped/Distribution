package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ObjectSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.ObjectSymbol3DLayer")
@js.native
/**
  * ObjectSymbol3DLayer is used to render [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries using a volumetric 3D shape (e.g., a sphere or cylinder) with a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols. [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) features may also be rendered with ObjectSymbol3DLayers, but the object symbol layer must be contained in a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html), not a [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) in this scenario.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html)
  */
class ObjectSymbol3DLayerCls ()
  extends typings.arcgisJsApi.esri.ObjectSymbol3DLayer {
  def this(properties: ObjectSymbol3DLayerProperties) = this()
}

