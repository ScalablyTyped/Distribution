package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupPlanVersionsInput extends js.Object {
  /**
    * Uniquely identifies a backup plan.
    */
  var BackupPlanId: String
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsBackupMod.MaxResults] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListBackupPlanVersionsInput {
  @scala.inline
  def apply(BackupPlanId: String, MaxResults: js.UndefOr[MaxResults] = js.undefined, NextToken: String = null): ListBackupPlanVersionsInput = {
    val __obj = js.Dynamic.literal(BackupPlanId = BackupPlanId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupPlanVersionsInput]
  }
}

