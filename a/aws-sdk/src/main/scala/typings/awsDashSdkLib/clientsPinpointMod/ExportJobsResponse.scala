package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExportJobsResponse extends js.Object {
  /**
    * A list of export jobs for the application.
    */
  var Item: js.UndefOr[ListOfExportJobResponse] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ExportJobsResponse {
  @scala.inline
  def apply(Item: ListOfExportJobResponse = null, NextToken: __string = null): ExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ExportJobsResponse]
  }
}

