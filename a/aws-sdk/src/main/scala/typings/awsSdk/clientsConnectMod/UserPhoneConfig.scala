package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPhoneConfig extends StObject {
  
  /**
    * The After Call Work (ACW) timeout setting, in seconds.  When returned by a SearchUsers call, AfterContactWorkTimeLimit is returned in milliseconds.  
    */
  var AfterContactWorkTimeLimit: js.UndefOr[typings.awsSdk.clientsConnectMod.AfterContactWorkTimeLimit] = js.undefined
  
  /**
    * The Auto accept setting.
    */
  var AutoAccept: js.UndefOr[typings.awsSdk.clientsConnectMod.AutoAccept] = js.undefined
  
  /**
    * The phone number for the user's desk phone.
    */
  var DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.undefined
  
  /**
    * The phone type.
    */
  var PhoneType: typings.awsSdk.clientsConnectMod.PhoneType
}
object UserPhoneConfig {
  
  inline def apply(PhoneType: PhoneType): UserPhoneConfig = {
    val __obj = js.Dynamic.literal(PhoneType = PhoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoneConfig]
  }
  
  extension [Self <: UserPhoneConfig](x: Self) {
    
    inline def setAfterContactWorkTimeLimit(value: AfterContactWorkTimeLimit): Self = StObject.set(x, "AfterContactWorkTimeLimit", value.asInstanceOf[js.Any])
    
    inline def setAfterContactWorkTimeLimitUndefined: Self = StObject.set(x, "AfterContactWorkTimeLimit", js.undefined)
    
    inline def setAutoAccept(value: AutoAccept): Self = StObject.set(x, "AutoAccept", value.asInstanceOf[js.Any])
    
    inline def setAutoAcceptUndefined: Self = StObject.set(x, "AutoAccept", js.undefined)
    
    inline def setDeskPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "DeskPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setDeskPhoneNumberUndefined: Self = StObject.set(x, "DeskPhoneNumber", js.undefined)
    
    inline def setPhoneType(value: PhoneType): Self = StObject.set(x, "PhoneType", value.asInstanceOf[js.Any])
  }
}
