package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAgentStateChange extends StObject {
  
  /**
    * The name of the container that's associated with the managed agent.
    */
  var containerName: String
  
  /**
    * The name of the managed agent.
    */
  var managedAgentName: ManagedAgentName
  
  /**
    * The reason for the status of the managed agent.
    */
  var reason: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the managed agent.
    */
  var status: String
}
object ManagedAgentStateChange {
  
  inline def apply(containerName: String, managedAgentName: ManagedAgentName, status: String): ManagedAgentStateChange = {
    val __obj = js.Dynamic.literal(containerName = containerName.asInstanceOf[js.Any], managedAgentName = managedAgentName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManagedAgentStateChange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedAgentStateChange] (val x: Self) extends AnyVal {
    
    inline def setContainerName(value: String): Self = StObject.set(x, "containerName", value.asInstanceOf[js.Any])
    
    inline def setManagedAgentName(value: ManagedAgentName): Self = StObject.set(x, "managedAgentName", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
