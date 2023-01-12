package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  /**
    * The first line of a customer address.
    */
  var Address1: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The second line of a customer address.
    */
  var Address2: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The third line of a customer address.
    */
  var Address3: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The fourth line of a customer address.
    */
  var Address4: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The city in which a customer lives.
    */
  var City: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The country in which a customer lives.
    */
  var Country: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The county in which a customer lives.
    */
  var County: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The postal code of a customer address.
    */
  var PostalCode: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The province in which a customer lives.
    */
  var Province: js.UndefOr[string1To255] = js.undefined
  
  /**
    * The state in which a customer lives.
    */
  var State: js.UndefOr[string1To255] = js.undefined
}
object Address {
  
  inline def apply(): Address = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setAddress1(value: string1To255): Self = StObject.set(x, "Address1", value.asInstanceOf[js.Any])
    
    inline def setAddress1Undefined: Self = StObject.set(x, "Address1", js.undefined)
    
    inline def setAddress2(value: string1To255): Self = StObject.set(x, "Address2", value.asInstanceOf[js.Any])
    
    inline def setAddress2Undefined: Self = StObject.set(x, "Address2", js.undefined)
    
    inline def setAddress3(value: string1To255): Self = StObject.set(x, "Address3", value.asInstanceOf[js.Any])
    
    inline def setAddress3Undefined: Self = StObject.set(x, "Address3", js.undefined)
    
    inline def setAddress4(value: string1To255): Self = StObject.set(x, "Address4", value.asInstanceOf[js.Any])
    
    inline def setAddress4Undefined: Self = StObject.set(x, "Address4", js.undefined)
    
    inline def setCity(value: string1To255): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: string1To255): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setCounty(value: string1To255): Self = StObject.set(x, "County", value.asInstanceOf[js.Any])
    
    inline def setCountyUndefined: Self = StObject.set(x, "County", js.undefined)
    
    inline def setPostalCode(value: string1To255): Self = StObject.set(x, "PostalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "PostalCode", js.undefined)
    
    inline def setProvince(value: string1To255): Self = StObject.set(x, "Province", value.asInstanceOf[js.Any])
    
    inline def setProvinceUndefined: Self = StObject.set(x, "Province", js.undefined)
    
    inline def setState(value: string1To255): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
