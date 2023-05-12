package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentDetails extends StObject {
  
  /**
    * List of CPU cores reserved for the agent.
    */
  var agentCpuCores: js.UndefOr[AgentCpuCoresList] = js.undefined
  
  /**
    * Current agent version.
    */
  var agentVersion: VersionString
  
  /**
    * List of versions being used by agent components.
    */
  var componentVersions: ComponentVersionList
  
  /**
    * ID of EC2 instance agent is running on.
    */
  var instanceId: InstanceId
  
  /**
    * Type of EC2 instance agent is running on.
    */
  var instanceType: InstanceType
  
  /**
    *  This field should not be used. Use agentCpuCores instead.  List of CPU cores reserved for processes other than the agent running on the EC2 instance.
    */
  var reservedCpuCores: js.UndefOr[AgentCpuCoresList] = js.undefined
}
object AgentDetails {
  
  inline def apply(
    agentVersion: VersionString,
    componentVersions: ComponentVersionList,
    instanceId: InstanceId,
    instanceType: InstanceType
  ): AgentDetails = {
    val __obj = js.Dynamic.literal(agentVersion = agentVersion.asInstanceOf[js.Any], componentVersions = componentVersions.asInstanceOf[js.Any], instanceId = instanceId.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentDetails] (val x: Self) extends AnyVal {
    
    inline def setAgentCpuCores(value: AgentCpuCoresList): Self = StObject.set(x, "agentCpuCores", value.asInstanceOf[js.Any])
    
    inline def setAgentCpuCoresUndefined: Self = StObject.set(x, "agentCpuCores", js.undefined)
    
    inline def setAgentCpuCoresVarargs(value: Integer*): Self = StObject.set(x, "agentCpuCores", js.Array(value*))
    
    inline def setAgentVersion(value: VersionString): Self = StObject.set(x, "agentVersion", value.asInstanceOf[js.Any])
    
    inline def setComponentVersions(value: ComponentVersionList): Self = StObject.set(x, "componentVersions", value.asInstanceOf[js.Any])
    
    inline def setComponentVersionsVarargs(value: ComponentVersion*): Self = StObject.set(x, "componentVersions", js.Array(value*))
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "instanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceType(value: InstanceType): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setReservedCpuCores(value: AgentCpuCoresList): Self = StObject.set(x, "reservedCpuCores", value.asInstanceOf[js.Any])
    
    inline def setReservedCpuCoresUndefined: Self = StObject.set(x, "reservedCpuCores", js.undefined)
    
    inline def setReservedCpuCoresVarargs(value: Integer*): Self = StObject.set(x, "reservedCpuCores", js.Array(value*))
  }
}
