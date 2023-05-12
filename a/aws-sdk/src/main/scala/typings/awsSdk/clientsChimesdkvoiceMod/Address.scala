package typings.awsSdk.clientsChimesdkvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The city of an address.
    */
  var city: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The country of an address.
    */
  var country: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * An address suffix location, such as the S. Unit A in Central Park S. Unit A.
    */
  var postDirectional: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The postal code of an address.
    */
  var postalCode: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The zip + 4 or postal code + 4 of an address.
    */
  var postalCodePlus4: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * An address prefix location, such as the N in N. Third St. 
    */
  var preDirectional: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The state of an address.
    */
  var state: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The address street, such as 8th Avenue.
    */
  var streetName: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The numeric portion of an address.
    */
  var streetNumber: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The address suffix, such as the N in 8th Avenue N.
    */
  var streetSuffix: js.UndefOr[SensitiveNonEmptyString] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setCity(value: SensitiveNonEmptyString): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: SensitiveNonEmptyString): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setPostDirectional(value: SensitiveNonEmptyString): Self = StObject.set(x, "postDirectional", value.asInstanceOf[js.Any])
    
    inline def setPostDirectionalUndefined: Self = StObject.set(x, "postDirectional", js.undefined)
    
    inline def setPostalCode(value: SensitiveNonEmptyString): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodePlus4(value: SensitiveNonEmptyString): Self = StObject.set(x, "postalCodePlus4", value.asInstanceOf[js.Any])
    
    inline def setPostalCodePlus4Undefined: Self = StObject.set(x, "postalCodePlus4", js.undefined)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setPreDirectional(value: SensitiveNonEmptyString): Self = StObject.set(x, "preDirectional", value.asInstanceOf[js.Any])
    
    inline def setPreDirectionalUndefined: Self = StObject.set(x, "preDirectional", js.undefined)
    
    inline def setState(value: SensitiveNonEmptyString): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreetName(value: SensitiveNonEmptyString): Self = StObject.set(x, "streetName", value.asInstanceOf[js.Any])
    
    inline def setStreetNameUndefined: Self = StObject.set(x, "streetName", js.undefined)
    
    inline def setStreetNumber(value: SensitiveNonEmptyString): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
    
    inline def setStreetNumberUndefined: Self = StObject.set(x, "streetNumber", js.undefined)
    
    inline def setStreetSuffix(value: SensitiveNonEmptyString): Self = StObject.set(x, "streetSuffix", value.asInstanceOf[js.Any])
    
    inline def setStreetSuffixUndefined: Self = StObject.set(x, "streetSuffix", js.undefined)
  }
}
