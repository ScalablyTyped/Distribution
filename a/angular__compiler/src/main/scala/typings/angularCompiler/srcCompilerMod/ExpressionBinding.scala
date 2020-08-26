package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.astMod.TemplateBindingIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "ExpressionBinding")
@js.native
class ExpressionBinding protected ()
  extends typings.angularCompiler.astMod.ExpressionBinding {
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
  def this(sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan, key: TemplateBindingIdentifier) = this()
  def this(
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    key: TemplateBindingIdentifier,
    value: typings.angularCompiler.astMod.ASTWithSource
  ) = this()
}

