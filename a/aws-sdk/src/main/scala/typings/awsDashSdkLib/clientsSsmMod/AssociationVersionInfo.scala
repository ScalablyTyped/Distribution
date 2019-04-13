package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociationVersionInfo extends js.Object {
  /**
    * The ID created by the system when the association was created.
    */
  var AssociationId: js.UndefOr[AssociationId] = js.undefined
  /**
    * The name specified for the association version when the association version was created.
    */
  var AssociationName: js.UndefOr[AssociationName] = js.undefined
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[AssociationVersion] = js.undefined
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  /**
    * The date the association version was created.
    */
  var CreatedDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The version of a Systems Manager document used when the association version was created.
    */
  var DocumentVersion: js.UndefOr[DocumentVersion] = js.undefined
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[MaxConcurrency] = js.undefined
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[MaxErrors] = js.undefined
  /**
    * The name specified when the association was created.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * The location in Amazon S3 specified for the association when the association version was created.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  /**
    * Parameters specified when the association version was created.
    */
  var Parameters: js.UndefOr[Parameters] = js.undefined
  /**
    * The cron or rate schedule specified for the association when the association version was created.
    */
  var ScheduleExpression: js.UndefOr[ScheduleExpression] = js.undefined
  /**
    * The targets specified for the association when the association version was created. 
    */
  var Targets: js.UndefOr[Targets] = js.undefined
}

object AssociationVersionInfo {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationName: AssociationName = null,
    AssociationVersion: AssociationVersion = null,
    ComplianceSeverity: AssociationComplianceSeverity = null,
    CreatedDate: DateTime = null,
    DocumentVersion: DocumentVersion = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    Name: DocumentARN = null,
    OutputLocation: InstanceAssociationOutputLocation = null,
    Parameters: Parameters = null,
    ScheduleExpression: ScheduleExpression = null,
    Targets: Targets = null
  ): AssociationVersionInfo = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (ComplianceSeverity != null) __obj.updateDynamic("ComplianceSeverity")(ComplianceSeverity.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency)
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (OutputLocation != null) __obj.updateDynamic("OutputLocation")(OutputLocation)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[AssociationVersionInfo]
  }
}

