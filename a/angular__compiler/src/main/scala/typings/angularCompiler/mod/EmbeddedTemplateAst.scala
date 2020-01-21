package typings.angularCompiler.mod

import typings.angularCompiler.templateAstMod.QueryMatch
import typings.angularCompiler.templateAstMod.TemplateAst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler", "EmbeddedTemplateAst")
@js.native
class EmbeddedTemplateAst protected ()
  extends typings.angularCompiler.publicApiMod.EmbeddedTemplateAst {
  def this(
    attrs: js.Array[typings.angularCompiler.templateAstMod.AttrAst],
    outputs: js.Array[typings.angularCompiler.templateAstMod.BoundEventAst],
    references: js.Array[typings.angularCompiler.templateAstMod.ReferenceAst],
    variables: js.Array[typings.angularCompiler.templateAstMod.VariableAst],
    directives: js.Array[typings.angularCompiler.templateAstMod.DirectiveAst],
    providers: js.Array[typings.angularCompiler.templateAstMod.ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
  ) = this()
}

