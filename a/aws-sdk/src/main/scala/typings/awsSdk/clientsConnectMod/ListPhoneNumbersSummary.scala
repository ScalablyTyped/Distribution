package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPhoneNumbersSummary extends StObject {
  
  /**
    * The phone number. Phone numbers are formatted [+] [country code] [subscriber number including area code].
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumber] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var PhoneNumberArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberCountryCode] = js.undefined
  
  /**
    * A unique identifier for the phone number.
    */
  var PhoneNumberId: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberId] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberType] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for Amazon Connect instances or traffic distribution groups that phone numbers are claimed to.
    */
  var TargetArn: js.UndefOr[ARN] = js.undefined
}
object ListPhoneNumbersSummary {
  
  inline def apply(): ListPhoneNumbersSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPhoneNumbersSummary]
  }
  
  extension [Self <: ListPhoneNumbersSummary](x: Self) {
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArn(value: ARN): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArnUndefined: Self = StObject.set(x, "PhoneNumberArn", js.undefined)
    
    inline def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = StObject.set(x, "PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodeUndefined: Self = StObject.set(x, "PhoneNumberCountryCode", js.undefined)
    
    inline def setPhoneNumberId(value: PhoneNumberId): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setTargetArn(value: ARN): Self = StObject.set(x, "TargetArn", value.asInstanceOf[js.Any])
    
    inline def setTargetArnUndefined: Self = StObject.set(x, "TargetArn", js.undefined)
  }
}
