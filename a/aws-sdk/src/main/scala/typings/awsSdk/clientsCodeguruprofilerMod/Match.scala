package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Match extends StObject {
  
  /**
    * The location in the profiling graph that contains a recommendation found during analysis.
    */
  var frameAddress: js.UndefOr[String] = js.undefined
  
  /**
    * The target frame that triggered a match.
    */
  var targetFramesIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * The value in the profile data that exceeded the recommendation threshold.
    */
  var thresholdBreachValue: js.UndefOr[Double] = js.undefined
}
object Match {
  
  inline def apply(): Match = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Match]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Match] (val x: Self) extends AnyVal {
    
    inline def setFrameAddress(value: String): Self = StObject.set(x, "frameAddress", value.asInstanceOf[js.Any])
    
    inline def setFrameAddressUndefined: Self = StObject.set(x, "frameAddress", js.undefined)
    
    inline def setTargetFramesIndex(value: Integer): Self = StObject.set(x, "targetFramesIndex", value.asInstanceOf[js.Any])
    
    inline def setTargetFramesIndexUndefined: Self = StObject.set(x, "targetFramesIndex", js.undefined)
    
    inline def setThresholdBreachValue(value: Double): Self = StObject.set(x, "thresholdBreachValue", value.asInstanceOf[js.Any])
    
    inline def setThresholdBreachValueUndefined: Self = StObject.set(x, "thresholdBreachValue", js.undefined)
  }
}
