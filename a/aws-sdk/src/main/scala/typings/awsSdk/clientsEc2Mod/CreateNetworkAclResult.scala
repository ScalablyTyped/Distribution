package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkAclResult extends StObject {
  
  /**
    * Information about the network ACL.
    */
  var NetworkAcl: js.UndefOr[typings.awsSdk.clientsEc2Mod.NetworkAcl] = js.undefined
}
object CreateNetworkAclResult {
  
  inline def apply(): CreateNetworkAclResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNetworkAclResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateNetworkAclResult] (val x: Self) extends AnyVal {
    
    inline def setNetworkAcl(value: NetworkAcl): Self = StObject.set(x, "NetworkAcl", value.asInstanceOf[js.Any])
    
    inline def setNetworkAclUndefined: Self = StObject.set(x, "NetworkAcl", js.undefined)
  }
}
