package typings.awsSdk.clientsAthenaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateSessionResponse extends StObject {
  
  /**
    * The state of the session. A description of each state follows.  CREATING - The session is being started, including acquiring resources.  CREATED - The session has been started.  IDLE - The session is able to accept a calculation.  BUSY - The session is processing another task and is unable to accept a calculation.  TERMINATING - The session is in the process of shutting down.  TERMINATED - The session and its resources are no longer running.  DEGRADED - The session has no healthy coordinators.  FAILED - Due to a failure, the session and its resources are no longer running.
    */
  var State: js.UndefOr[SessionState] = js.undefined
}
object TerminateSessionResponse {
  
  inline def apply(): TerminateSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TerminateSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setState(value: SessionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
