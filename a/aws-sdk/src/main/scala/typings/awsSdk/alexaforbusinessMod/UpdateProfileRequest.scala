package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateProfileRequest extends StObject {
  
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
  def apply(): UpdateProfileRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProfileRequest]
  }
  
  @scala.inline
  implicit class UpdateProfileRequestMutableBuilder[Self <: UpdateProfileRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    @scala.inline
    def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistanceUnitUndefined: Self = StObject.set(x, "DistanceUnit", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    @scala.inline
    def setLocale(value: DeviceLocale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    @scala.inline
    def setMaxVolumeLimit(value: MaxVolumeLimit): Self = StObject.set(x, "MaxVolumeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxVolumeLimitUndefined: Self = StObject.set(x, "MaxVolumeLimit", js.undefined)
    
    @scala.inline
    def setMeetingRoomConfiguration(value: UpdateMeetingRoomConfiguration): Self = StObject.set(x, "MeetingRoomConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeetingRoomConfigurationUndefined: Self = StObject.set(x, "MeetingRoomConfiguration", js.undefined)
    
    @scala.inline
    def setPSTNEnabled(value: Boolean): Self = StObject.set(x, "PSTNEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPSTNEnabledUndefined: Self = StObject.set(x, "PSTNEnabled", js.undefined)
    
    @scala.inline
    def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    @scala.inline
    def setProfileName(value: ProfileName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileNameUndefined: Self = StObject.set(x, "ProfileName", js.undefined)
    
    @scala.inline
    def setSetupModeDisabled(value: Boolean): Self = StObject.set(x, "SetupModeDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetupModeDisabledUndefined: Self = StObject.set(x, "SetupModeDisabled", js.undefined)
    
    @scala.inline
    def setTemperatureUnit(value: TemperatureUnit): Self = StObject.set(x, "TemperatureUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemperatureUnitUndefined: Self = StObject.set(x, "TemperatureUnit", js.undefined)
    
    @scala.inline
    def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    @scala.inline
    def setWakeWord(value: WakeWord): Self = StObject.set(x, "WakeWord", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWakeWordUndefined: Self = StObject.set(x, "WakeWord", js.undefined)
  }
}
