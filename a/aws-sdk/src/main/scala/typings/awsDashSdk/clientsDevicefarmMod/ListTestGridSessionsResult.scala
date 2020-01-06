package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTestGridSessionsResult extends js.Object {
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The sessions that match the criteria in a ListTestGridSessionsRequest. 
    */
  var testGridSessions: js.UndefOr[TestGridSessions] = js.native
}

object ListTestGridSessionsResult {
  @scala.inline
  def apply(nextToken: PaginationToken = null, testGridSessions: TestGridSessions = null): ListTestGridSessionsResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (testGridSessions != null) __obj.updateDynamic("testGridSessions")(testGridSessions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionsResult]
  }
}

