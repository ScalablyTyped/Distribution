package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportJobsResponse extends js.Object {
  /**
    * An array of responses, one for each import job that's associated with the application (Import Jobs resource) or segment (Segment Import Jobs resource).
    */
  var Item: ListOfImportJobResponse
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ImportJobsResponse {
  @scala.inline
  def apply(Item: ListOfImportJobResponse, NextToken: __string = null): ImportJobsResponse = {
    val __obj = js.Dynamic.literal(Item = Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ImportJobsResponse]
  }
}

