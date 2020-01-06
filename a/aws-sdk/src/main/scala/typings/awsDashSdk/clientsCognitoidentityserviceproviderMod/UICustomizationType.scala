package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UICustomizationType extends js.Object {
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.native
  /**
    * The CSS version number.
    */
  var CSSVersion: js.UndefOr[CSSVersionType] = js.native
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.native
  /**
    * The creation date for the UI customization.
    */
  var CreationDate: js.UndefOr[DateType] = js.native
  /**
    * The logo image for the UI customization.
    */
  var ImageUrl: js.UndefOr[ImageUrlType] = js.native
  /**
    * The last-modified date for the UI customization.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.native
}

object UICustomizationType {
  @scala.inline
  def apply(
    CSS: CSSType = null,
    CSSVersion: CSSVersionType = null,
    ClientId: ClientIdType = null,
    CreationDate: DateType = null,
    ImageUrl: ImageUrlType = null,
    LastModifiedDate: DateType = null,
    UserPoolId: UserPoolIdType = null
  ): UICustomizationType = {
    val __obj = js.Dynamic.literal()
    if (CSS != null) __obj.updateDynamic("CSS")(CSS.asInstanceOf[js.Any])
    if (CSSVersion != null) __obj.updateDynamic("CSSVersion")(CSSVersion.asInstanceOf[js.Any])
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UICustomizationType]
  }
}

