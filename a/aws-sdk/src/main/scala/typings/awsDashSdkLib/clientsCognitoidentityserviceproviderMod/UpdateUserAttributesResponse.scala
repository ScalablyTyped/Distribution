package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateUserAttributesResponse extends js.Object {
  /**
    * The code delivery details list from the server for the request to update user attributes.
    */
  var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.undefined
}

object UpdateUserAttributesResponse {
  @scala.inline
  def apply(CodeDeliveryDetailsList: CodeDeliveryDetailsListType = null): UpdateUserAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetailsList != null) __obj.updateDynamic("CodeDeliveryDetailsList")(CodeDeliveryDetailsList)
    __obj.asInstanceOf[UpdateUserAttributesResponse]
  }
}

