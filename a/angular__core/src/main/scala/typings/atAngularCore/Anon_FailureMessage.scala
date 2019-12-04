package typings.atAngularCore

import typings.typescript.typescriptMod.CallExpression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FailureMessage extends js.Object {
  /** Failure message which is set when the query could not be transformed successfully. */
  var failureMessage: String | Null
  /** Transformed call expression. */
  var node: CallExpression
}

object Anon_FailureMessage {
  @scala.inline
  def apply(node: CallExpression, failureMessage: String = null): Anon_FailureMessage = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    if (failureMessage != null) __obj.updateDynamic("failureMessage")(failureMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FailureMessage]
  }
}

