package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileData extends StObject {
  
  /**
    * The address of a room profile.
    */
  var Address: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Address] = js.undefined
  
  /**
    * The distance unit of a room profile.
    */
  var DistanceUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.DistanceUnit] = js.undefined
  
  /**
    * Retrieves if the profile data is default or not.
    */
  var IsDefault: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The locale of a room profile. (This is currently available only to a limited preview audience.)
    */
  var Locale: js.UndefOr[DeviceLocale] = js.undefined
  
  /**
    * The ARN of a room profile.
    */
  var ProfileArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of a room profile.
    */
  var ProfileName: js.UndefOr[typings.awsSdk.alexaforbusinessMod.ProfileName] = js.undefined
  
  /**
    * The temperature unit of a room profile.
    */
  var TemperatureUnit: js.UndefOr[typings.awsSdk.alexaforbusinessMod.TemperatureUnit] = js.undefined
  
  /**
    * The time zone of a room profile.
    */
  var Timezone: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Timezone] = js.undefined
  
  /**
    * The wake word of a room profile.
    */
  var WakeWord: js.UndefOr[typings.awsSdk.alexaforbusinessMod.WakeWord] = js.undefined
}
object ProfileData {
  
  inline def apply(): ProfileData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProfileData]
  }
  
  extension [Self <: ProfileData](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setDistanceUnit(value: DistanceUnit): Self = StObject.set(x, "DistanceUnit", value.asInstanceOf[js.Any])
    
    inline def setDistanceUnitUndefined: Self = StObject.set(x, "DistanceUnit", js.undefined)
    
    inline def setIsDefault(value: Boolean): Self = StObject.set(x, "IsDefault", value.asInstanceOf[js.Any])
    
    inline def setIsDefaultUndefined: Self = StObject.set(x, "IsDefault", js.undefined)
    
    inline def setLocale(value: DeviceLocale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "Locale", js.undefined)
    
    inline def setProfileArn(value: Arn): Self = StObject.set(x, "ProfileArn", value.asInstanceOf[js.Any])
    
    inline def setProfileArnUndefined: Self = StObject.set(x, "ProfileArn", js.undefined)
    
    inline def setProfileName(value: ProfileName): Self = StObject.set(x, "ProfileName", value.asInstanceOf[js.Any])
    
    inline def setProfileNameUndefined: Self = StObject.set(x, "ProfileName", js.undefined)
    
    inline def setTemperatureUnit(value: TemperatureUnit): Self = StObject.set(x, "TemperatureUnit", value.asInstanceOf[js.Any])
    
    inline def setTemperatureUnitUndefined: Self = StObject.set(x, "TemperatureUnit", js.undefined)
    
    inline def setTimezone(value: Timezone): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
    
    inline def setWakeWord(value: WakeWord): Self = StObject.set(x, "WakeWord", value.asInstanceOf[js.Any])
    
    inline def setWakeWordUndefined: Self = StObject.set(x, "WakeWord", js.undefined)
  }
}
