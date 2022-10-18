package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputClippingSettings extends StObject {
  
  /**
    * The source of the timecodes in the source being clipped.
    */
  var InputTimecodeSource: typings.awsSdk.clientsMedialiveMod.InputTimecodeSource
  
  /**
    * Settings to identify the start of the clip.
    */
  var StartTimecode: js.UndefOr[typings.awsSdk.clientsMedialiveMod.StartTimecode] = js.undefined
  
  /**
    * Settings to identify the end of the clip.
    */
  var StopTimecode: js.UndefOr[typings.awsSdk.clientsMedialiveMod.StopTimecode] = js.undefined
}
object InputClippingSettings {
  
  inline def apply(InputTimecodeSource: InputTimecodeSource): InputClippingSettings = {
    val __obj = js.Dynamic.literal(InputTimecodeSource = InputTimecodeSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputClippingSettings]
  }
  
  extension [Self <: InputClippingSettings](x: Self) {
    
    inline def setInputTimecodeSource(value: InputTimecodeSource): Self = StObject.set(x, "InputTimecodeSource", value.asInstanceOf[js.Any])
    
    inline def setStartTimecode(value: StartTimecode): Self = StObject.set(x, "StartTimecode", value.asInstanceOf[js.Any])
    
    inline def setStartTimecodeUndefined: Self = StObject.set(x, "StartTimecode", js.undefined)
    
    inline def setStopTimecode(value: StopTimecode): Self = StObject.set(x, "StopTimecode", value.asInstanceOf[js.Any])
    
    inline def setStopTimecodeUndefined: Self = StObject.set(x, "StopTimecode", js.undefined)
  }
}
