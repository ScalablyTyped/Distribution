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
  def apply(): Profile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Profile]
  }
  @scala.inline
  implicit class ProfileOps[Self <: Profile] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddress(value: Address): Self = this.set("Address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("Address", js.undefined)
    @scala.inline
    def setAddressBookArn(value: Arn): Self = this.set("AddressBookArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressBookArn: Self = this.set("AddressBookArn", js.undefined)
    @scala.inline
    def setDistanceUnit(value: DistanceUnit): Self = this.set("DistanceUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDistanceUnit: Self = this.set("DistanceUnit", js.undefined)
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("IsDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDefault: Self = this.set("IsDefault", js.undefined)
    @scala.inline
    def setLocale(value: DeviceLocale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("Locale", js.undefined)
    @scala.inline
    def setMaxVolumeLimit(value: MaxVolumeLimit): Self = this.set("MaxVolumeLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxVolumeLimit: Self = this.set("MaxVolumeLimit", js.undefined)
    @scala.inline
    def setMeetingRoomConfiguration(value: MeetingRoomConfiguration): Self = this.set("MeetingRoomConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeetingRoomConfiguration: Self = this.set("MeetingRoomConfiguration", js.undefined)
    @scala.inline
    def setPSTNEnabled(value: Boolean): Self = this.set("PSTNEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePSTNEnabled: Self = this.set("PSTNEnabled", js.undefined)
    @scala.inline
    def setProfileArn(value: Arn): Self = this.set("ProfileArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileArn: Self = this.set("ProfileArn", js.undefined)
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("ProfileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProfileName: Self = this.set("ProfileName", js.undefined)
    @scala.inline
    def setSetupModeDisabled(value: Boolean): Self = this.set("SetupModeDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetupModeDisabled: Self = this.set("SetupModeDisabled", js.undefined)
    @scala.inline
    def setTemperatureUnit(value: TemperatureUnit): Self = this.set("TemperatureUnit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTemperatureUnit: Self = this.set("TemperatureUnit", js.undefined)
    @scala.inline
    def setTimezone(value: Timezone): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimezone: Self = this.set("Timezone", js.undefined)
    @scala.inline
    def setWakeWord(value: WakeWord): Self = this.set("WakeWord", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWakeWord: Self = this.set("WakeWord", js.undefined)
  }
  
}

