package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAgentConfigurationResponse extends StObject {
  
  /**
    * UUID of agent.
    */
  var agentId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * Tasking document for agent.
    */
  var taskingDocument: js.UndefOr[String] = js.undefined
}
object GetAgentConfigurationResponse {
  
  inline def apply(): GetAgentConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAgentConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAgentConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: Uuid): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
    
    inline def setTaskingDocument(value: String): Self = StObject.set(x, "taskingDocument", value.asInstanceOf[js.Any])
    
    inline def setTaskingDocumentUndefined: Self = StObject.set(x, "taskingDocument", js.undefined)
  }
}
