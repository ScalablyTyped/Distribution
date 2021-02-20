package typings.angularCompiler.compilerMod

import typings.angularCompiler.compileMetadataMod.CompileDirectiveSummary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "DirectiveAst")
@js.native
class DirectiveAst protected ()
  extends typings.angularCompiler.publicApiMod.DirectiveAst {
  def this(
    directive: CompileDirectiveSummary,
    inputs: js.Array[typings.angularCompiler.templateAstMod.BoundDirectivePropertyAst],
    hostProperties: js.Array[typings.angularCompiler.templateAstMod.BoundElementPropertyAst],
    hostEvents: js.Array[typings.angularCompiler.templateAstMod.BoundEventAst],
    contentQueryStartId: Double,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}
