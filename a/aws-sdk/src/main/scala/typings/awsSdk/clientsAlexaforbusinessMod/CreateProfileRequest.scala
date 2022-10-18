package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProfileRequest extends StObject {
  
  /**
    * The valid address for the room.
    */
  var Address: typings.awsSdk.clientsAlexaforbusinessMod.Address
  
  /**
    * The user-specified token that is used during the creation of a profile.
    */
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ClientRequestToken] = js.undefined
  
  /**
    * Whether data retention of the profile is enabled.
    */
  var DataRetentionOptIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The distance unit to be used by devices in the profile.
    */
  var DistanceUnit: typings.awsSdk.clientsAlexaforbusinessMod.DistanceUnit
  
  /**
    * The locale of the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.undefined
  
  /**
    * The maximum volume limit for a room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MaxVolumeLimit] = js.undefined
  
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
  var ProfileName: typings.awsSdk.clientsAlexaforbusinessMod.ProfileName
  
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
  var TemperatureUnit: typings.awsSdk.clientsAlexaforbusinessMod.TemperatureUnit
  
  /**
    * The time zone used by a room profile.
    */
  var Timezone: typings.awsSdk.clientsAlexaforbusinessMod.Timezone
  
  /**
    * A wake word for Alexa, Echo, Amazon, or a computer.
    */
  var WakeWord: typings.awsSdk.clientsAlexaforbusinessMod.WakeWord
}
object CreateProfileRequest {
  
  inline def apply(
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
  
  extension [Self <: CreateProfileRequest](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setDataRetentionOptIn(value: Boolean): Self = StObject.set(x, "DataRetentionOptIn", value.asInstanceOf[js.Any])
    
    inline def setDataRetentionOptInUndefined: Self = StObject.set(x, "DataRetentionOptIn", js.undefined)
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setLocale(value: DeviceLocale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setMaxVolumeLimit(value: MaxVolumeLimit): Self = StObject.set(x, "MaxVolumeLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxVolumeLimitUndefined: Self = StObject.set(x, "MaxVolumeLimit", js.undefined)
    
    inline def setMeetingRoomConfiguration(value: CreateMeetingRoomConfiguration): Self = StObject.set(x, "MeetingRoomConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMeetingRoomConfigurationUndefined: Self = StObject.set(x, "MeetingRoomConfiguration", js.undefined)
    
    inline def setPSTNEnabled(value: Boolean): Self = StObject.set(x, "PSTNEnabled", value.asInstanceOf[js.Any])
    
    inline def setPSTNEnabledUndefined: Self = StObject.set(x, "PSTNEnabled", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    inline def setSetupModeDisabled(value: Boolean): Self = StObject.set(x, "SetupModeDisabled", value.asInstanceOf[js.Any])
    
    inline def setSetupModeDisabledUndefined: Self = StObject.set(x, "SetupModeDisabled", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTemperatureUnit(value: TemperatureUnit): Self = StObject.set(x, "TemperatureUnit", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setWakeWord(value: WakeWord): Self = StObject.set(x, "WakeWord", value.asInstanceOf[js.Any])
  }
}
