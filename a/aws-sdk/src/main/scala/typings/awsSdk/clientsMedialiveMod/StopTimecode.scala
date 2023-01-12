package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopTimecode extends StObject {
  
  /**
    * If you specify a StopTimecode in an input (in order to clip the file), you can specify if you want the clip to exclude (the default) or include the frame specified by the timecode.
    */
  var LastFrameClippingBehavior: js.UndefOr[typings.awsSdk.clientsMedialiveMod.LastFrameClippingBehavior] = js.undefined
  
  /**
    * The timecode for the frame where you want to stop the clip. Optional; if not specified, the clip continues to the end of the file. Enter the timecode as HH:MM:SS:FF or HH:MM:SS;FF.
    */
  var Timecode: js.UndefOr[string] = js.undefined
}
object StopTimecode {
  
  inline def apply(): StopTimecode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopTimecode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopTimecode] (val x: Self) extends AnyVal {
    
    inline def setLastFrameClippingBehavior(value: LastFrameClippingBehavior): Self = StObject.set(x, "LastFrameClippingBehavior", value.asInstanceOf[js.Any])
    
    inline def setLastFrameClippingBehaviorUndefined: Self = StObject.set(x, "LastFrameClippingBehavior", js.undefined)
    
    inline def setTimecode(value: string): Self = StObject.set(x, "Timecode", value.asInstanceOf[js.Any])
    
    inline def setTimecodeUndefined: Self = StObject.set(x, "Timecode", js.undefined)
  }
}
