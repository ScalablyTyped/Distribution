package typings.angularCompiler.templateAstMod

import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/template_parser/template_ast", "ElementAst")
@js.native
class ElementAst protected () extends TemplateAst {
  def this(
    name: String,
    attrs: js.Array[AttrAst],
    inputs: js.Array[BoundElementPropertyAst],
    outputs: js.Array[BoundEventAst],
    references: js.Array[ReferenceAst],
    directives: js.Array[DirectiveAst],
    providers: js.Array[ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[AttrAst],
    inputs: js.Array[BoundElementPropertyAst],
    outputs: js.Array[BoundEventAst],
    references: js.Array[ReferenceAst],
    directives: js.Array[DirectiveAst],
    providers: js.Array[ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Null,
    sourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[AttrAst],
    inputs: js.Array[BoundElementPropertyAst],
    outputs: js.Array[BoundEventAst],
    references: js.Array[ReferenceAst],
    directives: js.Array[DirectiveAst],
    providers: js.Array[ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Double,
    sourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan
  ) = this()
  def this(
    name: String,
    attrs: js.Array[AttrAst],
    inputs: js.Array[BoundElementPropertyAst],
    outputs: js.Array[BoundEventAst],
    references: js.Array[ReferenceAst],
    directives: js.Array[DirectiveAst],
    providers: js.Array[ProviderAst],
    hasViewContainer: Boolean,
    queryMatches: js.Array[QueryMatch],
    children: js.Array[TemplateAst],
    ngContentIndex: Null,
    sourceSpan: ParseSourceSpan,
    endSourceSpan: ParseSourceSpan
  ) = this()
  var attrs: js.Array[AttrAst] = js.native
  var children: js.Array[TemplateAst] = js.native
  var directives: js.Array[DirectiveAst] = js.native
  var endSourceSpan: ParseSourceSpan | Null = js.native
  var hasViewContainer: Boolean = js.native
  var inputs: js.Array[BoundElementPropertyAst] = js.native
  var name: String = js.native
  var ngContentIndex: Double | Null = js.native
  var outputs: js.Array[BoundEventAst] = js.native
  var providers: js.Array[ProviderAst] = js.native
  var queryMatches: js.Array[QueryMatch] = js.native
  var references: js.Array[ReferenceAst] = js.native
}

