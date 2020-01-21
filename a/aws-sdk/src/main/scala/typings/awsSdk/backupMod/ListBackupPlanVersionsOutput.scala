package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBackupPlanVersionsOutput extends js.Object {
  /**
    * An array of version list items containing metadata about your backup plans.
    */
  var BackupPlanVersionsList: js.UndefOr[typings.awsSdk.backupMod.BackupPlanVersionsList] = js.native
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBackupPlanVersionsOutput {
  @scala.inline
  def apply(BackupPlanVersionsList: BackupPlanVersionsList = null, NextToken: String = null): ListBackupPlanVersionsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanVersionsList != null) __obj.updateDynamic("BackupPlanVersionsList")(BackupPlanVersionsList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBackupPlanVersionsOutput]
  }
}

