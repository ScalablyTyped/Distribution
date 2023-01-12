package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVirtualInterfaceAttributesRequest extends StObject {
  
  /**
    * Indicates whether to enable or disable SiteLink.
    */
  var enableSiteLink: js.UndefOr[EnableSiteLink] = js.undefined
  
  /**
    * The maximum transmission unit (MTU), in bytes. The supported values are 1500 and 9001. The default value is 1500.
    */
  var mtu: js.UndefOr[MTU] = js.undefined
  
  /**
    * The ID of the virtual private interface.
    */
  var virtualInterfaceId: VirtualInterfaceId
  
  /**
    * The name of the virtual private interface.
    */
  var virtualInterfaceName: js.UndefOr[VirtualInterfaceName] = js.undefined
}
object UpdateVirtualInterfaceAttributesRequest {
  
  inline def apply(virtualInterfaceId: VirtualInterfaceId): UpdateVirtualInterfaceAttributesRequest = {
    val __obj = js.Dynamic.literal(virtualInterfaceId = virtualInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVirtualInterfaceAttributesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVirtualInterfaceAttributesRequest] (val x: Self) extends AnyVal {
    
    inline def setEnableSiteLink(value: EnableSiteLink): Self = StObject.set(x, "enableSiteLink", value.asInstanceOf[js.Any])
    
    inline def setEnableSiteLinkUndefined: Self = StObject.set(x, "enableSiteLink", js.undefined)
    
    inline def setMtu(value: MTU): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    inline def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    inline def setVirtualInterfaceId(value: VirtualInterfaceId): Self = StObject.set(x, "virtualInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceName(value: VirtualInterfaceName): Self = StObject.set(x, "virtualInterfaceName", value.asInstanceOf[js.Any])
    
    inline def setVirtualInterfaceNameUndefined: Self = StObject.set(x, "virtualInterfaceName", js.undefined)
  }
}
