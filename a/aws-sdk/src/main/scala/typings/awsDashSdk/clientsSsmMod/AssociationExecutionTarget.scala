package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationExecutionTarget extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationId] = js.undefined
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationVersion] = js.undefined
  /**
    * Detailed information about the execution status.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  /**
    * The execution ID.
    */
  var ExecutionId: js.UndefOr[AssociationExecutionId] = js.undefined
  /**
    * The date of the last execution.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The location where the association details are saved.
    */
  var OutputSource: js.UndefOr[typings.awsDashSdk.clientsSsmMod.OutputSource] = js.undefined
  /**
    * The resource ID, for example, the instance ID where the association ran.
    */
  var ResourceId: js.UndefOr[AssociationResourceId] = js.undefined
  /**
    * The resource type, for example, instance.
    */
  var ResourceType: js.UndefOr[AssociationResourceType] = js.undefined
  /**
    * The association execution status.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
}

object AssociationExecutionTarget {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationVersion: AssociationVersion = null,
    DetailedStatus: StatusName = null,
    ExecutionId: AssociationExecutionId = null,
    LastExecutionDate: DateTime = null,
    OutputSource: OutputSource = null,
    ResourceId: AssociationResourceId = null,
    ResourceType: AssociationResourceType = null,
    Status: StatusName = null
  ): AssociationExecutionTarget = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus)
    if (ExecutionId != null) __obj.updateDynamic("ExecutionId")(ExecutionId)
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate)
    if (OutputSource != null) __obj.updateDynamic("OutputSource")(OutputSource)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[AssociationExecutionTarget]
  }
}

