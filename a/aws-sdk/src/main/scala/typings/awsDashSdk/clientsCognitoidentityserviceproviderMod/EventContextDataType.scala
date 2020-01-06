package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventContextDataType extends js.Object {
  /**
    * The user's city.
    */
  var City: js.UndefOr[StringType] = js.native
  /**
    * The user's country.
    */
  var Country: js.UndefOr[StringType] = js.native
  /**
    * The user's device name.
    */
  var DeviceName: js.UndefOr[StringType] = js.native
  /**
    * The user's IP address.
    */
  var IpAddress: js.UndefOr[StringType] = js.native
  /**
    * The user's time zone.
    */
  var Timezone: js.UndefOr[StringType] = js.native
}

object EventContextDataType {
  @scala.inline
  def apply(
    City: StringType = null,
    Country: StringType = null,
    DeviceName: StringType = null,
    IpAddress: StringType = null,
    Timezone: StringType = null
  ): EventContextDataType = {
    val __obj = js.Dynamic.literal()
    if (City != null) __obj.updateDynamic("City")(City.asInstanceOf[js.Any])
    if (Country != null) __obj.updateDynamic("Country")(Country.asInstanceOf[js.Any])
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventContextDataType]
  }
}

