package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlayerLatency extends StObject {
  
  /**
    * Amount of time that represents the time lag experienced by the player when connected to the specified Region.
    */
  var LatencyInMilliseconds: js.UndefOr[Float] = js.undefined
  
  /**
    * A unique identifier for a player associated with the latency data.
    */
  var PlayerId: js.UndefOr[NonZeroAndMaxString] = js.undefined
  
  /**
    * Name of the Region that is associated with the latency value.
    */
  var RegionIdentifier: js.UndefOr[NonZeroAndMaxString] = js.undefined
}
object PlayerLatency {
  
  inline def apply(): PlayerLatency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlayerLatency]
  }
  
  extension [Self <: PlayerLatency](x: Self) {
    
    inline def setLatencyInMilliseconds(value: Float): Self = StObject.set(x, "LatencyInMilliseconds", value.asInstanceOf[js.Any])
    
    inline def setLatencyInMillisecondsUndefined: Self = StObject.set(x, "LatencyInMilliseconds", js.undefined)
    
    inline def setPlayerId(value: NonZeroAndMaxString): Self = StObject.set(x, "PlayerId", value.asInstanceOf[js.Any])
    
    inline def setPlayerIdUndefined: Self = StObject.set(x, "PlayerId", js.undefined)
    
    inline def setRegionIdentifier(value: NonZeroAndMaxString): Self = StObject.set(x, "RegionIdentifier", value.asInstanceOf[js.Any])
    
    inline def setRegionIdentifierUndefined: Self = StObject.set(x, "RegionIdentifier", js.undefined)
  }
}
