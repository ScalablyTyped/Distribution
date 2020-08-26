package typings.arcgisJsApi.symbolsMod

import typings.arcgisJsApi.esri.PathSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "PathSymbol3DLayer")
@js.native
/**
  * PathSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries by extruding a 2D profile along the line. A PathSymbol3DLayer must be added to the `symbolLayers` property of a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html). This is a 3D symbol, therefore it is only supported in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PathSymbol3DLayer.html)
  */
class PathSymbol3DLayerCls ()
  extends typings.arcgisJsApi.esri.PathSymbol3DLayer {
  def this(properties: PathSymbol3DLayerProperties) = this()
}

