package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSiteAddressInput extends StObject {
  
  /**
    * The type of the address you request. 
    */
  var AddressType: typings.awsSdk.clientsOutpostsMod.AddressType
  
  /**
    *  The ID or the Amazon Resource Name (ARN) of the site. 
    */
  var SiteId: typings.awsSdk.clientsOutpostsMod.SiteId
}
object GetSiteAddressInput {
  
  inline def apply(AddressType: AddressType, SiteId: SiteId): GetSiteAddressInput = {
    val __obj = js.Dynamic.literal(AddressType = AddressType.asInstanceOf[js.Any], SiteId = SiteId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSiteAddressInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSiteAddressInput] (val x: Self) extends AnyVal {
    
    inline def setAddressType(value: AddressType): Self = StObject.set(x, "AddressType", value.asInstanceOf[js.Any])
    
    inline def setSiteId(value: SiteId): Self = StObject.set(x, "SiteId", value.asInstanceOf[js.Any])
  }
}
