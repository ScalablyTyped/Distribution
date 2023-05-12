package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAgentResponse extends StObject {
  
  /**
    * UUID of registered agent.
    */
  var agentId: js.UndefOr[Uuid] = js.undefined
}
object RegisterAgentResponse {
  
  inline def apply(): RegisterAgentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAgentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegisterAgentResponse] (val x: Self) extends AnyVal {
    
    inline def setAgentId(value: Uuid): Self = StObject.set(x, "agentId", value.asInstanceOf[js.Any])
    
    inline def setAgentIdUndefined: Self = StObject.set(x, "agentId", js.undefined)
  }
}
