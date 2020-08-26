package typings.arcgisJsApi.sketchEdges3DMod

import typings.arcgisJsApi.esri.SketchEdges3D
import typings.arcgisJsApi.esri.SketchEdges3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/edges/SketchEdges3D", JSImport.Namespace)
@js.native
/**
  * SketchEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a sketched line. It can be used to emphasize the form of 3D objects and to improve the three-dimensional spatial understanding. A sketched line aims to look like a hand-drawn line. In architecture this is useful for visualizing planned urban projects.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html)
  */
class Class () extends SketchEdges3D {
  def this(properties: SketchEdges3DProperties) = this()
}

