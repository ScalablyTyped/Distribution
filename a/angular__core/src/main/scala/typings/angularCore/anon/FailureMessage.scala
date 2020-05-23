package typings.angularCore.anon

import typings.typescript.mod.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailureMessage extends js.Object {
  /** Failure message which is set when the query could not be transformed successfully. */
  var failureMessage: String | Null
  /** Transformed call expression. */
  var node: CallExpression
}

object FailureMessage {
  @scala.inline
  def apply(node: CallExpression, failureMessage: String = null): FailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailureMessage]
  }
}

