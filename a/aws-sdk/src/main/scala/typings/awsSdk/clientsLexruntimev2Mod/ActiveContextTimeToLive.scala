package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveContextTimeToLive extends StObject {
  
  /**
    * The number of seconds that the context is active. You can specify between 5 and 86400 seconds (24 hours).
    */
  var timeToLiveInSeconds: ActiveContextTimeToLiveInSeconds
  
  /**
    * The number of turns that the context is active. You can specify up to 20 turns. Each request and response from the bot is a turn.
    */
  var turnsToLive: ActiveContextTurnsToLive
}
object ActiveContextTimeToLive {
  
  inline def apply(timeToLiveInSeconds: ActiveContextTimeToLiveInSeconds, turnsToLive: ActiveContextTurnsToLive): ActiveContextTimeToLive = {
    val __obj = js.Dynamic.literal(timeToLiveInSeconds = timeToLiveInSeconds.asInstanceOf[js.Any], turnsToLive = turnsToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveContextTimeToLive]
  }
  
  extension [Self <: ActiveContextTimeToLive](x: Self) {
    
    inline def setTimeToLiveInSeconds(value: ActiveContextTimeToLiveInSeconds): Self = StObject.set(x, "timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTurnsToLive(value: ActiveContextTurnsToLive): Self = StObject.set(x, "turnsToLive", value.asInstanceOf[js.Any])
  }
}
