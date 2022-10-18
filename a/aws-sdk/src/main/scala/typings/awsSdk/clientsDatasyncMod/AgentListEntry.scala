package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentListEntry extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent.
    */
  var AgentArn: js.UndefOr[typings.awsSdk.clientsDatasyncMod.AgentArn] = js.undefined
  
  /**
    * The name of the agent.
    */
  var Name: js.UndefOr[TagValue] = js.undefined
  
  /**
    * The status of the agent.
    */
  var Status: js.UndefOr[AgentStatus] = js.undefined
}
object AgentListEntry {
  
  inline def apply(): AgentListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentListEntry]
  }
  
  extension [Self <: AgentListEntry](x: Self) {
    
    inline def setAgentArn(value: AgentArn): Self = StObject.set(x, "AgentArn", value.asInstanceOf[js.Any])
    
    inline def setAgentArnUndefined: Self = StObject.set(x, "AgentArn", js.undefined)
    
    inline def setName(value: TagValue): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: AgentStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
