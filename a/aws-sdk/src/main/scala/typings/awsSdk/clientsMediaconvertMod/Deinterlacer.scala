package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Deinterlacer extends StObject {
  
  /**
    * Only applies when you set Deinterlace mode to Deinterlace or Adaptive. Interpolate produces sharper pictures, while blend produces smoother motion. If your source file includes a ticker, such as a scrolling headline at the bottom of the frame: Choose Interpolate ticker or Blend ticker. To apply field doubling: Choose Linear interpolation. Note that Linear interpolation may introduce video artifacts into your output.
    */
  var Algorithm: js.UndefOr[DeinterlaceAlgorithm] = js.undefined
  
  /**
    * - When set to NORMAL (default), the deinterlacer does not convert frames that are tagged in metadata as progressive. It will only convert those that are tagged as some other type. - When set to FORCE_ALL_FRAMES, the deinterlacer converts every frame to progressive - even those that are already tagged as progressive. Turn Force mode on only if there is a good chance that the metadata has tagged frames as progressive when they are not progressive. Do not turn on otherwise; processing frames that are already progressive into progressive will probably result in lower quality video.
    */
  var Control: js.UndefOr[DeinterlacerControl] = js.undefined
  
  /**
    * Use Deinterlacer (DeinterlaceMode) to choose how the service will do deinterlacing. Default is Deinterlace. - Deinterlace converts interlaced to progressive. - Inverse telecine converts Hard Telecine 29.97i to progressive 23.976p. - Adaptive auto-detects and converts to progressive.
    */
  var Mode: js.UndefOr[DeinterlacerMode] = js.undefined
}
object Deinterlacer {
  
  inline def apply(): Deinterlacer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Deinterlacer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Deinterlacer] (val x: Self) extends AnyVal {
    
    inline def setAlgorithm(value: DeinterlaceAlgorithm): Self = StObject.set(x, "Algorithm", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmUndefined: Self = StObject.set(x, "Algorithm", js.undefined)
    
    inline def setControl(value: DeinterlacerControl): Self = StObject.set(x, "Control", value.asInstanceOf[js.Any])
    
    inline def setControlUndefined: Self = StObject.set(x, "Control", js.undefined)
    
    inline def setMode(value: DeinterlacerMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "Mode", js.undefined)
  }
}
