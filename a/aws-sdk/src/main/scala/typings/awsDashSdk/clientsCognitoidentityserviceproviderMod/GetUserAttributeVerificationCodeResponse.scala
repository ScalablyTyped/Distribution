package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserAttributeVerificationCodeResponse extends js.Object {
  /**
    * The code delivery details returned by the server in response to the request to get the user attribute verification code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
}

object GetUserAttributeVerificationCodeResponse {
  @scala.inline
  def apply(CodeDeliveryDetails: CodeDeliveryDetailsType = null): GetUserAttributeVerificationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails)
    __obj.asInstanceOf[GetUserAttributeVerificationCodeResponse]
  }
}

