package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeConfiguration extends StObject {
  
  /**
    * The maximum amount of time (in seconds) allowed to launch a new game session and have it report ready to host players. During this time, the game session is in status ACTIVATING. If the game session does not become active before the timeout, it is ended and the game session status is changed to TERMINATED.
    */
  var GameSessionActivationTimeoutSeconds: js.UndefOr[typings.awsSdk.clientsGameliftMod.GameSessionActivationTimeoutSeconds] = js.undefined
  
  /**
    * The number of game sessions in status ACTIVATING to allow on an instance. This setting limits the instance resources that can be used for new game activations at any one time.
    */
  var MaxConcurrentGameSessionActivations: js.UndefOr[typings.awsSdk.clientsGameliftMod.MaxConcurrentGameSessionActivations] = js.undefined
  
  /**
    * A collection of server process configurations that identify what server processes to run on each instance in a fleet.
    */
  var ServerProcesses: js.UndefOr[ServerProcessList] = js.undefined
}
object RuntimeConfiguration {
  
  inline def apply(): RuntimeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuntimeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setGameSessionActivationTimeoutSeconds(value: GameSessionActivationTimeoutSeconds): Self = StObject.set(x, "GameSessionActivationTimeoutSeconds", value.asInstanceOf[js.Any])
    
    inline def setGameSessionActivationTimeoutSecondsUndefined: Self = StObject.set(x, "GameSessionActivationTimeoutSeconds", js.undefined)
    
    inline def setMaxConcurrentGameSessionActivations(value: MaxConcurrentGameSessionActivations): Self = StObject.set(x, "MaxConcurrentGameSessionActivations", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrentGameSessionActivationsUndefined: Self = StObject.set(x, "MaxConcurrentGameSessionActivations", js.undefined)
    
    inline def setServerProcesses(value: ServerProcessList): Self = StObject.set(x, "ServerProcesses", value.asInstanceOf[js.Any])
    
    inline def setServerProcessesUndefined: Self = StObject.set(x, "ServerProcesses", js.undefined)
    
    inline def setServerProcessesVarargs(value: ServerProcess*): Self = StObject.set(x, "ServerProcesses", js.Array(value*))
  }
}
