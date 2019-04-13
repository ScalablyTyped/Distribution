package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivitiesResponse extends js.Object {
  /**
    * List of campaign activities
    */
  var Item: js.UndefOr[ListOfActivityResponse] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ActivitiesResponse {
  @scala.inline
  def apply(Item: ListOfActivityResponse = null, NextToken: __string = null): ActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ActivitiesResponse]
  }
}

