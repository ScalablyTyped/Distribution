package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyPendingMaintenanceActionMessage extends js.Object {
  /**
    * The pending maintenance action to apply to this resource.
    */
  var ApplyAction: String
  /**
    * A value that specifies the type of opt-in request, or undoes an opt-in request. You can't undo an opt-in request of type immediate. Valid values:    immediate - Apply the maintenance action immediately.    next-maintenance - Apply the maintenance action during the next maintenance window for the resource.    undo-opt-in - Cancel any existing next-maintenance opt-in requests.  
    */
  var OptInType: String
  /**
    * The Amazon Resource Name (ARN) of the AWS DMS resource that the pending maintenance action applies to.
    */
  var ReplicationInstanceArn: String
}

object ApplyPendingMaintenanceActionMessage {
  @scala.inline
  def apply(ApplyAction: String, OptInType: String, ReplicationInstanceArn: String): ApplyPendingMaintenanceActionMessage = {
    val __obj = js.Dynamic.literal(ApplyAction = ApplyAction, OptInType = OptInType, ReplicationInstanceArn = ReplicationInstanceArn)
  
    __obj.asInstanceOf[ApplyPendingMaintenanceActionMessage]
  }
}

