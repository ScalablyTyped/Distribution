package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolationParameters extends StObject {
  
  /**
    * The interpolation type.
    */
  var interpolationType: js.UndefOr[InterpolationType] = js.undefined
  
  /**
    * The interpolation time interval in seconds.
    */
  var intervalInSeconds: js.UndefOr[IntervalInSeconds] = js.undefined
}
object InterpolationParameters {
  
  inline def apply(): InterpolationParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InterpolationParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolationParameters] (val x: Self) extends AnyVal {
    
    inline def setInterpolationType(value: InterpolationType): Self = StObject.set(x, "interpolationType", value.asInstanceOf[js.Any])
    
    inline def setInterpolationTypeUndefined: Self = StObject.set(x, "interpolationType", js.undefined)
    
    inline def setIntervalInSeconds(value: IntervalInSeconds): Self = StObject.set(x, "intervalInSeconds", value.asInstanceOf[js.Any])
    
    inline def setIntervalInSecondsUndefined: Self = StObject.set(x, "intervalInSeconds", js.undefined)
  }
}
