package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ExpressionSelectorString extends js.Object {
  var expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var selector: java.lang.String
}

object Anon_ExpressionSelectorString {
  @scala.inline
  def apply(
    expression: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    selector: java.lang.String
  ): Anon_ExpressionSelectorString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_ExpressionSelectorString]
  }
}

