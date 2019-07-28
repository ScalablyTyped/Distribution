package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeDeliveryDetailsType extends js.Object {
  /**
    * The attribute name.
    */
  var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
  /**
    * The delivery medium (email message or phone number).
    */
  var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
  /**
    * The destination for the code delivery details.
    */
  var Destination: js.UndefOr[StringType] = js.undefined
}

object CodeDeliveryDetailsType {
  @scala.inline
  def apply(
    AttributeName: AttributeNameType = null,
    DeliveryMedium: DeliveryMediumType = null,
    Destination: StringType = null
  ): CodeDeliveryDetailsType = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (DeliveryMedium != null) __obj.updateDynamic("DeliveryMedium")(DeliveryMedium.asInstanceOf[js.Any])
    if (Destination != null) __obj.updateDynamic("Destination")(Destination)
    __obj.asInstanceOf[CodeDeliveryDetailsType]
  }
}

