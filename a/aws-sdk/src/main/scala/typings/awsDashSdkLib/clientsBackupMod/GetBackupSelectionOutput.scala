package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBackupSelectionOutput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the body of a request to assign a set of resources to a backup plan. It includes an array of resources, an optional array of patterns to exclude resources, an optional role to provide access to the AWS service that the resource belongs to, and an optional array of tags used to identify a set of resources.
    */
  var BackupSelection: js.UndefOr[BackupSelection] = js.undefined
  /**
    * The date and time a backup selection is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.undefined
  /**
    * A unique string that identifies the request and allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Uniquely identifies the body of a request to assign a set of resources to a backup plan.
    */
  var SelectionId: js.UndefOr[java.lang.String] = js.undefined
}

object GetBackupSelectionOutput {
  @scala.inline
  def apply(
    BackupPlanId: java.lang.String = null,
    BackupSelection: BackupSelection = null,
    CreationDate: timestamp = null,
    CreatorRequestId: java.lang.String = null,
    SelectionId: java.lang.String = null
  ): GetBackupSelectionOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanId != null) __obj.updateDynamic("BackupPlanId")(BackupPlanId)
    if (BackupSelection != null) __obj.updateDynamic("BackupSelection")(BackupSelection)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (CreatorRequestId != null) __obj.updateDynamic("CreatorRequestId")(CreatorRequestId)
    if (SelectionId != null) __obj.updateDynamic("SelectionId")(SelectionId)
    __obj.asInstanceOf[GetBackupSelectionOutput]
  }
}

