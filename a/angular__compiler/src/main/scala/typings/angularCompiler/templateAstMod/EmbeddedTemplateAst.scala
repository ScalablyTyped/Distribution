package typings.angularCompiler.templateAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/src/template_parser/template_ast", "EmbeddedTemplateAst")
@js.native
class EmbeddedTemplateAst protected () extends TemplateAst {
  def this(
    attrs: js.Array[AttrAst],
    outputs: js.Array[BoundEventAst],
    references: js.Array[ReferenceAst],
    variables: js.Array[VariableAst],
    directives: js.Array[DirectiveAst],
    providers: js.Array[ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: ParseSourceSpan
  ) = this()
  var attrs: js.Array[AttrAst] = js.native
  var children: js.Array[TemplateAst] = js.native
  var directives: js.Array[DirectiveAst] = js.native
  var hasViewContainer: Boolean = js.native
  var ngContentIndex: Double = js.native
  var outputs: js.Array[BoundEventAst] = js.native
  var providers: js.Array[ProviderAst] = js.native
  var queryMatches: js.Array[QueryMatch] = js.native
  var references: js.Array[ReferenceAst] = js.native
  var variables: js.Array[VariableAst] = js.native
}

