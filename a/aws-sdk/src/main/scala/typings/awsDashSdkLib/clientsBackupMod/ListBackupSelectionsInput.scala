package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupSelectionsInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: java.lang.String
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListBackupSelectionsInput {
  @scala.inline
  def apply(
    BackupPlanId: java.lang.String,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: java.lang.String = null
  ): ListBackupSelectionsInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupSelectionsInput]
  }
}

