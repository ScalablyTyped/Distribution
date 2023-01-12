package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineDashArray extends StObject {
  
  var lineDash: js.Array[Double]
}
object LineDashArray {
  
  inline def apply(lineDash: js.Array[Double]): LineDashArray = {
    val __obj = js.Dynamic.literal(lineDash = lineDash.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineDashArray]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineDashArray] (val x: Self) extends AnyVal {
    
    inline def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
    
    inline def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value*))
  }
}
