package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Profile extends js.Object {
  /**
    * The address of a room profile.
    */
  var Address: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Address] = js.native
  /**
    * The ARN of the address book.
    */
  var AddressBookArn: js.UndefOr[Arn] = js.native
  /**
    * The distance unit of a room profile.
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DistanceUnit] = js.native
  /**
    * Retrieves if the profile is default or not.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The locale of a room profile. (This is currently available only to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.native
  /**
    * The max volume limit of a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxVolumeLimit] = js.native
  /**
    * Meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MeetingRoomConfiguration] = js.native
  /**
    * The PSTN setting of a room profile.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The ARN of a room profile.
    */
  var ProfileArn: js.UndefOr[Arn] = js.native
  /**
    * The name of a room profile.
    */
  var ProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProfileName] = js.native
  /**
    * The setup mode of a room profile.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.native
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

object Profile {
  @scala.inline
  def apply(
    Address: Address = null,
    AddressBookArn: Arn = null,
    DistanceUnit: DistanceUnit = null,
    IsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    Locale: DeviceLocale = null,
    MaxVolumeLimit: Int | Double = null,
    MeetingRoomConfiguration: MeetingRoomConfiguration = null,
    PSTNEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    ProfileArn: Arn = null,
    ProfileName: ProfileName = null,
    SetupModeDisabled: js.UndefOr[scala.Boolean] = js.undefined,
    TemperatureUnit: TemperatureUnit = null,
    Timezone: Timezone = null,
    WakeWord: WakeWord = null
  ): Profile = {
    val __obj = js.Dynamic.literal()
    if (Address != null) __obj.updateDynamic("Address")(Address.asInstanceOf[js.Any])
    if (AddressBookArn != null) __obj.updateDynamic("AddressBookArn")(AddressBookArn.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[Profile]
  }
}

