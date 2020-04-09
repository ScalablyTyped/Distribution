package typings.angularCompiler.astMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/expression_parser/ast", "ExpressionBinding")
@js.native
class ExpressionBinding protected () extends TemplateBinding {
  def this(sourceSpan: AbsoluteSourceSpan, key: TemplateBindingIdentifier) = this()
  /**
    * @param sourceSpan entire span of the binding.
    * @param key binding name, like ngForOf, ngForTrackBy, ngIf, along with its
    * span. Note that the length of the span may not be the same as
    * `key.source.length`. For example,
    * 1. key.source = ngFor, key.span is for "ngFor"
    * 2. key.source = ngForOf, key.span is for "of"
    * 3. key.source = ngForTrackBy, key.span is for "trackBy"
    * @param value optional expression for the RHS.
    */
  def this(sourceSpan: AbsoluteSourceSpan, key: TemplateBindingIdentifier, value: ASTWithSource) = this()
  val key: TemplateBindingIdentifier = js.native
  val sourceSpan: AbsoluteSourceSpan = js.native
  val value: ASTWithSource | Null = js.native
}

