package typings.aframe.mod.THREE

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.CubeCamera")
@js.native
class CubeCamera protected ()
  extends typings.three.mod.CubeCamera {
  def this(
    near: Double,
    far: Double,
    renderTarget: typings.three.webGLCubeRenderTargetMod.WebGLCubeRenderTarget
  ) = this()
}
