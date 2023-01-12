package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolinSize extends StObject {
  
  var violinSize: js.Array[Double]
  
  var violinY: js.Array[Double]
}
object ViolinSize {
  
  inline def apply(violinSize: js.Array[Double], violinY: js.Array[Double]): ViolinSize = {
    val __obj = js.Dynamic.literal(violinSize = violinSize.asInstanceOf[js.Any], violinY = violinY.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViolinSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViolinSize] (val x: Self) extends AnyVal {
    
    inline def setViolinSize(value: js.Array[Double]): Self = StObject.set(x, "violinSize", value.asInstanceOf[js.Any])
    
    inline def setViolinSizeVarargs(value: Double*): Self = StObject.set(x, "violinSize", js.Array(value*))
    
    inline def setViolinY(value: js.Array[Double]): Self = StObject.set(x, "violinY", value.asInstanceOf[js.Any])
    
    inline def setViolinYVarargs(value: Double*): Self = StObject.set(x, "violinY", js.Array(value*))
  }
}
