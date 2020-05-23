package typings.amapJsApiMap3d.global.AMap

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Object3DGroup")
@js.native
class Object3DGroup[C /* <: typings.amapJsApiMap3d.AMap.Object3D */] ()
  extends typings.amapJsApiMap3d.AMap.Object3DGroup[C] {
  /* CompleteClass */
  override var DEPTH_TEST: Boolean = js.native
  /* CompleteClass */
  override var children: js.Array[C] = js.native
  /* CompleteClass */
  override val geometry: typings.amapJsApiMap3d.AMap.Geometry3D = js.native
  /* CompleteClass */
  override var needUpdate: Boolean = js.native
  /* CompleteClass */
  override var textures: js.Array[String | HTMLCanvasElement] = js.native
  /* CompleteClass */
  override var transparent: Boolean = js.native
  /* CompleteClass */
  override def add(object3d: C): Unit = js.native
  /* CompleteClass */
  override def reDraw(): Unit = js.native
  /* CompleteClass */
  override def remove(object3d: C): Unit = js.native
  // internal
  /* CompleteClass */
  override def reset(): Unit = js.native
}

