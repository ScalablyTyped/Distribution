package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetEventSelectorsResponse extends js.Object {
  /**
    * The event selectors that are configured for the trail.
    */
  var EventSelectors: js.UndefOr[EventSelectors] = js.undefined
  /**
    * The specified trail ARN that has the event selectors.
    */
  var TrailARN: js.UndefOr[String] = js.undefined
}

object GetEventSelectorsResponse {
  @scala.inline
  def apply(EventSelectors: EventSelectors = null, TrailARN: String = null): GetEventSelectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSelectors != null) __obj.updateDynamic("EventSelectors")(EventSelectors)
    if (TrailARN != null) __obj.updateDynamic("TrailARN")(TrailARN)
    __obj.asInstanceOf[GetEventSelectorsResponse]
  }
}

