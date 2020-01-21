package typings.amapJsApiMap3d.AMap

import typings.amapJsApiMap3d.amapJsApiMap3dStrings.line
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.mesh
import typings.amapJsApiMap3d.amapJsApiMap3dStrings.points
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Geometry3D")
@js.native
abstract class Geometry3D () extends js.Object {
  val vertexColors: js.Array[Double] = js.native
  val vertexUVs: js.Array[Double] = js.native
  val vertices: js.Array[Double] = js.native
}

@JSGlobal("AMap.Geometry3D")
@js.native
object Geometry3D extends js.Object {
  @js.native
  class Line () extends Geometry3D {
    val segments: js.Array[Double] = js.native
    val textureIndices: js.Array[Double] = js.native
    val `type`: line = js.native
  }
  
  @js.native
  class Mesh () extends Geometry3D {
    val faces: js.Array[Double] = js.native
    val textureIndices: js.Array[Double] = js.native
    val `type`: mesh = js.native
  }
  
  @js.native
  class Points () extends Geometry3D {
    val pointAreas: js.Array[Double] = js.native
    val pointSizes: js.Array[Double] = js.native
    val textureIndices: js.Array[Double] = js.native
    val `type`: points = js.native
  }
  
}

