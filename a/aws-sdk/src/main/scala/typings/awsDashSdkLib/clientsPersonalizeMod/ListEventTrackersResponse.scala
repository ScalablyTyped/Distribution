package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListEventTrackersResponse extends js.Object {
  /**
    * A list of event trackers.
    */
  var eventTrackers: js.UndefOr[EventTrackers] = js.undefined
  /**
    * A token for getting the next set of event trackers (if they exist).
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListEventTrackersResponse {
  @scala.inline
  def apply(eventTrackers: EventTrackers = null, nextToken: NextToken = null): ListEventTrackersResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTrackers != null) __obj.updateDynamic("eventTrackers")(eventTrackers)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListEventTrackersResponse]
  }
}

