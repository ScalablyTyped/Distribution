package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the phone number.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The identifier of the phone number.
    */
  var Id: js.UndefOr[PhoneNumberId] = js.undefined
  
  /**
    * The phone number.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumber] = js.undefined
  
  /**
    * The ISO country code.
    */
  var PhoneNumberCountryCode: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberCountryCode] = js.undefined
  
  /**
    * The type of phone number.
    */
  var PhoneNumberType: js.UndefOr[typings.awsSdk.clientsConnectMod.PhoneNumberType] = js.undefined
}
object PhoneNumberSummary {
  
  inline def apply(): PhoneNumberSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberSummary] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setId(value: PhoneNumberId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCode(value: PhoneNumberCountryCode): Self = StObject.set(x, "PhoneNumberCountryCode", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberCountryCodeUndefined: Self = StObject.set(x, "PhoneNumberCountryCode", js.undefined)
    
    inline def setPhoneNumberType(value: PhoneNumberType): Self = StObject.set(x, "PhoneNumberType", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberTypeUndefined: Self = StObject.set(x, "PhoneNumberType", js.undefined)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
  }
}
