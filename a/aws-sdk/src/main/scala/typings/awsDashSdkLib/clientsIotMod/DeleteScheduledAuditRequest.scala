package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteScheduledAuditRequest extends js.Object {
  /**
    * The name of the scheduled audit you want to delete.
    */
  var scheduledAuditName: ScheduledAuditName
}

object DeleteScheduledAuditRequest {
  @scala.inline
  def apply(scheduledAuditName: ScheduledAuditName): DeleteScheduledAuditRequest = {
    val __obj = js.Dynamic.literal(scheduledAuditName = scheduledAuditName)
  
    __obj.asInstanceOf[DeleteScheduledAuditRequest]
  }
}

