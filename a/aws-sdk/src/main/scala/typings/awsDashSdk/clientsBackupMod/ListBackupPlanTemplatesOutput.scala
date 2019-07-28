package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupPlanTemplatesOutput extends js.Object {
  /**
    * An array of template list items containing metadata about your saved templates.
    */
  var BackupPlanTemplatesList: js.UndefOr[typings.awsDashSdk.clientsBackupMod.BackupPlanTemplatesList] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListBackupPlanTemplatesOutput {
  @scala.inline
  def apply(BackupPlanTemplatesList: BackupPlanTemplatesList = null, NextToken: String = null): ListBackupPlanTemplatesOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanTemplatesList != null) __obj.updateDynamic("BackupPlanTemplatesList")(BackupPlanTemplatesList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupPlanTemplatesOutput]
  }
}

