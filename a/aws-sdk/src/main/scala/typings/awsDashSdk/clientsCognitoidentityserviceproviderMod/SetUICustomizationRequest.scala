package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetUICustomizationRequest extends js.Object {
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.undefined
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The uploaded logo image for the UI customization.
    */
  var ImageFile: js.UndefOr[ImageFileType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}

object SetUICustomizationRequest {
  @scala.inline
  def apply(
    UserPoolId: UserPoolIdType,
    CSS: CSSType = null,
    ClientId: ClientIdType = null,
    ImageFile: ImageFileType = null
  ): SetUICustomizationRequest = {
    val __obj = js.Dynamic.literal(UserPoolId = UserPoolId)
    if (CSS != null) __obj.updateDynamic("CSS")(CSS)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (ImageFile != null) __obj.updateDynamic("ImageFile")(ImageFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetUICustomizationRequest]
  }
}

