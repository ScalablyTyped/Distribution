package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProgressUpdateStreamsResult extends js.Object {
  /**
    * If there are more streams created than the max result, return the next token to be passed to the next call as a bookmark of where to start from.
    */
  var NextToken: js.UndefOr[Token] = js.native
  /**
    * List of progress update streams up to the max number of results passed in the input.
    */
  var ProgressUpdateStreamSummaryList: js.UndefOr[typings.awsDashSdk.clientsMigrationhubMod.ProgressUpdateStreamSummaryList] = js.native
}

object ListProgressUpdateStreamsResult {
  @scala.inline
  def apply(NextToken: Token = null, ProgressUpdateStreamSummaryList: ProgressUpdateStreamSummaryList = null): ListProgressUpdateStreamsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ProgressUpdateStreamSummaryList != null) __obj.updateDynamic("ProgressUpdateStreamSummaryList")(ProgressUpdateStreamSummaryList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProgressUpdateStreamsResult]
  }
}

