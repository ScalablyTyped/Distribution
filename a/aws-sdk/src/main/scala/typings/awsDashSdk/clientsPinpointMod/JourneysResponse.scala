package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JourneysResponse extends js.Object {
  /**
    * An array of responses, one for each journey that's associated with the application.
    */
  var Item: ListOfJourneyResponse = js.native
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[__string] = js.native
}

object JourneysResponse {
  @scala.inline
  def apply(Item: ListOfJourneyResponse, NextToken: __string = null): JourneysResponse = {
    val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[JourneysResponse]
  }
}

