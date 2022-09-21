package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentSetStateOptions extends StObject {
  
  /**  Enables enqueuing agent state while agent is handling a live contact. */
  val enqueueNextState: js.UndefOr[Boolean] = js.undefined
}
object AgentSetStateOptions {
  
  inline def apply(): AgentSetStateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgentSetStateOptions]
  }
  
  extension [Self <: AgentSetStateOptions](x: Self) {
    
    inline def setEnqueueNextState(value: Boolean): Self = StObject.set(x, "enqueueNextState", value.asInstanceOf[js.Any])
    
    inline def setEnqueueNextStateUndefined: Self = StObject.set(x, "enqueueNextState", js.undefined)
  }
}
