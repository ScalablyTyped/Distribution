package typings.angularCore

import typings.typescript.mod.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpression extends js.Object {
  var expression: CallExpression
}

object AnonExpression {
  @scala.inline
  def apply(expression: CallExpression): AnonExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExpression]
  }
}

