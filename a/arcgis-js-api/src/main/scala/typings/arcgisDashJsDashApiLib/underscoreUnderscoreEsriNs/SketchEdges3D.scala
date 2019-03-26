package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchEdges3D extends Edges3D {
  /**
    * For SketchEdges3D the type is always `sketch`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html#type)
    */
  var `type`: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sketch = js.native
}

@JSGlobal("__esri.SketchEdges3D")
@js.native
/**
  * SketchEdges3D is a symbol type that visualizes edges of [3D Object SceneLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), extruded polygons or mesh geometries with a sketched line. It can be used to emphasize the form of 3D objects and to improve the three-dimensional spatial understanding. A sketched line aims to look like a hand-drawn line. In architecture this is useful for visualizing planned urban projects.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-edges-SketchEdges3D.html)
  */
class SketchEdges3DCls () extends SketchEdges3D {
  def this(properties: SketchEdges3DProperties) = this()
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

