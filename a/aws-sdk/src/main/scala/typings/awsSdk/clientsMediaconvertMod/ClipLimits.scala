package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClipLimits extends StObject {
  
  /**
    * Specify the Maximum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that, when converted to RGB, would be outside the upper tolerance that you specify. Enter an integer from 90 to 105 as an offset percentage to the maximum possible value. Leave blank to use the default value 100. When you specify a value for Maximum RGB tolerance, you must set Sample range conversion to Limited range clip.
    */
  var MaximumRGBTolerance: js.UndefOr[integerMin90Max105] = js.undefined
  
  /**
    * Specify the Maximum YUV color sample limit. MediaConvert conforms any pixels in your input above the value that you specify to typical limited range bounds. Enter an integer from 920 to 1023. Leave blank to use the default value 940. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales this value down. When you specify a value for Maximum YUV, you must set Sample range conversion to Limited range clip.
    */
  var MaximumYUV: js.UndefOr[integerMin920Max1023] = js.undefined
  
  /**
    * Specify the Minimum RGB color sample range tolerance for your output. MediaConvert corrects any YUV values that, when converted to RGB, would be outside the lower tolerance that you specify. Enter an integer from -5 to 10 as an offset percentage to the minimum possible value. Leave blank to use the default value 0. When you specify a value for Minimum RGB tolerance, you must set Sample range conversion to Limited range clip.
    */
  var MinimumRGBTolerance: js.UndefOr[integerMinNegative5Max10] = js.undefined
  
  /**
    * Specify the Minimum YUV color sample limit. MediaConvert conforms any pixels in your input below the value that you specify to typical limited range bounds. Enter an integer from 0 to 128. Leave blank to use the default value 64. The value that you enter applies to 10-bit ranges. For 8-bit ranges, MediaConvert automatically scales this value down. When you specify a value for Minumum YUV, you must set Sample range conversion to Limited range clip.
    */
  var MinimumYUV: js.UndefOr[integerMin0Max128] = js.undefined
}
object ClipLimits {
  
  inline def apply(): ClipLimits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClipLimits]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClipLimits] (val x: Self) extends AnyVal {
    
    inline def setMaximumRGBTolerance(value: integerMin90Max105): Self = StObject.set(x, "MaximumRGBTolerance", value.asInstanceOf[js.Any])
    
    inline def setMaximumRGBToleranceUndefined: Self = StObject.set(x, "MaximumRGBTolerance", js.undefined)
    
    inline def setMaximumYUV(value: integerMin920Max1023): Self = StObject.set(x, "MaximumYUV", value.asInstanceOf[js.Any])
    
    inline def setMaximumYUVUndefined: Self = StObject.set(x, "MaximumYUV", js.undefined)
    
    inline def setMinimumRGBTolerance(value: integerMinNegative5Max10): Self = StObject.set(x, "MinimumRGBTolerance", value.asInstanceOf[js.Any])
    
    inline def setMinimumRGBToleranceUndefined: Self = StObject.set(x, "MinimumRGBTolerance", js.undefined)
    
    inline def setMinimumYUV(value: integerMin0Max128): Self = StObject.set(x, "MinimumYUV", value.asInstanceOf[js.Any])
    
    inline def setMinimumYUVUndefined: Self = StObject.set(x, "MinimumYUV", js.undefined)
  }
}
