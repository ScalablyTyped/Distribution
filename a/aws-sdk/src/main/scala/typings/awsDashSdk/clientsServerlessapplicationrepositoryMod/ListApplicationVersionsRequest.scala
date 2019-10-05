package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListApplicationVersionsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the application.
    */
  var ApplicationId: __string
  /**
    * The total number of items to return.
    */
  var MaxItems: js.UndefOr[typings.awsDashSdk.clientsServerlessapplicationrepositoryMod.MaxItems] = js.undefined
  /**
    * A token to specify where to start paginating.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListApplicationVersionsRequest {
  @scala.inline
  def apply(ApplicationId: __string, MaxItems: Int | Double = null, NextToken: __string = null): ListApplicationVersionsRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId)
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListApplicationVersionsRequest]
  }
}

