package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selector extends js.Object {
  var expression: js.Any
  var selector: String
}

object Selector {
  @scala.inline
  def apply(expression: js.Any, selector: String): Selector = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
}

