package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SolidEdges3D extends Edges3D {
  /**
    * For SolidEdges3D the type is always `solid`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html#type)
    */
  var `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.solid = js.native
}

@JSGlobal("__esri.SolidEdges3D")
@js.native
/**
  * SolidEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a solid line. It can be used to emphasize the form of 3D objects and to improve the three-dimensional spatial understanding.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SolidEdges3D.html)
  */
class SolidEdges3DCls () extends SolidEdges3D {
  def this(properties: SolidEdges3DProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

