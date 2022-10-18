package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MotionImageInsertionFramerate extends StObject {
  
  /**
    * The bottom of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 1.
    */
  var FramerateDenominator: js.UndefOr[integerMin1Max17895697] = js.undefined
  
  /**
    * The top of the fraction that expresses your overlay frame rate. For example, if your frame rate is 24 fps, set this value to 24.
    */
  var FramerateNumerator: js.UndefOr[integerMin1Max2147483640] = js.undefined
}
object MotionImageInsertionFramerate {
  
  inline def apply(): MotionImageInsertionFramerate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MotionImageInsertionFramerate]
  }
  
  extension [Self <: MotionImageInsertionFramerate](x: Self) {
    
    inline def setFramerateDenominator(value: integerMin1Max17895697): Self = StObject.set(x, "FramerateDenominator", value.asInstanceOf[js.Any])
    
    inline def setFramerateDenominatorUndefined: Self = StObject.set(x, "FramerateDenominator", js.undefined)
    
    inline def setFramerateNumerator(value: integerMin1Max2147483640): Self = StObject.set(x, "FramerateNumerator", value.asInstanceOf[js.Any])
    
    inline def setFramerateNumeratorUndefined: Self = StObject.set(x, "FramerateNumerator", js.undefined)
  }
}
