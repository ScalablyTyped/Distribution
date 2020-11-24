package typings.angularCompiler.viewCompilerMod

import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.srcUtilMod.OutputContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/compiler", "compileDirectiveFromRender2")
@js.native
object compileDirectiveFromRender2 extends js.Object {
  
  def apply(
    outputCtx: OutputContext,
    directive: CompileDirectiveMetadata,
    reflector: CompileReflector,
    bindingParser: BindingParser
  ): Unit = js.native
}
