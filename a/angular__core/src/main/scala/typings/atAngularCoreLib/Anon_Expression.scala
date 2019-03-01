package typings
package atAngularCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expression extends js.Object {
  var expression: js.Any
  var selector: java.lang.String
}

object Anon_Expression {
  @scala.inline
  def apply(expression: js.Any, selector: java.lang.String): Anon_Expression = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("selector")(selector)
    __obj.asInstanceOf[Anon_Expression]
  }
}

