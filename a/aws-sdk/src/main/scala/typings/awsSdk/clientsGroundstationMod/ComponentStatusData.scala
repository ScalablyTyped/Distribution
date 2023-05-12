package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentStatusData extends StObject {
  
  /**
    * Bytes received by the component.
    */
  var bytesReceived: js.UndefOr[Long] = js.undefined
  
  /**
    * Bytes sent by the component.
    */
  var bytesSent: js.UndefOr[Long] = js.undefined
  
  /**
    * Capability ARN of the component.
    */
  var capabilityArn: CapabilityArn
  
  /**
    * The Component type.
    */
  var componentType: ComponentTypeString
  
  /**
    * Dataflow UUID associated with the component.
    */
  var dataflowId: Uuid
  
  /**
    * Packets dropped by component.
    */
  var packetsDropped: js.UndefOr[Long] = js.undefined
  
  /**
    * Component status.
    */
  var status: AgentStatus
}
object ComponentStatusData {
  
  inline def apply(
    capabilityArn: CapabilityArn,
    componentType: ComponentTypeString,
    dataflowId: Uuid,
    status: AgentStatus
  ): ComponentStatusData = {
    val __obj = js.Dynamic.literal(capabilityArn = capabilityArn.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], dataflowId = dataflowId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentStatusData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentStatusData] (val x: Self) extends AnyVal {
    
    inline def setBytesReceived(value: Long): Self = StObject.set(x, "bytesReceived", value.asInstanceOf[js.Any])
    
    inline def setBytesReceivedUndefined: Self = StObject.set(x, "bytesReceived", js.undefined)
    
    inline def setBytesSent(value: Long): Self = StObject.set(x, "bytesSent", value.asInstanceOf[js.Any])
    
    inline def setBytesSentUndefined: Self = StObject.set(x, "bytesSent", js.undefined)
    
    inline def setCapabilityArn(value: CapabilityArn): Self = StObject.set(x, "capabilityArn", value.asInstanceOf[js.Any])
    
    inline def setComponentType(value: ComponentTypeString): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setDataflowId(value: Uuid): Self = StObject.set(x, "dataflowId", value.asInstanceOf[js.Any])
    
    inline def setPacketsDropped(value: Long): Self = StObject.set(x, "packetsDropped", value.asInstanceOf[js.Any])
    
    inline def setPacketsDroppedUndefined: Self = StObject.set(x, "packetsDropped", js.undefined)
    
    inline def setStatus(value: AgentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
