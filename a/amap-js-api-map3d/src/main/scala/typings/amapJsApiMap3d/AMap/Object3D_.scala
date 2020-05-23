package typings.amapJsApiMap3d.AMap

import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object3D_ extends js.Object {
  var DEPTH_TEST: Boolean
  val geometry: Geometry3D
  var needUpdate: Boolean
  var textures: js.Array[String | HTMLCanvasElement]
  var transparent: Boolean
  def reDraw(): Unit
  // internal
  def reset(): Unit
}

object Object3D_ {
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    geometry: Geometry3D,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): Object3D_ = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Object3D_]
  }
}

