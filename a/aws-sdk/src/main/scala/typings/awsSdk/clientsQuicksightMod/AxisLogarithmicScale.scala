package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLogarithmicScale extends StObject {
  
  /**
    * The base setup of a logarithmic axis scale.
    */
  var Base: js.UndefOr[Double] = js.undefined
}
object AxisLogarithmicScale {
  
  inline def apply(): AxisLogarithmicScale = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLogarithmicScale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLogarithmicScale] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Double): Self = StObject.set(x, "Base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "Base", js.undefined)
  }
}
