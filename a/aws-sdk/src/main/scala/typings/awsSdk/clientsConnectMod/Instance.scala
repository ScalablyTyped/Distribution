package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Instance extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the instance.
    */
  var Arn: js.UndefOr[ARN] = js.undefined
  
  /**
    * When the instance was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
    */
  var Id: js.UndefOr[InstanceId] = js.undefined
  
  /**
    * The identity management type.
    */
  var IdentityManagementType: js.UndefOr[DirectoryType] = js.undefined
  
  /**
    * Whether inbound calls are enabled.
    */
  var InboundCallsEnabled: js.UndefOr[typings.awsSdk.clientsConnectMod.InboundCallsEnabled] = js.undefined
  
  /**
    * The alias of instance.
    */
  var InstanceAlias: js.UndefOr[DirectoryAlias] = js.undefined
  
  /**
    * The state of the instance.
    */
  var InstanceStatus: js.UndefOr[typings.awsSdk.clientsConnectMod.InstanceStatus] = js.undefined
  
  /**
    * Whether outbound calls are enabled.
    */
  var OutboundCallsEnabled: js.UndefOr[typings.awsSdk.clientsConnectMod.OutboundCallsEnabled] = js.undefined
  
  /**
    * The service role of the instance.
    */
  var ServiceRole: js.UndefOr[ARN] = js.undefined
  
  /**
    * Relevant details why the instance was not successfully created. 
    */
  var StatusReason: js.UndefOr[InstanceStatusReason] = js.undefined
}
object Instance {
  
  inline def apply(): Instance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Instance]
  }
  
  extension [Self <: Instance](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setId(value: InstanceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setIdentityManagementType(value: DirectoryType): Self = StObject.set(x, "IdentityManagementType", value.asInstanceOf[js.Any])
    
    inline def setIdentityManagementTypeUndefined: Self = StObject.set(x, "IdentityManagementType", js.undefined)
    
    inline def setInboundCallsEnabled(value: InboundCallsEnabled): Self = StObject.set(x, "InboundCallsEnabled", value.asInstanceOf[js.Any])
    
    inline def setInboundCallsEnabledUndefined: Self = StObject.set(x, "InboundCallsEnabled", js.undefined)
    
    inline def setInstanceAlias(value: DirectoryAlias): Self = StObject.set(x, "InstanceAlias", value.asInstanceOf[js.Any])
    
    inline def setInstanceAliasUndefined: Self = StObject.set(x, "InstanceAlias", js.undefined)
    
    inline def setInstanceStatus(value: InstanceStatus): Self = StObject.set(x, "InstanceStatus", value.asInstanceOf[js.Any])
    
    inline def setInstanceStatusUndefined: Self = StObject.set(x, "InstanceStatus", js.undefined)
    
    inline def setOutboundCallsEnabled(value: OutboundCallsEnabled): Self = StObject.set(x, "OutboundCallsEnabled", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallsEnabledUndefined: Self = StObject.set(x, "OutboundCallsEnabled", js.undefined)
    
    inline def setServiceRole(value: ARN): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    inline def setStatusReason(value: InstanceStatusReason): Self = StObject.set(x, "StatusReason", value.asInstanceOf[js.Any])
    
    inline def setStatusReasonUndefined: Self = StObject.set(x, "StatusReason", js.undefined)
  }
}
