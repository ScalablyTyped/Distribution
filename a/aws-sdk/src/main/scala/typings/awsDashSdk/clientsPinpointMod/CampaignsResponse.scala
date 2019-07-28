package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignsResponse extends js.Object {
  /**
    * An array of responses, one for each campaign that's associated with the application.
    */
  var Item: ListOfCampaignResponse
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object CampaignsResponse {
  @scala.inline
  def apply(Item: ListOfCampaignResponse, NextToken: __string = null): CampaignsResponse = {
    val __obj = js.Dynamic.literal(Item = Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[CampaignsResponse]
  }
}

