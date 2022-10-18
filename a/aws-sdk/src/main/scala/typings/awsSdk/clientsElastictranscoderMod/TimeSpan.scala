package typings.awsSdk.clientsElastictranscoderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeSpan extends StObject {
  
  /**
    * The duration of the clip. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic Transcoder creates an output file from StartTime to the end of the file. If you specify a value longer than the duration of the input file, Elastic Transcoder transcodes the file and returns a warning message.
    */
  var Duration: js.UndefOr[Time] = js.undefined
  
  /**
    * The place in the input file where you want a clip to start. The format can be either HH:mm:ss.SSS (maximum value: 23:59:59.999; SSS is thousandths of a second) or sssss.SSS (maximum value: 86399.999). If you don't specify a value, Elastic Transcoder starts at the beginning of the input file.
    */
  var StartTime: js.UndefOr[Time] = js.undefined
}
object TimeSpan {
  
  inline def apply(): TimeSpan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSpan]
  }
  
  extension [Self <: TimeSpan](x: Self) {
    
    inline def setDuration(value: Time): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setStartTime(value: Time): Self = StObject.set(x, "StartTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "StartTime", js.undefined)
  }
}
