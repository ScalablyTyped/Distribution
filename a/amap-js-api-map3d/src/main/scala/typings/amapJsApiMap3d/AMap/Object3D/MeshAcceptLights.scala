package typings.amapJsApiMap3d.AMap.Object3D

import typings.amapJsApiMap3d.anon.MeshreadonlyvertexNormals
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshAcceptLights extends Mesh {
  @JSName("geometry")
  val geometry_MeshAcceptLights: MeshreadonlyvertexNormals = js.native
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
  @scala.inline
  implicit class MeshAcceptLightsOps[Self <: MeshAcceptLights] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometry(value: MeshreadonlyvertexNormals): Self = this.set("geometry", value.asInstanceOf[js.Any])
  }
  
}

