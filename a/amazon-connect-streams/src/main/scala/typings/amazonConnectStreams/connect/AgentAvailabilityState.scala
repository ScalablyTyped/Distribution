package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object containing the current Agent state
  */
trait AgentAvailabilityState extends StObject {
  
  /** The name of the agent's actual state. */
  val state: String
  
  /** Date indicating when the agent went into the current state. */
  val timeStamp: js.Date
}
object AgentAvailabilityState {
  
  inline def apply(state: String, timeStamp: js.Date): AgentAvailabilityState = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentAvailabilityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentAvailabilityState] (val x: Self) extends AnyVal {
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setTimeStamp(value: js.Date): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
  }
}
