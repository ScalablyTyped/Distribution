package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MFAOptionType extends js.Object {
  /**
    * The attribute name of the MFA option type.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
  /**
    * The delivery medium (email message or SMS message) to send the MFA code.
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
}

object MFAOptionType {
  @scala.inline
  def apply(AttributeName: AttributeNameType = null, DeliveryMedium: DeliveryMediumType = null): MFAOptionType = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (DeliveryMedium != null) __obj.updateDynamic("DeliveryMedium")(DeliveryMedium.asInstanceOf[js.Any])
    __obj.asInstanceOf[MFAOptionType]
  }
}

