package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshSpec extends StObject {
  
  /**
    * The egress filter rules for the service mesh.
    */
  var egressFilter: js.UndefOr[EgressFilter] = js.undefined
  
  var serviceDiscovery: js.UndefOr[MeshServiceDiscovery] = js.undefined
}
object MeshSpec {
  
  inline def apply(): MeshSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshSpec]
  }
  
  extension [Self <: MeshSpec](x: Self) {
    
    inline def setEgressFilter(value: EgressFilter): Self = StObject.set(x, "egressFilter", value.asInstanceOf[js.Any])
    
    inline def setEgressFilterUndefined: Self = StObject.set(x, "egressFilter", js.undefined)
    
    inline def setServiceDiscovery(value: MeshServiceDiscovery): Self = StObject.set(x, "serviceDiscovery", value.asInstanceOf[js.Any])
    
    inline def setServiceDiscoveryUndefined: Self = StObject.set(x, "serviceDiscovery", js.undefined)
  }
}
