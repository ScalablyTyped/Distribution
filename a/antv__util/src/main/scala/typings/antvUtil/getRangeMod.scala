package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRangeMod {
  
  @JSImport("@antv/util/lib/lodash/get-range", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(values: js.Array[Double]): RangeType = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(values.asInstanceOf[js.Any]).asInstanceOf[RangeType]
  
  trait RangeType extends StObject {
    
    val max: Double
    
    val min: Double
  }
  object RangeType {
    
    inline def apply(max: Double, min: Double): RangeType = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeType]
    }
    
    extension [Self <: RangeType](x: Self) {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
