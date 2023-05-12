package typings.aframe.mod.global.AFRAME.THREE

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("AFRAME.THREE.CubeCamera")
@js.native
open class CubeCamera protected ()
  extends typings.three.mod.CubeCamera {
  /**
    * Constructs a {@link CubeCamera} that contains 6 {@link PerspectiveCamera | PerspectiveCameras} that render to a {@link THREE.WebGLCubeRenderTarget | WebGLCubeRenderTarget}.
    * @param near The near clipping distance.
    * @param far The far clipping distance.
    * @param renderTarget The destination cube render target.
    */
  def this(
    near: Double,
    far: Double,
    renderTarget: typings.three.srcRenderersWebGLCubeRenderTargetMod.WebGLCubeRenderTarget
  ) = this()
}
