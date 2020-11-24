package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    * The tags for the profile.
    */
  var Tags: js.UndefOr[TagList] = js.native
  
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
    WakeWord: WakeWord
  ): CreateProfileRequest = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], DistanceUnit = DistanceUnit.asInstanceOf[js.Any], ProfileName = ProfileName.asInstanceOf[js.Any], TemperatureUnit = TemperatureUnit.asInstanceOf[js.Any], Timezone = Timezone.asInstanceOf[js.Any], WakeWord = WakeWord.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProfileRequest]
  }
  
  @scala.inline
  implicit class CreateProfileRequestOps[Self <: CreateProfileRequest] (val x: Self) extends AnyVal {
    
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
    def setDistanceUnit(value: DistanceUnit): Self = this.set("DistanceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = this.set("ProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureUnit(value: TemperatureUnit): Self = this.set("TemperatureUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: Timezone): Self = this.set("Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeWord(value: WakeWord): Self = this.set("WakeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientRequestToken: Self = this.set("ClientRequestToken", js.undefined)
    
    @scala.inline
    def setLocale(value: DeviceLocale): Self = this.set("Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("Locale", js.undefined)
    
    @scala.inline
    def setMaxVolumeLimit(value: MaxVolumeLimit): Self = this.set("MaxVolumeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVolumeLimit: Self = this.set("MaxVolumeLimit", js.undefined)
    
    @scala.inline
    def setMeetingRoomConfiguration(value: CreateMeetingRoomConfiguration): Self = this.set("MeetingRoomConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeetingRoomConfiguration: Self = this.set("MeetingRoomConfiguration", js.undefined)
    
    @scala.inline
    def setPSTNEnabled(value: Boolean): Self = this.set("PSTNEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePSTNEnabled: Self = this.set("PSTNEnabled", js.undefined)
    
    @scala.inline
    def setSetupModeDisabled(value: Boolean): Self = this.set("SetupModeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupModeDisabled: Self = this.set("SetupModeDisabled", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
