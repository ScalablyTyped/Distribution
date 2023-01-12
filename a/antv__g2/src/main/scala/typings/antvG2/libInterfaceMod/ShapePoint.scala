package typings.antvG2.libInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapePoint extends StObject {
  
  /**
    * @title 大小
    */
  var size: js.UndefOr[Double] = js.undefined
  
  /**
    * @title 数据点映射后对应 x 的值。
    */
  val x: Double | js.Array[Double]
  
  /**
    * @title 数据点映射后对应 y 的值。
    */
  val y: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * @title 数据在 y 方向的最小值。
    */
  val y0: js.UndefOr[Double] = js.undefined
}
object ShapePoint {
  
  inline def apply(x: Double | js.Array[Double]): ShapePoint = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapePoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShapePoint] (val x: Self) extends AnyVal {
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setX(value: Double | js.Array[Double]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value*))
    
    inline def setY(value: Double | js.Array[Double]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setY0Undefined: Self = StObject.set(x, "y0", js.undefined)
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    
    inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value*))
  }
}
