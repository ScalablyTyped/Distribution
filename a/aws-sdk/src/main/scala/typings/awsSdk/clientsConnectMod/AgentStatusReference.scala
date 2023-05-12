package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentStatusReference extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the agent's status.
    */
  var StatusArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * The name of the agent status.
    */
  var StatusName: js.UndefOr[AgentStatusName] = js.undefined
  
  /**
    * The start timestamp of the agent's status.
    */
  var StatusStartTimestamp: js.UndefOr[js.Date] = js.undefined
}
object AgentStatusReference {
  
  inline def apply(): AgentStatusReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentStatusReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentStatusReference] (val x: Self) extends AnyVal {
    
    inline def setStatusArn(value: ARN): Self = StObject.set(x, "StatusArn", value.asInstanceOf[js.Any])
    
    inline def setStatusArnUndefined: Self = StObject.set(x, "StatusArn", js.undefined)
    
    inline def setStatusName(value: AgentStatusName): Self = StObject.set(x, "StatusName", value.asInstanceOf[js.Any])
    
    inline def setStatusNameUndefined: Self = StObject.set(x, "StatusName", js.undefined)
    
    inline def setStatusStartTimestamp(value: js.Date): Self = StObject.set(x, "StatusStartTimestamp", value.asInstanceOf[js.Any])
    
    inline def setStatusStartTimestampUndefined: Self = StObject.set(x, "StatusStartTimestamp", js.undefined)
  }
}
