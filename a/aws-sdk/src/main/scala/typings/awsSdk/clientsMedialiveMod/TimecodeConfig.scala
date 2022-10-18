package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimecodeConfig extends StObject {
  
  /**
    * Identifies the source for the timecode that will be associated with the events outputs.
  -Embedded (embedded): Initialize the output timecode with timecode from the the source.  If no embedded timecode is detected in the source, the system falls back to using "Start at 0" (zerobased).
  -System Clock (systemclock): Use the UTC time.
  -Start at 0 (zerobased): The time of the first frame of the event will be 00:00:00:00.
    */
  var Source: TimecodeConfigSource
  
  /**
    * Threshold in frames beyond which output timecode is resynchronized to the input timecode. Discrepancies below this threshold are permitted to avoid unnecessary discontinuities in the output timecode. No timecode sync when this is not specified.
    */
  var SyncThreshold: js.UndefOr[integerMin1Max1000000] = js.undefined
}
object TimecodeConfig {
  
  inline def apply(Source: TimecodeConfigSource): TimecodeConfig = {
    val __obj = js.Dynamic.literal(Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimecodeConfig]
  }
  
  extension [Self <: TimecodeConfig](x: Self) {
    
    inline def setSource(value: TimecodeConfigSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSyncThreshold(value: integerMin1Max1000000): Self = StObject.set(x, "SyncThreshold", value.asInstanceOf[js.Any])
    
    inline def setSyncThresholdUndefined: Self = StObject.set(x, "SyncThreshold", js.undefined)
  }
}
