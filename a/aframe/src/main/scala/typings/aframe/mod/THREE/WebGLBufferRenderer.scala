package typings.aframe.mod.THREE

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.WebGLBufferRenderer")
@js.native
class WebGLBufferRenderer protected ()
  extends typings.three.mod.WebGLBufferRenderer {
  def this(
    gl: WebGLRenderingContext,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    info: typings.three.webGLInfoMod.WebGLInfo,
    capabilities: typings.three.webGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}
