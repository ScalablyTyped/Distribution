package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResponse extends js.Object {
  /**
    * An array of responses, one for each activity that was performed by the campaign.
    */
  var Item: ListOfActivityResponse
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ActivitiesResponse {
  @scala.inline
  def apply(Item: ListOfActivityResponse, NextToken: __string = null): ActivitiesResponse = {
    val __obj = js.Dynamic.literal(Item = Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ActivitiesResponse]
  }
}

