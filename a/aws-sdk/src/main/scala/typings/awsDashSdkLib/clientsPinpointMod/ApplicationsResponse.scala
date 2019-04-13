package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResponse extends js.Object {
  /**
    * List of applications returned in this page.
    */
  var Item: js.UndefOr[ListOfApplicationResponse] = js.undefined
  /**
    * The string that you use in a subsequent request to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ApplicationsResponse {
  @scala.inline
  def apply(Item: ListOfApplicationResponse = null, NextToken: __string = null): ApplicationsResponse = {
    val __obj = js.Dynamic.literal()
    if (Item != null) __obj.updateDynamic("Item")(Item)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ApplicationsResponse]
  }
}

