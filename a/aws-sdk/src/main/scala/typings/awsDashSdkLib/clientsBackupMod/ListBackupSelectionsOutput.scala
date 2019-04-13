package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupSelectionsOutput extends js.Object {
  /**
    * An array of backup selection list items containing metadata about each resource in the list.
    */
  var BackupSelectionsList: js.UndefOr[BackupSelectionsList] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListBackupSelectionsOutput {
  @scala.inline
  def apply(BackupSelectionsList: BackupSelectionsList = null, NextToken: java.lang.String = null): ListBackupSelectionsOutput = {
    val __obj = js.Dynamic.literal()
    if (BackupSelectionsList != null) __obj.updateDynamic("BackupSelectionsList")(BackupSelectionsList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupSelectionsOutput]
  }
}

