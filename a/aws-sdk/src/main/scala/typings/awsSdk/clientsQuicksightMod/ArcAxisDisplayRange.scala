package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcAxisDisplayRange extends StObject {
  
  /**
    * The maximum value of the arc axis range.
    */
  var Max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum value of the arc axis range.
    */
  var Min: js.UndefOr[Double] = js.undefined
}
object ArcAxisDisplayRange {
  
  inline def apply(): ArcAxisDisplayRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArcAxisDisplayRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArcAxisDisplayRange] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "Max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "Min", js.undefined)
  }
}
