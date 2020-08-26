package typings.arcgisJsApi.symbolsMod

import typings.arcgisJsApi.esri.LineSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "LineSymbol3DLayer")
@js.native
/**
  * LineSymbol3DLayer renders [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries using a flat 2D line with a [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) in a 3D [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html)
  */
class LineSymbol3DLayerCls ()
  extends typings.arcgisJsApi.esri.LineSymbol3DLayer {
  def this(properties: LineSymbol3DLayerProperties) = this()
}

