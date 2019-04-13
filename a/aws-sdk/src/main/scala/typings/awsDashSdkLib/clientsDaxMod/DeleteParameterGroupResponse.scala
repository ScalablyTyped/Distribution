package typings
package awsDashSdkLib.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParameterGroupResponse extends js.Object {
  /**
    * A user-specified message for this action (i.e., a reason for deleting the parameter group).
    */
  var DeletionMessage: js.UndefOr[String] = js.undefined
}

object DeleteParameterGroupResponse {
  @scala.inline
  def apply(DeletionMessage: String = null): DeleteParameterGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletionMessage != null) __obj.updateDynamic("DeletionMessage")(DeletionMessage)
    __obj.asInstanceOf[DeleteParameterGroupResponse]
  }
}

