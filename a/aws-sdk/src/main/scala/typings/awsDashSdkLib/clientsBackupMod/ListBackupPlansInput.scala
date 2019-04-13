package typings
package awsDashSdkLib.clientsBackupMod

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
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The next item following a partial list of returned items. For example, if a request is made to return maxResults number of items, NextToken allows you to return more items in your list starting at the location pointed to by the next token.
    */
  var NextToken: js.UndefOr[java.lang.String] = js.undefined
}

object ListBackupPlansInput {
  @scala.inline
  def apply(
    IncludeDeleted: js.UndefOr[Boolean] = js.undefined,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: java.lang.String = null
  ): ListBackupPlansInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IncludeDeleted)) __obj.updateDynamic("IncludeDeleted")(IncludeDeleted)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBackupPlansInput]
  }
}

