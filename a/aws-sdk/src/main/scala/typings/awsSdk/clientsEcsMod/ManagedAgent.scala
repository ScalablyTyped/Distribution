package typings.awsSdk.clientsEcsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedAgent extends StObject {
  
  /**
    * The Unix timestamp for the time when the managed agent was last started.
    */
  var lastStartedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last known status of the managed agent.
    */
  var lastStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the managed agent. When the execute command feature is enabled, the managed agent name is ExecuteCommandAgent.
    */
  var name: js.UndefOr[ManagedAgentName] = js.undefined
  
  /**
    * The reason for why the managed agent is in the state it is in.
    */
  var reason: js.UndefOr[String] = js.undefined
}
object ManagedAgent {
  
  inline def apply(): ManagedAgent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedAgent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedAgent] (val x: Self) extends AnyVal {
    
    inline def setLastStartedAt(value: js.Date): Self = StObject.set(x, "lastStartedAt", value.asInstanceOf[js.Any])
    
    inline def setLastStartedAtUndefined: Self = StObject.set(x, "lastStartedAt", js.undefined)
    
    inline def setLastStatus(value: String): Self = StObject.set(x, "lastStatus", value.asInstanceOf[js.Any])
    
    inline def setLastStatusUndefined: Self = StObject.set(x, "lastStatus", js.undefined)
    
    inline def setName(value: ManagedAgentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
