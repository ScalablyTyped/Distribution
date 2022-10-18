package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CandidateAddress extends StObject {
  
  /**
    * The city of a candidate address.
    */
  var city: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The country of a candidate address.
    */
  var country: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The postal code of a candidate address.
    */
  var postalCode: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The Zip + 4 or postal code + 4 of a candidate address.
    */
  var postalCodePlus4: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The state of a candidate address.
    */
  var state: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The street information of a candidate address
    */
  var streetInfo: js.UndefOr[SensitiveNonEmptyString] = js.undefined
  
  /**
    * The numeric portion of a candidate address.
    */
  var streetNumber: js.UndefOr[SensitiveNonEmptyString] = js.undefined
}
object CandidateAddress {
  
  inline def apply(): CandidateAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CandidateAddress]
  }
  
  extension [Self <: CandidateAddress](x: Self) {
    
    inline def setCity(value: SensitiveNonEmptyString): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: SensitiveNonEmptyString): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setPostalCode(value: SensitiveNonEmptyString): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodePlus4(value: SensitiveNonEmptyString): Self = StObject.set(x, "postalCodePlus4", value.asInstanceOf[js.Any])
    
    inline def setPostalCodePlus4Undefined: Self = StObject.set(x, "postalCodePlus4", js.undefined)
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setState(value: SensitiveNonEmptyString): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStreetInfo(value: SensitiveNonEmptyString): Self = StObject.set(x, "streetInfo", value.asInstanceOf[js.Any])
    
    inline def setStreetInfoUndefined: Self = StObject.set(x, "streetInfo", js.undefined)
    
    inline def setStreetNumber(value: SensitiveNonEmptyString): Self = StObject.set(x, "streetNumber", value.asInstanceOf[js.Any])
    
    inline def setStreetNumberUndefined: Self = StObject.set(x, "streetNumber", js.undefined)
  }
}
