package typings
package aureliaDashBindingLib.aureliaDashBindingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aurelia-binding", "LiteralTemplate")
@js.native
class LiteralTemplate protected () extends Expression {
  def this(cooked: js.Array[java.lang.String]) = this()
  def this(cooked: js.Array[java.lang.String], expressions: js.Array[Expression]) = this()
  def this(cooked: js.Array[java.lang.String], expressions: js.Array[Expression], raw: js.Array[java.lang.String]) = this()
  def this(cooked: js.Array[java.lang.String], expressions: js.Array[Expression], raw: js.Array[java.lang.String], func: AccessKeyed) = this()
  def this(cooked: js.Array[java.lang.String], expressions: js.Array[Expression], raw: js.Array[java.lang.String], func: AccessMember) = this()
  def this(cooked: js.Array[java.lang.String], expressions: js.Array[Expression], raw: js.Array[java.lang.String], func: AccessScope) = this()
  /**
     * The cooked (escaped) string parts of the template.
     * The first item is the TemplateHead. If there is only one item,
     * then this counts as a NoSubstituteTemplate - functionally equivalent
     * to a LiteralString, unless it's tagged.
     */
  var cooked: js.Array[java.lang.String] with aureliaDashBindingLib.Anon_Raw = js.native
  /**
     * The expressions within the template (the parts between `${` and `}`)
     */
  var expressions: js.Array[Expression] = js.native
  /**
     * The tag (function) to be invoked with the LiteralTemplate arguments.
     * The first argument is LiteralTemplate.cooked.
     * The following arguments are the results of evaluating LiteralTemplate.expressions.
     */
  var func: js.UndefOr[AccessScope | AccessMember | AccessKeyed] = js.native
}

