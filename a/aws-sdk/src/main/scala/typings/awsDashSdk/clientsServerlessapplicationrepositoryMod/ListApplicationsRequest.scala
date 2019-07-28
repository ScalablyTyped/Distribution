package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationsRequest extends js.Object {
  /**
    * The total number of items to return.
    */
  var MaxItems: js.UndefOr[typings.awsDashSdk.clientsServerlessapplicationrepositoryMod.MaxItems] = js.undefined
  /**
    * A token to specify where to start paginating.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListApplicationsRequest {
  @scala.inline
  def apply(MaxItems: js.UndefOr[MaxItems] = js.undefined, NextToken: __string = null): ListApplicationsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxItems)) __obj.updateDynamic("MaxItems")(MaxItems)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListApplicationsRequest]
  }
}

