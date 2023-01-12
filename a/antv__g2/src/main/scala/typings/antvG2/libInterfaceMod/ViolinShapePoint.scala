package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolinShapePoint
  extends StObject
     with ShapePoint {
  
  var _size: js.UndefOr[js.Array[Double]] = js.undefined
}
object ViolinShapePoint {
  
  inline def apply(x: Double | js.Array[Double]): ViolinShapePoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolinShapePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViolinShapePoint] (val x: Self) extends AnyVal {
    
    inline def set_size(value: js.Array[Double]): Self = StObject.set(x, "_size", value.asInstanceOf[js.Any])
    
    inline def set_sizeUndefined: Self = StObject.set(x, "_size", js.undefined)
    
    inline def set_sizeVarargs(value: Double*): Self = StObject.set(x, "_size", js.Array(value*))
  }
}
