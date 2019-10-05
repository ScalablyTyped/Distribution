package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBackupPlansInput extends js.Object {
  /**
    * A Boolean value with a default value of FALSE that returns deleted backup plans when set to TRUE.
    */
  var IncludeDeleted: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of items to be returned.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsBackupMod.MaxResults] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListBackupPlansInput {
  @scala.inline
  def apply(
    IncludeDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListBackupPlansInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeDeleted)) __obj.updateDynamic("IncludeDeleted")(IncludeDeleted)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupPlansInput]
  }
}

