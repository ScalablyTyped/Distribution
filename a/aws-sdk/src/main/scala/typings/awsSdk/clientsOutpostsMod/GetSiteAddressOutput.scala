package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteAddressOutput extends StObject {
  
  /**
    *  Information about the address. 
    */
  var Address: js.UndefOr[typings.awsSdk.clientsOutpostsMod.Address] = js.undefined
  
  /**
    * The type of the address you receive. 
    */
  var AddressType: js.UndefOr[typings.awsSdk.clientsOutpostsMod.AddressType] = js.undefined
  
  var SiteId: js.UndefOr[typings.awsSdk.clientsOutpostsMod.SiteId] = js.undefined
}
object GetSiteAddressOutput {
  
  inline def apply(): GetSiteAddressOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSiteAddressOutput]
  }
  
  extension [Self <: GetSiteAddressOutput](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressType(value: AddressType): Self = StObject.set(x, "AddressType", value.asInstanceOf[js.Any])
    
    inline def setAddressTypeUndefined: Self = StObject.set(x, "AddressType", js.undefined)
    
    inline def setAddressUndefined: Self = StObject.set(x, "Address", js.undefined)
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
    
    inline def setSiteIdUndefined: Self = StObject.set(x, "SiteId", js.undefined)
  }
}
