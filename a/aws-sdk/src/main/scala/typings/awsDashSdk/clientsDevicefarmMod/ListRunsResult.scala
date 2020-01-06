package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListRunsResult extends js.Object {
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * Information about the runs.
    */
  var runs: js.UndefOr[Runs] = js.native
}

object ListRunsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, runs: Runs = null): ListRunsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (runs != null) __obj.updateDynamic("runs")(runs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRunsResult]
  }
}

