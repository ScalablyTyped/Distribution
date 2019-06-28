package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationsResponse extends js.Object {
  /**
    * An array of responses, one for each application that was returned.
    */
  var Item: js.UndefOr[ListOfApplicationResponse] = js.undefined
  /**
    * The string to use in a subsequent request to get the next page of results in a paginated response. This value is null if there are no additional pages.
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

