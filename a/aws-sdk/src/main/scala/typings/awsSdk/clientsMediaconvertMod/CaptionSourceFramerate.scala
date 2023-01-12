package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptionSourceFramerate extends StObject {
  
  /**
    * Specify the denominator of the fraction that represents the frame rate for the setting Caption source frame rate (CaptionSourceFramerate). Use this setting along with the setting Framerate numerator (framerateNumerator).
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max1001] = js.undefined
  
  /**
    * Specify the numerator of the fraction that represents the frame rate for the setting Caption source frame rate (CaptionSourceFramerate). Use this setting along with the setting Framerate denominator (framerateDenominator).
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max60000] = js.undefined
}
object CaptionSourceFramerate {
  
  inline def apply(): CaptionSourceFramerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptionSourceFramerate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CaptionSourceFramerate] (val x: Self) extends AnyVal {
    
    inline def setFramerateDenominator(value: integerMin1Max1001): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1Max60000): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
  }
}
