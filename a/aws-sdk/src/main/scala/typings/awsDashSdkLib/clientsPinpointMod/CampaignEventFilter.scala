package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignEventFilter extends js.Object {
  /**
    * An object that defines the dimensions for the event filter.
    */
  var Dimensions: js.UndefOr[EventDimensions] = js.undefined
  /**
    * The type of event that causes the campaign to be sent. Possible values:
  SYSTEM - Send the campaign when a system event occurs. See the System resource for more information.
  ENDPOINT - Send the campaign when an endpoint event occurs. See the Event resource for more information.
    */
  var FilterType: js.UndefOr[FilterType] = js.undefined
}

object CampaignEventFilter {
  @scala.inline
  def apply(Dimensions: EventDimensions = null, FilterType: FilterType = null): CampaignEventFilter = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (FilterType != null) __obj.updateDynamic("FilterType")(FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CampaignEventFilter]
  }
}

