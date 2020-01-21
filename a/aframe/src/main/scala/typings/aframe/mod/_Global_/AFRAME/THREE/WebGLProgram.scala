package typings.aframe.mod._Global_.AFRAME.THREE

import typings.three.webGLRendererMod.WebGLRendererParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AFRAME.THREE.WebGLProgram")
@js.native
class WebGLProgram protected ()
  extends typings.three.mod.WebGLProgram {
  def this(
    renderer: typings.three.webGLRendererMod.WebGLRenderer,
    extensions: typings.three.webGLExtensionsMod.WebGLExtensions,
    code: String,
    material: typings.three.shaderMaterialMod.ShaderMaterial,
    shader: typings.three.webGLShaderMod.WebGLShader,
    parameters: WebGLRendererParameters
  ) = this()
}

