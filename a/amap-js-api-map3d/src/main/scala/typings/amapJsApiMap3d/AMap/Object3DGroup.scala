package typings.amapJsApiMap3d.AMap

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object3DGroup[C /* <: Object3D */] extends Object3D {
  var children: js.Array[C]
  def add(object3d: C): Unit
  def remove(object3d: C): Unit
}

object Object3DGroup {
  @scala.inline
  def apply[C](
    DEPTH_TEST: Boolean,
    add: C => Unit,
    children: js.Array[C],
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    remove: C => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3DGroup[C] = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), children = children.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3DGroup[C]]
  }
}

