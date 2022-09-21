package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumber extends StObject {
  
  /**
    * The phone number associations.
    */
  var Associations: js.UndefOr[PhoneNumberAssociationList] = js.undefined
  
  /**
    * The outbound calling name associated with the phone number.
    */
  var CallingName: js.UndefOr[typings.awsSdk.chimeMod.CallingName] = js.undefined
  
  /**
    * The outbound calling name status.
    */
  var CallingNameStatus: js.UndefOr[typings.awsSdk.chimeMod.CallingNameStatus] = js.undefined
  
  /**
    * The phone number capabilities.
    */
  var Capabilities: js.UndefOr[PhoneNumberCapabilities] = js.undefined
  
  /**
    * The phone number country. Format: ISO 3166-1 alpha-2.
    */
  var Country: js.UndefOr[Alpha2CountryCode] = js.undefined
  
  /**
    * The phone number creation timestamp, in ISO 8601 format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The deleted phone number timestamp, in ISO 8601 format.
    */
  var DeletionTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The phone number, in E.164 format.
    */
  var E164PhoneNumber: js.UndefOr[typings.awsSdk.chimeMod.E164PhoneNumber] = js.undefined
  
  /**
    * The phone number ID.
    */
  var PhoneNumberId: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number product type.
    */
  var ProductType: js.UndefOr[PhoneNumberProductType] = js.undefined
  
  /**
    * The phone number status.
    */
  var Status: js.UndefOr[PhoneNumberStatus] = js.undefined
  
  /**
    * The phone number type.
    */
  var Type: js.UndefOr[PhoneNumberType] = js.undefined
  
  /**
    * The updated phone number timestamp, in ISO 8601 format.
    */
  var UpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
}
object PhoneNumber {
  
  inline def apply(): PhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumber]
  }
  
  extension [Self <: PhoneNumber](x: Self) {
    
    inline def setAssociations(value: PhoneNumberAssociationList): Self = StObject.set(x, "Associations", value.asInstanceOf[js.Any])
    
    inline def setAssociationsUndefined: Self = StObject.set(x, "Associations", js.undefined)
    
    inline def setAssociationsVarargs(value: PhoneNumberAssociation*): Self = StObject.set(x, "Associations", js.Array(value*))
    
    inline def setCallingName(value: CallingName): Self = StObject.set(x, "CallingName", value.asInstanceOf[js.Any])
    
    inline def setCallingNameStatus(value: CallingNameStatus): Self = StObject.set(x, "CallingNameStatus", value.asInstanceOf[js.Any])
    
    inline def setCallingNameStatusUndefined: Self = StObject.set(x, "CallingNameStatus", js.undefined)
    
    inline def setCallingNameUndefined: Self = StObject.set(x, "CallingName", js.undefined)
    
    inline def setCapabilities(value: PhoneNumberCapabilities): Self = StObject.set(x, "Capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "Capabilities", js.undefined)
    
    inline def setCountry(value: Alpha2CountryCode): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setDeletionTimestamp(value: js.Date): Self = StObject.set(x, "DeletionTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeletionTimestampUndefined: Self = StObject.set(x, "DeletionTimestamp", js.undefined)
    
    inline def setE164PhoneNumber(value: E164PhoneNumber): Self = StObject.set(x, "E164PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setE164PhoneNumberUndefined: Self = StObject.set(x, "E164PhoneNumber", js.undefined)
    
    inline def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    inline def setProductType(value: PhoneNumberProductType): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
    
    inline def setStatus(value: PhoneNumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: PhoneNumberType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "UpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimestampUndefined: Self = StObject.set(x, "UpdatedTimestamp", js.undefined)
  }
}
