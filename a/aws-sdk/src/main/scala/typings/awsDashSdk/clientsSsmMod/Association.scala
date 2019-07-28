package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Association extends js.Object {
  /**
    * The ID created by the system when you create an association. An association is a binding between a document and a set of targets with a schedule.
    */
  var AssociationId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationId] = js.undefined
  /**
    * The association name.
    */
  var AssociationName: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationName] = js.undefined
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.AssociationVersion] = js.undefined
  /**
    * The version of the document used in the association.
    */
  var DocumentVersion: js.UndefOr[typings.awsDashSdk.clientsSsmMod.DocumentVersion] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsSsmMod.InstanceId] = js.undefined
  /**
    * The date on which the association was last run.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.undefined
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsDashSdk.clientsSsmMod.ScheduleExpression] = js.undefined
  /**
    * The instances targeted by the request to create an association. 
    */
  var Targets: js.UndefOr[typings.awsDashSdk.clientsSsmMod.Targets] = js.undefined
}

object Association {
  @scala.inline
  def apply(
    AssociationId: AssociationId = null,
    AssociationName: AssociationName = null,
    AssociationVersion: AssociationVersion = null,
    DocumentVersion: DocumentVersion = null,
    InstanceId: InstanceId = null,
    LastExecutionDate: DateTime = null,
    Name: DocumentARN = null,
    Overview: AssociationOverview = null,
    ScheduleExpression: ScheduleExpression = null,
    Targets: Targets = null
  ): Association = {
    val __obj = js.Dynamic.literal()
    if (AssociationId != null) __obj.updateDynamic("AssociationId")(AssociationId)
    if (AssociationName != null) __obj.updateDynamic("AssociationName")(AssociationName)
    if (AssociationVersion != null) __obj.updateDynamic("AssociationVersion")(AssociationVersion)
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (LastExecutionDate != null) __obj.updateDynamic("LastExecutionDate")(LastExecutionDate)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Overview != null) __obj.updateDynamic("Overview")(Overview)
    if (ScheduleExpression != null) __obj.updateDynamic("ScheduleExpression")(ScheduleExpression)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[Association]
  }
}

