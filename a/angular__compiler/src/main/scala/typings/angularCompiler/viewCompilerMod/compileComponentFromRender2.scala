package typings.angularCompiler.viewCompilerMod

import typings.angularCompiler.bindingParserMod.BindingParser
import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.r3TemplateTransformMod.Render3ParseResult
import typings.angularCompiler.srcUtilMod.OutputContext
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/render3/view/compiler", "compileComponentFromRender2")
@js.native
object compileComponentFromRender2 extends js.Object {
  
  def apply(
    outputCtx: OutputContext,
    component: CompileDirectiveMetadata,
    render3Ast: Render3ParseResult,
    reflector: CompileReflector,
    bindingParser: BindingParser,
    directiveTypeBySel: Map[String, _],
    pipeTypeByName: Map[String, _]
  ): Unit = js.native
}
