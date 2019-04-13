package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventContextDataType extends js.Object {
  /**
    * The user's city.
    */
  var City: js.UndefOr[StringType] = js.undefined
  /**
    * The user's country.
    */
  var Country: js.UndefOr[StringType] = js.undefined
  /**
    * The user's device name.
    */
  var DeviceName: js.UndefOr[StringType] = js.undefined
  /**
    * The user's IP address.
    */
  var IpAddress: js.UndefOr[StringType] = js.undefined
  /**
    * The user's time zone.
    */
  var Timezone: js.UndefOr[StringType] = js.undefined
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
    if (City != null) __obj.updateDynamic("City")(City)
    if (Country != null) __obj.updateDynamic("Country")(Country)
    if (DeviceName != null) __obj.updateDynamic("DeviceName")(DeviceName)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone)
    __obj.asInstanceOf[EventContextDataType]
  }
}

