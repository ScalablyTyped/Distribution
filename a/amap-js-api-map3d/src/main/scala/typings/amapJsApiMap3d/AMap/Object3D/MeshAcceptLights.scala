package typings.amapJsApiMap3d.AMap.Object3D

import typings.amapJsApiMap3d.anon.MeshreadonlyvertexNormals
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshAcceptLights extends Mesh {
  @JSName("geometry")
  val geometry_MeshAcceptLights: MeshreadonlyvertexNormals
}

object MeshAcceptLights {
  @scala.inline
  def apply(
    DEPTH_TEST: Boolean,
    geometry: MeshreadonlyvertexNormals,
    needUpdate: Boolean,
    reDraw: () => Unit,
    reset: () => Unit,
    textures: js.Array[String | HTMLCanvasElement],
    transparent: Boolean
  ): MeshAcceptLights = {
    val __obj = js.Dynamic.literal(DEPTH_TEST = DEPTH_TEST.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], needUpdate = needUpdate.asInstanceOf[js.Any], reDraw = js.Any.fromFunction0(reDraw), reset = js.Any.fromFunction0(reset), textures = textures.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshAcceptLights]
  }
}

