package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationExecution extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[AssociationId] = js.undefined
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
  /**
    * The time the execution started.
    */
  var CreatedTime: js.UndefOr[DateTime] = js.undefined
  /**
    * Detailed status information about the execution.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  /**
    * The execution ID for the association. If the association does not run at intervals or according to a schedule, then the ExecutionID is the same as the AssociationID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * An aggregate status of the resources in the execution based on the status type.
    */
  var ResourceCountByStatus: js.UndefOr[ResourceCountByStatus] = js.undefined
  /**
    * The status of the association execution.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
}

object AssociationExecution {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationVersion: AssociationVersion = null,
    CreatedTime: DateTime = null,
    DetailedStatus: StatusName = null,
    ExecutionId: AssociationExecutionId = null,
    LastExecutionDate: DateTime = null,
    ResourceCountByStatus: ResourceCountByStatus = null,
    Status: StatusName = null
  ): AssociationExecution = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus)
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId)
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate)
    if (ResourceCountByStatus != null) __obj.updateDynamic("ResourceCountByStatus")(ResourceCountByStatus)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[AssociationExecution]
  }
}

