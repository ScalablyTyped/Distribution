package typings.arcgisJsApi.symbolsMod

import typings.arcgisJsApi.esri.FillSymbol3DLayerProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols", "FillSymbol3DLayer")
@js.native
/**
  * FillSymbol3DLayer is used to render the surfaces of flat 2D [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometries and 3D volumetric meshes in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) does not support 3D symbols.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol3DLayer.html)
  */
class FillSymbol3DLayerCls ()
  extends typings.arcgisJsApi.esri.FillSymbol3DLayer {
  def this(properties: FillSymbol3DLayerProperties) = this()
}

