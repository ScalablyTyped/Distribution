package typings.aframe.mod.THREE

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("aframe", "THREE.WebGLState")
@js.native
open class WebGLState protected ()
  extends typings.three.mod.WebGLState {
  def this(
    gl: WebGLRenderingContext,
    extensions: typings.three.srcRenderersWebglWebGLExtensionsMod.WebGLExtensions,
    capabilities: typings.three.srcRenderersWebglWebGLCapabilitiesMod.WebGLCapabilities
  ) = this()
}
