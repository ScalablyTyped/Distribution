package typings.applestAtem.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioChannel extends StObject {
  
  /** whether audio-follows-video is enabled */
  var afv: Boolean
  
  var gain: Double
  
  var leftLevel: Double
  
  /** whether the channel is ON (as opposed to AFV) */
  var on: Boolean
  
  var rawGain: Double
  
  var rawPan: Double
  
  var rightLevel: Double
}
object AudioChannel {
  
  inline def apply(
    afv: Boolean,
    gain: Double,
    leftLevel: Double,
    on: Boolean,
    rawGain: Double,
    rawPan: Double,
    rightLevel: Double
  ): AudioChannel = {
    val __obj = js.Dynamic.literal(afv = afv.asInstanceOf[js.Any], gain = gain.asInstanceOf[js.Any], leftLevel = leftLevel.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], rawGain = rawGain.asInstanceOf[js.Any], rawPan = rawPan.asInstanceOf[js.Any], rightLevel = rightLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioChannel]
  }
  
  extension [Self <: AudioChannel](x: Self) {
    
    inline def setAfv(value: Boolean): Self = StObject.set(x, "afv", value.asInstanceOf[js.Any])
    
    inline def setGain(value: Double): Self = StObject.set(x, "gain", value.asInstanceOf[js.Any])
    
    inline def setLeftLevel(value: Double): Self = StObject.set(x, "leftLevel", value.asInstanceOf[js.Any])
    
    inline def setOn(value: Boolean): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
    
    inline def setRawGain(value: Double): Self = StObject.set(x, "rawGain", value.asInstanceOf[js.Any])
    
    inline def setRawPan(value: Double): Self = StObject.set(x, "rawPan", value.asInstanceOf[js.Any])
    
    inline def setRightLevel(value: Double): Self = StObject.set(x, "rightLevel", value.asInstanceOf[js.Any])
  }
}
