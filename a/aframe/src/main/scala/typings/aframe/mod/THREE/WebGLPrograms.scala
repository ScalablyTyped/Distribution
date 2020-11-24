package typings.aframe.mod.THREE

import typings.three.webGLBindingStatesMod.WebGLBindingStates
import typings.three.webGLCubeMapsMod.WebGLCubeMaps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aframe", "THREE.WebGLPrograms")
@js.native
class WebGLPrograms protected ()
  extends typings.three.mod.WebGLPrograms {
  def this(
    renderer: typings.three.webGLRendererMod.WebGLRenderer,
    cubemaps: WebGLCubeMaps,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    capabilities: typings.three.webGLCapabilitiesMod.WebGLCapabilities,
    bindingStates: WebGLBindingStates,
    clipping: typings.three.webGLClippingMod.WebGLClipping
  ) = this()
}
