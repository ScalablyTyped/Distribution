package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignEventFilter extends js.Object {
  /**
    * The dimension settings of the event filter for the campaign.
    */
  var Dimensions: EventDimensions
  /**
    * The type of event that causes the campaign to be sent. Valid values are: SYSTEM, sends the campaign when a system event occurs; and, ENDPOINT, sends the campaign when an endpoint event (Events resource) occurs.
    */
  var FilterType: awsDashSdkLib.clientsPinpointMod.FilterType
}

object CampaignEventFilter {
  @scala.inline
  def apply(Dimensions: EventDimensions, FilterType: FilterType): CampaignEventFilter = {
    val __obj = js.Dynamic.literal(Dimensions = Dimensions, FilterType = FilterType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CampaignEventFilter]
  }
}

