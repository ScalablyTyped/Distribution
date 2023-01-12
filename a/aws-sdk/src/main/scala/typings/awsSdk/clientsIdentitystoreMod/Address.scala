package typings.awsSdk.clientsIdentitystoreMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The country of the address.
    */
  var Country: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string containing a formatted version of the address for display.
    */
  var Formatted: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string of the address locality.
    */
  var Locality: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The postal code of the address.
    */
  var PostalCode: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A Boolean value representing whether this is the primary address for the associated resource.
    */
  var Primary: js.UndefOr[SensitiveBooleanType] = js.undefined
  
  /**
    * The region of the address.
    */
  var Region: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * The street of the address.
    */
  var StreetAddress: js.UndefOr[SensitiveStringType] = js.undefined
  
  /**
    * A string representing the type of address. For example, "Home."
    */
  var Type: js.UndefOr[SensitiveStringType] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: SensitiveStringType): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setFormatted(value: SensitiveStringType): Self = StObject.set(x, "Formatted", value.asInstanceOf[js.Any])
    
    inline def setFormattedUndefined: Self = StObject.set(x, "Formatted", js.undefined)
    
    inline def setLocality(value: SensitiveStringType): Self = StObject.set(x, "Locality", value.asInstanceOf[js.Any])
    
    inline def setLocalityUndefined: Self = StObject.set(x, "Locality", js.undefined)
    
    inline def setPostalCode(value: SensitiveStringType): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    inline def setPrimary(value: SensitiveBooleanType): Self = StObject.set(x, "Primary", value.asInstanceOf[js.Any])
    
    inline def setPrimaryUndefined: Self = StObject.set(x, "Primary", js.undefined)
    
    inline def setRegion(value: SensitiveStringType): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
    
    inline def setStreetAddress(value: SensitiveStringType): Self = StObject.set(x, "StreetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "StreetAddress", js.undefined)
    
    inline def setType(value: SensitiveStringType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
