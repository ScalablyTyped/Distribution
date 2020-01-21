package typings.astTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParenthesized extends js.Object {
  var parenthesized: Boolean
}

object AnonParenthesized {
  @scala.inline
  def apply(parenthesized: Boolean): AnonParenthesized = {
    val __obj = js.Dynamic.literal(parenthesized = parenthesized.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonParenthesized]
  }
}

