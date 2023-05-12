package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubnetMapping extends StObject {
  
  /**
    * The subnet's IP address type. You can't change the IP address type after you create the subnet.
    */
  var IPAddressType: js.UndefOr[typings.awsSdk.clientsNetworkfirewallMod.IPAddressType] = js.undefined
  
  /**
    * The unique identifier for the subnet. 
    */
  var SubnetId: CollectionMemberString
}
object SubnetMapping {
  
  inline def apply(SubnetId: CollectionMemberString): SubnetMapping = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetMapping]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubnetMapping] (val x: Self) extends AnyVal {
    
    inline def setIPAddressType(value: IPAddressType): Self = StObject.set(x, "IPAddressType", value.asInstanceOf[js.Any])
    
    inline def setIPAddressTypeUndefined: Self = StObject.set(x, "IPAddressType", js.undefined)
    
    inline def setSubnetId(value: CollectionMemberString): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
