package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceAssociationStatusInfo extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationId] = js.native
  /**
    * The name of the association applied to the instance.
    */
  var AssociationName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationName] = js.native
  /**
    * The version of the association applied to the instance.
    */
  var AssociationVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationVersion] = js.native
  /**
    * Detailed status information about the instance association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.native
  /**
    * The association document versions.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.native
  /**
    * An error code returned by the request to create the association.
    */
  var ErrorCode: js.UndefOr[AgentErrorCode] = js.native
  /**
    * The date the instance association ran. 
    */
  var ExecutionDate: js.UndefOr[DateTime] = js.native
  /**
    * Summary information about association execution.
    */
  var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.native
  /**
    * The instance ID where the association was created.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.native
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[DocumentARN] = js.native
  /**
    * A URL for an Amazon S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.native
  /**
    * Status information about the instance association.
    */
  var Status: js.UndefOr[StatusName] = js.native
}

object InstanceAssociationStatusInfo {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationName: AssociationName = null,
    AssociationVersion: AssociationVersion = null,
    DetailedStatus: StatusName = null,
    DocumentVersion: DocumentVersion = null,
    ErrorCode: AgentErrorCode = null,
    ExecutionDate: DateTime = null,
    ExecutionSummary: InstanceAssociationExecutionSummary = null,
    InstanceId: InstanceId = null,
    Name: DocumentARN = null,
    OutputUrl: InstanceAssociationOutputUrl = null,
    Status: StatusName = null
  ): InstanceAssociationStatusInfo = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId.asInstanceOf[js.Any])
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName.asInstanceOf[js.Any])
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion.asInstanceOf[js.Any])
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ExecutionDate != null) __obj.updateDynamic("ExecutionDate")(ExecutionDate.asInstanceOf[js.Any])
    if (ExecutionSummary != null) __obj.updateDynamic("ExecutionSummary")(ExecutionSummary.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputUrl != null) __obj.updateDynamic("OutputUrl")(OutputUrl.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceAssociationStatusInfo]
  }
}

