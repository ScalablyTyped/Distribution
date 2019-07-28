package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUpdatesResponse extends js.Object {
  /**
    * The nextToken value to include in a future ListUpdates request. When the results of a ListUpdates request exceed maxResults, you can use this value to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  /**
    * A list of all the updates for the specified cluster and Region.
    */
  var updateIds: js.UndefOr[StringList] = js.undefined
}

object ListUpdatesResponse {
  @scala.inline
  def apply(nextToken: String = null, updateIds: StringList = null): ListUpdatesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (updateIds != null) __obj.updateDynamic("updateIds")(updateIds)
    __obj.asInstanceOf[ListUpdatesResponse]
  }
}

