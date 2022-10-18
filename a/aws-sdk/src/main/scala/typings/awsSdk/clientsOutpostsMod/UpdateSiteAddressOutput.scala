package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteAddressOutput extends StObject {
  
  /**
    *  Information about an address. 
    */
  var Address: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Address] = js.undefined
  
  /**
    *  The type of the address. 
    */
  var AddressType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.AddressType] = js.undefined
}
object UpdateSiteAddressOutput {
  
  inline def apply(): UpdateSiteAddressOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSiteAddressOutput]
  }
  
  extension [Self <: UpdateSiteAddressOutput](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressType(value: AddressType): Self = StObject.set(x, "AddressType", value.asInstanceOf[js.Any])
    
    inline def setAddressTypeUndefined: Self = StObject.set(x, "AddressType", js.undefined)
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
  }
}
