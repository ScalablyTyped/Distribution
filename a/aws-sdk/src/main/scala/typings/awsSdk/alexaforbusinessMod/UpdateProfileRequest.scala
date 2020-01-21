package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateProfileRequest extends js.Object {
  /**
    * The updated address for the room profile.
    */
  var Address: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Address] = js.native
  /**
    * The updated distance unit for the room profile.
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DistanceUnit] = js.native
  /**
    * Sets the profile as default if selected. If this is missing, no update is done to the default status.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The updated locale for the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.native
  /**
    * The updated maximum volume limit for the room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxVolumeLimit] = js.native
  /**
    * The updated meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[UpdateMeetingRoomConfiguration] = js.native
  /**
    * Whether the PSTN setting of the room profile is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of the room profile to update. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The updated name for the room profile.
    */
  var ProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProfileName] = js.native
  /**
    * Whether the setup mode of the profile is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.native
  /**
    * The updated temperature unit for the room profile.
    */
  var TemperatureUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TemperatureUnit] = js.native
  /**
    * The updated timezone for the room profile.
    */
  var Timezone: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Timezone] = js.native
  /**
    * The updated wake word for the room profile.
    */
  var WakeWord: js.UndefOr[typings.awsSdk.alexaforbusinessMod.WakeWord] = js.native
}

object UpdateProfileRequest {
  @scala.inline
  def apply(
    Address: Address = null,
    DistanceUnit: DistanceUnit = null,
    IsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    Locale: DeviceLocale = null,
    MaxVolumeLimit: Int | Double = null,
    MeetingRoomConfiguration: UpdateMeetingRoomConfiguration = null,
    PSTNEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    SetupModeDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    TemperatureUnit: TemperatureUnit = null,
    Timezone: Timezone = null,
    WakeWord: WakeWord = null
  ): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (DistanceUnit != null) __obj.updateDynamic("DistanceUnit")(DistanceUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.asInstanceOf[js.Any])
    if (Locale != null) __obj.updateDynamic("Locale")(Locale.asInstanceOf[js.Any])
    if (MaxVolumeLimit != null) __obj.updateDynamic("MaxVolumeLimit")(MaxVolumeLimit.asInstanceOf[js.Any])
    if (MeetingRoomConfiguration != null) __obj.updateDynamic("MeetingRoomConfiguration")(MeetingRoomConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(PSTNEnabled)) __obj.updateDynamic("PSTNEnabled")(PSTNEnabled.asInstanceOf[js.Any])
    if (ProfileArn != null) __obj.updateDynamic("ProfileArn")(ProfileArn.asInstanceOf[js.Any])
    if (ProfileName != null) __obj.updateDynamic("ProfileName")(ProfileName.asInstanceOf[js.Any])
    if (!js.isUndefined(SetupModeDisabled)) __obj.updateDynamic("SetupModeDisabled")(SetupModeDisabled.asInstanceOf[js.Any])
    if (TemperatureUnit != null) __obj.updateDynamic("TemperatureUnit")(TemperatureUnit.asInstanceOf[js.Any])
    if (Timezone != null) __obj.updateDynamic("Timezone")(Timezone.asInstanceOf[js.Any])
    if (WakeWord != null) __obj.updateDynamic("WakeWord")(WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProfileRequest]
  }
}

