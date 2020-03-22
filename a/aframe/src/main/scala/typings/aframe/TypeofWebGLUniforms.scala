package typings.aframe

import org.scalablytyped.runtime.Instantiable2
import typings.std.WebGLRenderingContext
import typings.three.mod.WebGLUniforms
import typings.three.webGLProgramMod.WebGLProgram
import typings.three.webGLTexturesMod.WebGLTextures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofWebGLUniforms extends Instantiable2[/* gl */ WebGLRenderingContext, /* program */ WebGLProgram, WebGLUniforms] {
  def seqWithValue(seq: js.Any, values: js.Array[_]): js.Array[_] = js.native
  def upload(gl: WebGLRenderingContext, seq: js.Any, values: js.Array[_], textures: WebGLTextures): Unit = js.native
}

