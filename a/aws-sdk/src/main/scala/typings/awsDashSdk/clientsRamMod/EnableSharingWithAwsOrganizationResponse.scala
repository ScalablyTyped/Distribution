package typings.awsDashSdk.clientsRamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableSharingWithAwsOrganizationResponse extends js.Object {
  /**
    * Indicates whether the request succeeded.
    */
  var returnValue: js.UndefOr[Boolean] = js.undefined
}

object EnableSharingWithAwsOrganizationResponse {
  @scala.inline
  def apply(returnValue: js.UndefOr[scala.Boolean] = js.undefined): EnableSharingWithAwsOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(returnValue)) __obj.updateDynamic("returnValue")(returnValue)
    __obj.asInstanceOf[EnableSharingWithAwsOrganizationResponse]
  }
}

