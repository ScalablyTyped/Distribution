package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyTrafficMirrorFilterNetworkServicesRequest extends StObject {
  
  /**
    * The network service, for example Amazon DNS, that you want to mirror.
    */
  var AddNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The network service, for example Amazon DNS, that you no longer want to mirror.
    */
  var RemoveNetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.undefined
  
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: typings.awsSdk.clientsEc2Mod.TrafficMirrorFilterId
}
object ModifyTrafficMirrorFilterNetworkServicesRequest {
  
  inline def apply(TrafficMirrorFilterId: TrafficMirrorFilterId): ModifyTrafficMirrorFilterNetworkServicesRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterId = TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterNetworkServicesRequest]
  }
  
  extension [Self <: ModifyTrafficMirrorFilterNetworkServicesRequest](x: Self) {
    
    inline def setAddNetworkServices(value: TrafficMirrorNetworkServiceList): Self = StObject.set(x, "AddNetworkServices", value.asInstanceOf[js.Any])
    
    inline def setAddNetworkServicesUndefined: Self = StObject.set(x, "AddNetworkServices", js.undefined)
    
    inline def setAddNetworkServicesVarargs(value: TrafficMirrorNetworkService*): Self = StObject.set(x, "AddNetworkServices", js.Array(value*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setRemoveNetworkServices(value: TrafficMirrorNetworkServiceList): Self = StObject.set(x, "RemoveNetworkServices", value.asInstanceOf[js.Any])
    
    inline def setRemoveNetworkServicesUndefined: Self = StObject.set(x, "RemoveNetworkServices", js.undefined)
    
    inline def setRemoveNetworkServicesVarargs(value: TrafficMirrorNetworkService*): Self = StObject.set(x, "RemoveNetworkServices", js.Array(value*))
    
    inline def setTrafficMirrorFilterId(value: TrafficMirrorFilterId): Self = StObject.set(x, "TrafficMirrorFilterId", value.asInstanceOf[js.Any])
  }
}
