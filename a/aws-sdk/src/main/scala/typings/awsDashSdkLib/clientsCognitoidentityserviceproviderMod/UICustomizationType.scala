package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UICustomizationType extends js.Object {
  /**
    * The CSS values in the UI customization.
    */
  var CSS: js.UndefOr[CSSType] = js.undefined
  /**
    * The CSS version number.
    */
  var CSSVersion: js.UndefOr[CSSVersionType] = js.undefined
  /**
    * The client ID for the client app.
    */
  var ClientId: js.UndefOr[ClientIdType] = js.undefined
  /**
    * The creation date for the UI customization.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * The logo image for the UI customization.
    */
  var ImageUrl: js.UndefOr[ImageUrlType] = js.undefined
  /**
    * The last-modified date for the UI customization.
    */
  var LastModifiedDate: js.UndefOr[DateType] = js.undefined
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
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
    if (CSS != null) __obj.updateDynamic("CSS")(CSS)
    if (CSSVersion != null) __obj.updateDynamic("CSSVersion")(CSSVersion)
    if (ClientId != null) __obj.updateDynamic("ClientId")(ClientId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (ImageUrl != null) __obj.updateDynamic("ImageUrl")(ImageUrl)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (UserPoolId != null) __obj.updateDynamic("UserPoolId")(UserPoolId)
    __obj.asInstanceOf[UICustomizationType]
  }
}

