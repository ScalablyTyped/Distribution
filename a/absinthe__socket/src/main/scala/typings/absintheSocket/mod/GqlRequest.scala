package typings.absintheSocket.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GqlRequest[Variables] extends js.Object {
  var operation: String
  var variables: js.UndefOr[Variables] = js.undefined
}

object GqlRequest {
  @scala.inline
  def apply[Variables](operation: String, variables: Variables = null): GqlRequest[Variables] = {
    val __obj = js.Dynamic.literal(operation = operation.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[GqlRequest[Variables]]
  }
}

