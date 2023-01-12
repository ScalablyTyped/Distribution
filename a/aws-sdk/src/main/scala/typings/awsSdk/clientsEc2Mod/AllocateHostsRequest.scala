package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllocateHostsRequest extends StObject {
  
  /**
    * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID. For more information, see  Understanding auto-placement and affinity in the Amazon EC2 User Guide. Default: on 
    */
  var AutoPlacement: js.UndefOr[typings.awsSdk.clientsEc2Mod.AutoPlacement] = js.undefined
  
  /**
    * The Availability Zone in which to allocate the Dedicated Host.
    */
  var AvailabilityZone: String
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see Ensuring Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default. For more information, see  Host recovery in the Amazon EC2 User Guide. Default: off 
    */
  var HostRecovery: js.UndefOr[typings.awsSdk.clientsEc2Mod.HostRecovery] = js.undefined
  
  /**
    * Specifies the instance family to be supported by the Dedicated Hosts. If you specify an instance family, the Dedicated Hosts support multiple instance types within that instance family. If you want the Dedicated Hosts to support a specific instance type only, omit this parameter and specify InstanceType instead. You cannot specify InstanceFamily and InstanceType in the same request.
    */
  var InstanceFamily: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the instance type to be supported by the Dedicated Hosts. If you specify an instance type, the Dedicated Hosts support instances of the specified instance type only. If you want the Dedicated Hosts to support multiple instance types in a specific instance family, omit this parameter and specify InstanceFamily instead. You cannot specify InstanceType and InstanceFamily in the same request.
    */
  var InstanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services Outpost on which to allocate the Dedicated Host.
    */
  var OutpostArn: js.UndefOr[String] = js.undefined
  
  /**
    * The number of Dedicated Hosts to allocate to your account with these parameters.
    */
  var Quantity: Integer
  
  /**
    * The tags to apply to the Dedicated Host during creation.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object AllocateHostsRequest {
  
  inline def apply(AvailabilityZone: String, Quantity: Integer): AllocateHostsRequest = {
    val __obj = js.Dynamic.literal(AvailabilityZone = AvailabilityZone.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllocateHostsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllocateHostsRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoPlacement(value: AutoPlacement): Self = StObject.set(x, "AutoPlacement", value.asInstanceOf[js.Any])
    
    inline def setAutoPlacementUndefined: Self = StObject.set(x, "AutoPlacement", js.undefined)
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "AvailabilityZone", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setHostRecovery(value: HostRecovery): Self = StObject.set(x, "HostRecovery", value.asInstanceOf[js.Any])
    
    inline def setHostRecoveryUndefined: Self = StObject.set(x, "HostRecovery", js.undefined)
    
    inline def setInstanceFamily(value: String): Self = StObject.set(x, "InstanceFamily", value.asInstanceOf[js.Any])
    
    inline def setInstanceFamilyUndefined: Self = StObject.set(x, "InstanceFamily", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "InstanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "InstanceType", js.undefined)
    
    inline def setOutpostArn(value: String): Self = StObject.set(x, "OutpostArn", value.asInstanceOf[js.Any])
    
    inline def setOutpostArnUndefined: Self = StObject.set(x, "OutpostArn", js.undefined)
    
    inline def setQuantity(value: Integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
    
    inline def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    inline def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    inline def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value*))
  }
}
