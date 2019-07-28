package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDirectoriesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The state of the directories in the list. Can be either Enabled, Disabled, or Deleted.
    */
  var state: js.UndefOr[DirectoryState] = js.undefined
}

object ListDirectoriesRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    state: DirectoryState = null
  ): ListDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDirectoriesRequest]
  }
}

