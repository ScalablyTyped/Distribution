package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyHostsRequest extends StObject {
  
  /**
    * Specify whether to enable or disable auto-placement.
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.clientsEc2Mod.AutoPlacement] = js.undefined
  
  /**
    * The IDs of the Dedicated Hosts to modify.
    */
  var HostIds: RequestHostIdList
  
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. For more information, see  Host recovery in the Amazon EC2 User Guide.
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.clientsEc2Mod.HostRecovery] = js.undefined
  
  /**
    * Specifies the instance family to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support multiple instance types within its current instance family. If you want to modify a Dedicated Host to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the instance type to be supported by the Dedicated Host. Specify this parameter to modify a Dedicated Host to support only a specific instance type. If you want to modify a Dedicated Host to support multiple instance types in its current instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
}
object ModifyHostsRequest {
  
  inline def apply(HostIds: RequestHostIdList): ModifyHostsRequest = {
    val __obj = js.Dynamic.literal(HostIds = HostIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyHostsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyHostsRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoPlacement(value: AutoPlacement): Self = StObject.set(x, "AutoPlacement", value.asInstanceOf[js.Any])
    
    inline def setAutoPlacementUndefined: Self = StObject.set(x, "AutoPlacement", js.undefined)
    
    inline def setHostIds(value: RequestHostIdList): Self = StObject.set(x, "HostIds", value.asInstanceOf[js.Any])
    
    inline def setHostIdsVarargs(value: DedicatedHostId*): Self = StObject.set(x, "HostIds", js.Array(value*))
    
    inline def setHostRecovery(value: HostRecovery): Self = StObject.set(x, "HostRecovery", value.asInstanceOf[js.Any])
    
    inline def setHostRecoveryUndefined: Self = StObject.set(x, "HostRecovery", js.undefined)
    
    inline def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
  }
}
