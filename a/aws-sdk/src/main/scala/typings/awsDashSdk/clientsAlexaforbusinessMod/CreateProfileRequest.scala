package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProfileRequest extends js.Object {
  /**
    * The valid address for the room.
    */
  var Address: typings.awsDashSdk.clientsAlexaforbusinessMod.Address
  /**
    * The user-specified token that is used during the creation of a profile.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
  /**
    * The distance unit to be used by devices in the profile.
    */
  var DistanceUnit: typings.awsDashSdk.clientsAlexaforbusinessMod.DistanceUnit
  /**
    * The locale of the room profile.
    */
  var Locale: js.UndefOr[DeviceLocale] = js.undefined
  /**
    * The maximum volume limit for a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsDashSdk.clientsAlexaforbusinessMod.MaxVolumeLimit] = js.undefined
  /**
    * Whether PSTN calling is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of a room profile.
    */
  var ProfileName: typings.awsDashSdk.clientsAlexaforbusinessMod.ProfileName
  /**
    * Whether room profile setup is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The temperature unit to be used by devices in the profile.
    */
  var TemperatureUnit: typings.awsDashSdk.clientsAlexaforbusinessMod.TemperatureUnit
  /**
    * The time zone used by a room profile.
    */
  var Timezone: typings.awsDashSdk.clientsAlexaforbusinessMod.Timezone
  /**
    * A wake word for Alexa, Echo, Amazon, or a computer.
    */
  var WakeWord: typings.awsDashSdk.clientsAlexaforbusinessMod.WakeWord
}

object CreateProfileRequest {
  @scala.inline
  def apply(
    Address: Address,
    DistanceUnit: DistanceUnit,
    ProfileName: ProfileName,
    TemperatureUnit: TemperatureUnit,
    Timezone: Timezone,
    WakeWord: WakeWord,
    ClientRequestToken: ClientRequestToken = null,
    Locale: DeviceLocale = null,
    MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
    PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
    SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  ): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(Address = Address, DistanceUnit = DistanceUnit.asInstanceOf[js.Any], ProfileName = ProfileName, TemperatureUnit = TemperatureUnit.asInstanceOf[js.Any], Timezone = Timezone, WakeWord = WakeWord.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (Locale != null) __obj.updateDynamic("Locale")(Locale)
    if (!js.isUndefined(MaxVolumeLimit)) __obj.updateDynamic("MaxVolumeLimit")(MaxVolumeLimit)
    if (!js.isUndefined(PSTNEnabled)) __obj.updateDynamic("PSTNEnabled")(PSTNEnabled)
    if (!js.isUndefined(SetupModeDisabled)) __obj.updateDynamic("SetupModeDisabled")(SetupModeDisabled)
    __obj.asInstanceOf[CreateProfileRequest]
  }
}

