package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RangePoint extends StObject {
  
  val x: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  val y: js.UndefOr[Double | js.Array[Double]] = js.undefined
}
object RangePoint {
  
  inline def apply(): RangePoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RangePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RangePoint] (val x: Self) extends AnyVal {
    
    inline def setX(value: Double | js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: Double | js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
