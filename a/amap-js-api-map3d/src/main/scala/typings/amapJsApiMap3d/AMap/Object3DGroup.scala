package typings.amapJsApiMap3d.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3DGroup")
@js.native
class Object3DGroup[C /* <: Object3D */] () extends Object3D {
  var children: js.Array[C] = js.native
  def add(object3d: C): Unit = js.native
  def remove(object3d: C): Unit = js.native
}

