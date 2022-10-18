package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTrafficMirrorFilterNetworkServicesResult extends StObject {
  
  /**
    * The Traffic Mirror filter that the network service is associated with.
    */
  var TrafficMirrorFilter: js.UndefOr[typings.awsSdk.clientsEc2Mod.TrafficMirrorFilter] = js.undefined
}
object ModifyTrafficMirrorFilterNetworkServicesResult {
  
  inline def apply(): ModifyTrafficMirrorFilterNetworkServicesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesResult]
  }
  
  extension [Self <: ModifyTrafficMirrorFilterNetworkServicesResult](x: Self) {
    
    inline def setTrafficMirrorFilter(value: TrafficMirrorFilter): Self = StObject.set(x, "TrafficMirrorFilter", value.asInstanceOf[js.Any])
    
    inline def setTrafficMirrorFilterUndefined: Self = StObject.set(x, "TrafficMirrorFilter", js.undefined)
  }
}
