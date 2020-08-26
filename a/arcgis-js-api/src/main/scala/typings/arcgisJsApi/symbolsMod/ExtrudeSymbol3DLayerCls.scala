package typings.arcgisJsApi.symbolsMod

import typings.arcgisJsApi.esri.ExtrudeSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "ExtrudeSymbol3DLayer")
@js.native
/**
  * ExtrudeSymbol3DLayer is used to render [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries by extruding them upward from the ground, creating a 3D volumetric object. This is done with a [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ExtrudeSymbol3DLayer.html)
  */
class ExtrudeSymbol3DLayerCls ()
  extends typings.arcgisJsApi.esri.ExtrudeSymbol3DLayer {
  def this(properties: ExtrudeSymbol3DLayerProperties) = this()
}

