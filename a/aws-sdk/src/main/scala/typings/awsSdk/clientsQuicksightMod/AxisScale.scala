package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisScale extends StObject {
  
  /**
    * The linear axis scale setup.
    */
  var Linear: js.UndefOr[AxisLinearScale] = js.undefined
  
  /**
    * The logarithmic axis scale setup.
    */
  var Logarithmic: js.UndefOr[AxisLogarithmicScale] = js.undefined
}
object AxisScale {
  
  inline def apply(): AxisScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisScale] (val x: Self) extends AnyVal {
    
    inline def setLinear(value: AxisLinearScale): Self = StObject.set(x, "Linear", value.asInstanceOf[js.Any])
    
    inline def setLinearUndefined: Self = StObject.set(x, "Linear", js.undefined)
    
    inline def setLogarithmic(value: AxisLogarithmicScale): Self = StObject.set(x, "Logarithmic", value.asInstanceOf[js.Any])
    
    inline def setLogarithmicUndefined: Self = StObject.set(x, "Logarithmic", js.undefined)
  }
}
