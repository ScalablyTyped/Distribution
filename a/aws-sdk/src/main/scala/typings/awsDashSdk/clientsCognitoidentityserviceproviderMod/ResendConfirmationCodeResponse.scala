package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResendConfirmationCodeResponse extends js.Object {
  /**
    * The code delivery details returned by the server in response to the request to resend the confirmation code.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.native
}

object ResendConfirmationCodeResponse {
  @scala.inline
  def apply(CodeDeliveryDetails: CodeDeliveryDetailsType = null): ResendConfirmationCodeResponse = {
    val __obj = js.Dynamic.literal()
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResendConfirmationCodeResponse]
  }
}

