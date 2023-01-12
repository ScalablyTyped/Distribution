package typings.amazonConnectStreams.connect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentMutedStatus extends StObject {
  
  /** A value indicating whether the agent local media is muted. */
  val muted: Boolean
}
object AgentMutedStatus {
  
  inline def apply(muted: Boolean): AgentMutedStatus = {
    val __obj = js.Dynamic.literal(muted = muted.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentMutedStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgentMutedStatus] (val x: Self) extends AnyVal {
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
  }
}
