package typings.arcgisDashJsDashApi.esriSymbolsEdgesSolidEdges3DMod

import typings.arcgisDashJsDashApi.__esri.SolidEdges3D
import typings.arcgisDashJsDashApi.__esri.SolidEdges3DProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/symbols/edges/SolidEdges3D", JSImport.Namespace)
@js.native
/**
  * SolidEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a solid line. It can be used to emphasize the form of 3D objects and to improve the three-dimensional spatial understanding.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html)
  */
class Class () extends SolidEdges3D {
  def this(properties: SolidEdges3DProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

