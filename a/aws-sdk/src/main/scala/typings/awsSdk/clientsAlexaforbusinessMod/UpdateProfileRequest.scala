package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProfileRequest extends StObject {
  
  /**
    * The updated address for the room profile.
    */
  var Address: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Address] = js.undefined
  
  /**
    * Whether data retention of the profile is enabled.
    */
  var DataRetentionOptIn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated distance unit for the room profile.
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.DistanceUnit] = js.undefined
  
  /**
    * Sets the profile as default if selected. If this is missing, no update is done to the default status.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated locale for the room profile. (This is currently only available to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.undefined
  
  /**
    * The updated maximum volume limit for the room profile.
    */
  var MaxVolumeLimit: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.MaxVolumeLimit] = js.undefined
  
  /**
    * The updated meeting room settings of a room profile.
    */
  var MeetingRoomConfiguration: js.UndefOr[UpdateMeetingRoomConfiguration] = js.undefined
  
  /**
    * Whether the PSTN setting of the room profile is enabled.
    */
  var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ARN of the room profile to update. Required.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The updated name for the room profile.
    */
  var ProfileName: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.ProfileName] = js.undefined
  
  /**
    * Whether the setup mode of the profile is enabled.
    */
  var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The updated temperature unit for the room profile.
    */
  var TemperatureUnit: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.TemperatureUnit] = js.undefined
  
  /**
    * The updated timezone for the room profile.
    */
  var Timezone: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.Timezone] = js.undefined
  
  /**
    * The updated wake word for the room profile.
    */
  var WakeWord: js.UndefOr[typings.awsSdk.clientsAlexaforbusinessMod.WakeWord] = js.undefined
}
object UpdateProfileRequest {
  
  inline def apply(): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProfileRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProfileRequest] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setDataRetentionOptIn(value: Boolean): Self = StObject.set(x, "DataRetentionOptIn", value.asInstanceOf[js.Any])
    
    inline def setDataRetentionOptInUndefined: Self = StObject.set(x, "DataRetentionOptIn", js.undefined)
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitUndefined: Self = StObject.set(x, "DistanceUnit", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setLocale(value: DeviceLocale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setMaxVolumeLimit(value: MaxVolumeLimit): Self = StObject.set(x, "MaxVolumeLimit", value.asInstanceOf[js.Any])
    
    inline def setMaxVolumeLimitUndefined: Self = StObject.set(x, "MaxVolumeLimit", js.undefined)
    
    inline def setMeetingRoomConfiguration(value: UpdateMeetingRoomConfiguration): Self = StObject.set(x, "MeetingRoomConfiguration", value.asInstanceOf[js.Any])
    
    inline def setMeetingRoomConfigurationUndefined: Self = StObject.set(x, "MeetingRoomConfiguration", js.undefined)
    
    inline def setPSTNEnabled(value: Boolean): Self = StObject.set(x, "PSTNEnabled", value.asInstanceOf[js.Any])
    
    inline def setPSTNEnabledUndefined: Self = StObject.set(x, "PSTNEnabled", js.undefined)
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "ProfileName", js.undefined)
    
    inline def setSetupModeDisabled(value: Boolean): Self = StObject.set(x, "SetupModeDisabled", value.asInstanceOf[js.Any])
    
    inline def setSetupModeDisabledUndefined: Self = StObject.set(x, "SetupModeDisabled", js.undefined)
    
    inline def setTemperatureUnit(value: TemperatureUnit): Self = StObject.set(x, "TemperatureUnit", value.asInstanceOf[js.Any])
    
    inline def setTemperatureUnitUndefined: Self = StObject.set(x, "TemperatureUnit", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setWakeWord(value: WakeWord): Self = StObject.set(x, "WakeWord", value.asInstanceOf[js.Any])
    
    inline def setWakeWordUndefined: Self = StObject.set(x, "WakeWord", js.undefined)
  }
}
