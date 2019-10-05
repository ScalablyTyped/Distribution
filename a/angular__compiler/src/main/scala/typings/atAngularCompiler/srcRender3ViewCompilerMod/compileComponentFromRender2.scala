package typings.atAngularCompiler.srcRender3ViewCompilerMod

import typings.atAngularCompiler.srcCompileUnderscoreMetadataMod.CompileDirectiveMetadata
import typings.atAngularCompiler.srcCompileUnderscoreReflectorMod.CompileReflector
import typings.atAngularCompiler.srcRender3R3UnderscoreTemplateUnderscoreTransformMod.Render3ParseResult
import typings.atAngularCompiler.srcTemplateUnderscoreParserBindingUnderscoreParserMod.BindingParser
import typings.atAngularCompiler.srcUtilMod.OutputContext
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

