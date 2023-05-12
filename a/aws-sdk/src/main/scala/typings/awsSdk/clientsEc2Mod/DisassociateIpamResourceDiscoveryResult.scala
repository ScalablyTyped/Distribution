package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateIpamResourceDiscoveryResult extends StObject {
  
  /**
    * A resource discovery association.
    */
  var IpamResourceDiscoveryAssociation: js.UndefOr[typings.awsSdk.clientsEc2Mod.IpamResourceDiscoveryAssociation] = js.undefined
}
object DisassociateIpamResourceDiscoveryResult {
  
  inline def apply(): DisassociateIpamResourceDiscoveryResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisassociateIpamResourceDiscoveryResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisassociateIpamResourceDiscoveryResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceDiscoveryAssociation(value: IpamResourceDiscoveryAssociation): Self = StObject.set(x, "IpamResourceDiscoveryAssociation", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryAssociationUndefined: Self = StObject.set(x, "IpamResourceDiscoveryAssociation", js.undefined)
  }
}
