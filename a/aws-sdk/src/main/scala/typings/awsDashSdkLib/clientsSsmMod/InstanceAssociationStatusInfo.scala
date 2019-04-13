package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceAssociationStatusInfo extends js.Object {
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[AssociationId] = js.undefined
  /**
    * The name of the association applied to the instance.
    */
  var AssociationName: js.UndefOr[AssociationName] = js.undefined
  /**
    * The version of the association applied to the instance.
    */
  var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
  /**
    * Detailed status information about the instance association.
    */
  var DetailedStatus: js.UndefOr[StatusName] = js.undefined
  /**
    * The association document verions.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * An error code returned by the request to create the association.
    */
  var ErrorCode: js.UndefOr[AgentErrorCode] = js.undefined
  /**
    * The date the instance association ran. 
    */
  var ExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * Summary information about association execution.
    */
  var ExecutionSummary: js.UndefOr[InstanceAssociationExecutionSummary] = js.undefined
  /**
    * The instance ID where the association was created.
    */
  var InstanceId: js.UndefOr[InstanceId] = js.undefined
  /**
    * The name of the association.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * A URL for an Amazon S3 bucket where you want to store the results of this request.
    */
  var OutputUrl: js.UndefOr[InstanceAssociationOutputUrl] = js.undefined
  /**
    * Status information about the instance association.
    */
  var Status: js.UndefOr[StatusName] = js.undefined
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
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (DetailedStatus != null) __obj.updateDynamic("DetailedStatus")(DetailedStatus)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode)
    if (ExecutionDate != null) __obj.updateDynamic("ExecutionDate")(ExecutionDate)
    if (ExecutionSummary != null) __obj.updateDynamic("ExecutionSummary")(ExecutionSummary)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OutputUrl != null) __obj.updateDynamic("OutputUrl")(OutputUrl)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[InstanceAssociationStatusInfo]
  }
}

