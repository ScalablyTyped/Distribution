package typings.awsDashSdk.clientsDaxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSubnetGroupResponse extends js.Object {
  /**
    * A user-specified message for this action (i.e., a reason for deleting the subnet group).
    */
  var DeletionMessage: js.UndefOr[String] = js.undefined
}

object DeleteSubnetGroupResponse {
  @scala.inline
  def apply(DeletionMessage: String = null): DeleteSubnetGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletionMessage != null) __obj.updateDynamic("DeletionMessage")(DeletionMessage)
    __obj.asInstanceOf[DeleteSubnetGroupResponse]
  }
}

