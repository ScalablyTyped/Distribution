package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupPlansOutput extends js.Object {
  /**
    * An array of backup plan list items containing metadata about your saved backup plans.
    */
  var BackupPlansList: js.UndefOr[typings.awsSdk.backupMod.BackupPlansList] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupPlansOutput {
  @scala.inline
  def apply(BackupPlansList: BackupPlansList = null, NextToken: String = null): ListBackupPlansOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlansList != null) __obj.updateDynamic("BackupPlansList")(BackupPlansList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupPlansOutput]
  }
}

