package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileData extends js.Object {
  /**
    * The address of a room profile.
    */
  var Address: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Address] = js.native
  /**
    * The distance unit of a room profile.
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DistanceUnit] = js.native
  /**
    * Retrieves if the profile data is default or not.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The locale of a room profile. (This is currently available only to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.native
  /**
    * The ARN of a room profile.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a room profile.
    */
  var ProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProfileName] = js.native
  /**
    * The temperature unit of a room profile.
    */
  var TemperatureUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TemperatureUnit] = js.native
  /**
    * The time zone of a room profile.
    */
  var Timezone: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Timezone] = js.native
  /**
    * The wake word of a room profile.
    */
  var WakeWord: js.UndefOr[typings.awsSdk.alexaforbusinessMod.WakeWord] = js.native
}

object ProfileData {
  @scala.inline
  def apply(
    Address: Address = null,
    DistanceUnit: DistanceUnit = null,
    IsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    Locale: DeviceLocale = null,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    TemperatureUnit: TemperatureUnit = null,
    Timezone: Timezone = null,
    WakeWord: WakeWord = null
  ): ProfileData = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (DistanceUnit != null) __obj.updateDynamic("DistanceUnit")(DistanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    if (ProfileName != null) __obj.updateDynamic("ProfileName")(ProfileName.asInstanceOf[js.Any])
    if (TemperatureUnit != null) __obj.updateDynamic("TemperatureUnit")(TemperatureUnit.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (WakeWord != null) __obj.updateDynamic("WakeWord")(WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileData]
  }
}

