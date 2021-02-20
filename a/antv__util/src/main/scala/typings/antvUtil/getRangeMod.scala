package typings.antvUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRangeMod {
  
  @JSImport("@antv/util/lib/get-range", JSImport.Default)
  @js.native
  def default(values: js.Array[Double]): RangeType = js.native
  
  @js.native
  trait RangeType extends StObject {
    
    val max: Double = js.native
    
    val min: Double = js.native
  }
  object RangeType {
    
    @scala.inline
    def apply(max: Double, min: Double): RangeType = {
      val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeType]
    }
    
    @scala.inline
    implicit class RangeTypeMutableBuilder[Self <: RangeType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    }
  }
}
