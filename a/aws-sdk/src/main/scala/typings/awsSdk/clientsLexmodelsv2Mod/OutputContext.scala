package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputContext extends StObject {
  
  /**
    * The name of the output context.
    */
  var name: Name
  
  /**
    * The amount of time, in seconds, that the output context should remain active. The time is figured from the first time the context is sent to the user.
    */
  var timeToLiveInSeconds: ContextTimeToLiveInSeconds
  
  /**
    * The number of conversation turns that the output context should remain active. The number of turns is counted from the first time that the context is sent to the user.
    */
  var turnsToLive: ContextTurnsToLive
}
object OutputContext {
  
  inline def apply(name: Name, timeToLiveInSeconds: ContextTimeToLiveInSeconds, turnsToLive: ContextTurnsToLive): OutputContext = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], timeToLiveInSeconds = timeToLiveInSeconds.asInstanceOf[js.Any], turnsToLive = turnsToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputContext]
  }
  
  extension [Self <: OutputContext](x: Self) {
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveInSeconds(value: ContextTimeToLiveInSeconds): Self = StObject.set(x, "timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTurnsToLive(value: ContextTurnsToLive): Self = StObject.set(x, "turnsToLive", value.asInstanceOf[js.Any])
  }
}
