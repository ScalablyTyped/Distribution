package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignUpResponse extends js.Object {
  /**
    * The code delivery details returned by the server response to the user registration request.
    */
  var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
  /**
    * A response from the server indicating that a user registration has been confirmed.
    */
  var UserConfirmed: BooleanType
  /**
    * The UUID of the authenticated user. This is not the same as username.
    */
  var UserSub: StringType
}

object SignUpResponse {
  @scala.inline
  def apply(
    UserConfirmed: BooleanType,
    UserSub: StringType,
    CodeDeliveryDetails: CodeDeliveryDetailsType = null
  ): SignUpResponse = {
    val __obj = js.Dynamic.literal(UserConfirmed = UserConfirmed, UserSub = UserSub)
    if (CodeDeliveryDetails != null) __obj.updateDynamic("CodeDeliveryDetails")(CodeDeliveryDetails)
    __obj.asInstanceOf[SignUpResponse]
  }
}

