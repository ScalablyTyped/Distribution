package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileRequest extends StObject {
  
  /**
    * The valid address for the room.
    */
  var Address: typings.awsSdk.alexaforbusinessMod.Address
  
  /**
    * The user-specified token that is used during the creation of a profile.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * The distance unit to be used by devices in the profile.
    */
  var DistanceUnit: typings.awsSdk.alexaforbusinessMod.DistanceUnit
  
  /**
    * The locale of the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.undefined
  
  /**
    * The maximum volume limit for a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxVolumeLimit] = js.undefined
  
  /**
    * The meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[CreateMeetingRoomConfiguration] = js.undefined
  
  /**
    * Whether PSTN calling is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of a room profile.
    */
  var ProfileName: typings.awsSdk.alexaforbusinessMod.ProfileName
  
  /**
    * Whether room profile setup is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tags for the profile.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The temperature unit to be used by devices in the profile.
    */
  var TemperatureUnit: typings.awsSdk.alexaforbusinessMod.TemperatureUnit
  
  /**
    * The time zone used by a room profile.
    */
  var Timezone: typings.awsSdk.alexaforbusinessMod.Timezone
  
  /**
    * A wake word for Alexa, Echo, Amazon, or a computer.
    */
  var WakeWord: typings.awsSdk.alexaforbusinessMod.WakeWord
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
  implicit class CreateProfileRequestMutableBuilder[Self <: CreateProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    @scala.inline
    def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: DeviceLocale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    @scala.inline
    def setMaxVolumeLimit(value: MaxVolumeLimit): Self = StObject.set(x, "MaxVolumeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVolumeLimitUndefined: Self = StObject.set(x, "MaxVolumeLimit", js.undefined)
    
    @scala.inline
    def setMeetingRoomConfiguration(value: CreateMeetingRoomConfiguration): Self = StObject.set(x, "MeetingRoomConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingRoomConfigurationUndefined: Self = StObject.set(x, "MeetingRoomConfiguration", js.undefined)
    
    @scala.inline
    def setPSTNEnabled(value: Boolean): Self = StObject.set(x, "PSTNEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPSTNEnabledUndefined: Self = StObject.set(x, "PSTNEnabled", js.undefined)
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupModeDisabled(value: Boolean): Self = StObject.set(x, "SetupModeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupModeDisabledUndefined: Self = StObject.set(x, "SetupModeDisabled", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    @scala.inline
    def setTemperatureUnit(value: TemperatureUnit): Self = StObject.set(x, "TemperatureUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeWord(value: WakeWord): Self = StObject.set(x, "WakeWord", value.asInstanceOf[js.Any])
  }
}
