package typings.awsLambda.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeToLiveInSeconds extends StObject {
  
  var timeToLiveInSeconds: Double
  
  var turnsToLive: Double
}
object TimeToLiveInSeconds {
  
  inline def apply(timeToLiveInSeconds: Double, turnsToLive: Double): TimeToLiveInSeconds = {
    val __obj = js.Dynamic.literal(timeToLiveInSeconds = timeToLiveInSeconds.asInstanceOf[js.Any], turnsToLive = turnsToLive.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeToLiveInSeconds]
  }
  
  extension [Self <: TimeToLiveInSeconds](x: Self) {
    
    inline def setTimeToLiveInSeconds(value: Double): Self = StObject.set(x, "timeToLiveInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTurnsToLive(value: Double): Self = StObject.set(x, "turnsToLive", value.asInstanceOf[js.Any])
  }
}
