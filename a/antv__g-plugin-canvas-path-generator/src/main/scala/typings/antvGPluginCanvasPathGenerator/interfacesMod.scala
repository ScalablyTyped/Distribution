package typings.antvGPluginCanvasPathGenerator

import typings.antvGLite.distTypesMod.ParsedBaseStyleProps
import typings.antvGLite.mod.Syringe.DefinedToken
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/interfaces", "PathGenerator")
  @js.native
  val PathGenerator: DefinedToken = js.native
  type PathGenerator[T /* <: ParsedBaseStyleProps */] = js.Function2[/* context */ CanvasRenderingContext2D, /* attributes */ T, Unit]
  
  @JSImport("@antv/g-plugin-canvas-path-generator/dist/interfaces", "PathGeneratorFactory")
  @js.native
  val PathGeneratorFactory: DefinedToken = js.native
}
