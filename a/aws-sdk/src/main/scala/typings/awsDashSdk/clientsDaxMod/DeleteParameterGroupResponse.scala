package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParameterGroupResponse extends js.Object {
  /**
    * A user-specified message for this action (i.e., a reason for deleting the parameter group).
    */
  var DeletionMessage: js.UndefOr[String] = js.native
}

object DeleteParameterGroupResponse {
  @scala.inline
  def apply(DeletionMessage: String = null): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletionMessage != null) __obj.updateDynamic("DeletionMessage")(DeletionMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
}

