package typings.aframe.mod.THREE

import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aframe", "THREE.WebGLState")
@js.native
class WebGLState protected ()
  extends typings.three.mod.WebGLState {
  def this(
    gl: WebGLRenderingContext,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    capabilities: typings.three.webGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}

