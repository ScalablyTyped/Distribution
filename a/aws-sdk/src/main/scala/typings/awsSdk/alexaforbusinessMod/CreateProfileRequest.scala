package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProfileRequest extends js.Object {
  /**
    * The valid address for the room.
    */
  var Address: typings.awsSdk.alexaforbusinessMod.Address = js.native
  /**
    * The user-specified token that is used during the creation of a profile.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.native
  /**
    * The distance unit to be used by devices in the profile.
    */
  var DistanceUnit: typings.awsSdk.alexaforbusinessMod.DistanceUnit = js.native
  /**
    * The locale of the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.native
  /**
    * The maximum volume limit for a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxVolumeLimit] = js.native
  /**
    * The meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[CreateMeetingRoomConfiguration] = js.native
  /**
    * Whether PSTN calling is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The name of a room profile.
    */
  var ProfileName: typings.awsSdk.alexaforbusinessMod.ProfileName = js.native
  /**
    * Whether room profile setup is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The temperature unit to be used by devices in the profile.
    */
  var TemperatureUnit: typings.awsSdk.alexaforbusinessMod.TemperatureUnit = js.native
  /**
    * The time zone used by a room profile.
    */
  var Timezone: typings.awsSdk.alexaforbusinessMod.Timezone = js.native
  /**
    * A wake word for Alexa, Echo, Amazon, or a computer.
    */
  var WakeWord: typings.awsSdk.alexaforbusinessMod.WakeWord = js.native
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
    MaxVolumeLimit: Int | Double = null,
    MeetingRoomConfiguration: CreateMeetingRoomConfiguration = null,
    PSTNEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    SetupModeDisabled: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DistanceUnit = DistanceUnit.asInstanceOf[js.Any], ProfileName = ProfileName.asInstanceOf[js.Any], TemperatureUnit = TemperatureUnit.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any], WakeWord = WakeWord.asInstanceOf[js.Any])
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (MaxVolumeLimit != null) __obj.updateDynamic("MaxVolumeLimit")(MaxVolumeLimit.asInstanceOf[js.Any])
    if (MeetingRoomConfiguration != null) __obj.updateDynamic("MeetingRoomConfiguration")(MeetingRoomConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(PSTNEnabled)) __obj.updateDynamic("PSTNEnabled")(PSTNEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(SetupModeDisabled)) __obj.updateDynamic("SetupModeDisabled")(SetupModeDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileRequest]
  }
}

