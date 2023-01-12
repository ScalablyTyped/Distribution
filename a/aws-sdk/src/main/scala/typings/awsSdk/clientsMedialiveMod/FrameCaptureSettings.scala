package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameCaptureSettings extends StObject {
  
  /**
    * The frequency at which to capture frames for inclusion in the output. May be specified in either seconds or milliseconds, as specified by captureIntervalUnits.
    */
  var CaptureInterval: js.UndefOr[integerMin1Max3600000] = js.undefined
  
  /**
    * Unit for the frame capture interval.
    */
  var CaptureIntervalUnits: js.UndefOr[FrameCaptureIntervalUnit] = js.undefined
}
object FrameCaptureSettings {
  
  inline def apply(): FrameCaptureSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameCaptureSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FrameCaptureSettings] (val x: Self) extends AnyVal {
    
    inline def setCaptureInterval(value: integerMin1Max3600000): Self = StObject.set(x, "CaptureInterval", value.asInstanceOf[js.Any])
    
    inline def setCaptureIntervalUndefined: Self = StObject.set(x, "CaptureInterval", js.undefined)
    
    inline def setCaptureIntervalUnits(value: FrameCaptureIntervalUnit): Self = StObject.set(x, "CaptureIntervalUnits", value.asInstanceOf[js.Any])
    
    inline def setCaptureIntervalUnitsUndefined: Self = StObject.set(x, "CaptureIntervalUnits", js.undefined)
  }
}
