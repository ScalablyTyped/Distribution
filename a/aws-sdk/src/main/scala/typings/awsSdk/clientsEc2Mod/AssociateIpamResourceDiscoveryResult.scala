package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateIpamResourceDiscoveryResult extends StObject {
  
  /**
    * A resource discovery association. An associated resource discovery is a resource discovery that has been associated with an IPAM.
    */
  var IpamResourceDiscoveryAssociation: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryAssociation] = js.undefined
}
object AssociateIpamResourceDiscoveryResult {
  
  inline def apply(): AssociateIpamResourceDiscoveryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateIpamResourceDiscoveryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateIpamResourceDiscoveryResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceDiscoveryAssociation(value: IpamResourceDiscoveryAssociation): Self = StObject.set(x, "IpamResourceDiscoveryAssociation", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryAssociationUndefined: Self = StObject.set(x, "IpamResourceDiscoveryAssociation", js.undefined)
  }
}
