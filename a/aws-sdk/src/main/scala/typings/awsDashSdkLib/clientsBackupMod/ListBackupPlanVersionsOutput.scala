package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupPlanVersionsOutput extends js.Object {
  /**
    * An array of version list items containing metadata about your backup plans.
    */
  var BackupPlanVersionsList: js.UndefOr[BackupPlanVersionsList] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListBackupPlanVersionsOutput {
  @scala.inline
  def apply(BackupPlanVersionsList: BackupPlanVersionsList = null, NextToken: java.lang.String = null): ListBackupPlanVersionsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupPlanVersionsList != null) __obj.updateDynamic("BackupPlanVersionsList")(BackupPlanVersionsList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupPlanVersionsOutput]
  }
}

