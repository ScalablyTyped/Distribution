package typings.angularCompiler.srcCompilerMod

import typings.angularCompiler.astMod.TemplateBindingIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/compiler", "VariableBinding")
@js.native
class VariableBinding protected ()
  extends typings.angularCompiler.astMod.VariableBinding {
  def this(sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan, key: TemplateBindingIdentifier) = this()
  /**
    * @param sourceSpan entire span of the binding.
    * @param key name of the LHS along with its span.
    * @param value optional value for the RHS along with its span.
    */
  def this(
    sourceSpan: typings.angularCompiler.astMod.AbsoluteSourceSpan,
    key: TemplateBindingIdentifier,
    value: TemplateBindingIdentifier
  ) = this()
}

