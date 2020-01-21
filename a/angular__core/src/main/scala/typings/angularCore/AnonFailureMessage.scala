package typings.angularCore

import typings.typescript.mod.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFailureMessage extends js.Object {
  /** Failure message which is set when the query could not be transformed successfully. */
  var failureMessage: String | Null
  /** Transformed call expression. */
  var node: CallExpression
}

object AnonFailureMessage {
  @scala.inline
  def apply(node: CallExpression, failureMessage: String = null): AnonFailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFailureMessage]
  }
}

