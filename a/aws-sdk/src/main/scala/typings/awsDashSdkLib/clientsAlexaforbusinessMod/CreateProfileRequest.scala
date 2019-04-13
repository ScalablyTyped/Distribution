package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProfileRequest extends js.Object {
  /**
    * The valid address for the room.
    */
  var Address: awsDashSdkLib.clientsAlexaforbusinessMod.Address
  /**
    * The user-specified token that is used during the creation of a profile.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The distance unit to be used by devices in the profile.
    */
  var DistanceUnit: awsDashSdkLib.clientsAlexaforbusinessMod.DistanceUnit
  /**
    * The maximum volume limit for a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
  /**
    * Whether PSTN calling is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The name of a room profile.
    */
  var ProfileName: awsDashSdkLib.clientsAlexaforbusinessMod.ProfileName
  /**
    * Whether room profile setup is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The temperature unit to be used by devices in the profile.
    */
  var TemperatureUnit: awsDashSdkLib.clientsAlexaforbusinessMod.TemperatureUnit
  /**
    * The time zone used by a room profile.
    */
  var Timezone: awsDashSdkLib.clientsAlexaforbusinessMod.Timezone
  /**
    * A wake word for Alexa, Echo, Amazon, or a computer.
    */
  var WakeWord: awsDashSdkLib.clientsAlexaforbusinessMod.WakeWord
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
    MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined,
    PSTNEnabled: js.UndefOr[Boolean] = js.undefined,
    SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  ): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(Address = Address, DistanceUnit = DistanceUnit.asInstanceOf[js.Any], ProfileName = ProfileName, TemperatureUnit = TemperatureUnit.asInstanceOf[js.Any], Timezone = Timezone, WakeWord = WakeWord.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (!js.isUndefined(MaxVolumeLimit)) __obj.updateDynamic("MaxVolumeLimit")(MaxVolumeLimit)
    if (!js.isUndefined(PSTNEnabled)) __obj.updateDynamic("PSTNEnabled")(PSTNEnabled)
    if (!js.isUndefined(SetupModeDisabled)) __obj.updateDynamic("SetupModeDisabled")(SetupModeDisabled)
    __obj.asInstanceOf[CreateProfileRequest]
  }
}

