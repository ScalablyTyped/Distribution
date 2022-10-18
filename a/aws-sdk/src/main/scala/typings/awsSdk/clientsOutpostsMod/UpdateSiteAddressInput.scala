package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSiteAddressInput extends StObject {
  
  /**
    *  The address for the site. 
    */
  var Address: typings.awsSdk.clientsOutpostsMod.Address
  
  /**
    *  The type of the address. 
    */
  var AddressType: typings.awsSdk.clientsOutpostsMod.AddressType
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site. 
    */
  var SiteId: typings.awsSdk.clientsOutpostsMod.SiteId
}
object UpdateSiteAddressInput {
  
  inline def apply(Address: Address, AddressType: AddressType, SiteId: SiteId): UpdateSiteAddressInput = {
    val __obj = js.Dynamic.literal(Address = Address.asInstanceOf[js.Any], AddressType = AddressType.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSiteAddressInput]
  }
  
  extension [Self <: UpdateSiteAddressInput](x: Self) {
    
    inline def setAddress(value: Address): Self = StObject.set(x, "Address", value.asInstanceOf[js.Any])
    
    inline def setAddressType(value: AddressType): Self = StObject.set(x, "AddressType", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
