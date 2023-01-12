package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FinalPadding extends StObject {
  
  var finalPadding: js.Array[Double]
  
  var finalSize: Double
}
object FinalPadding {
  
  inline def apply(finalPadding: js.Array[Double], finalSize: Double): FinalPadding = {
    val __obj = js.Dynamic.literal(finalPadding = finalPadding.asInstanceOf[js.Any], finalSize = finalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FinalPadding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FinalPadding] (val x: Self) extends AnyVal {
    
    inline def setFinalPadding(value: js.Array[Double]): Self = StObject.set(x, "finalPadding", value.asInstanceOf[js.Any])
    
    inline def setFinalPaddingVarargs(value: Double*): Self = StObject.set(x, "finalPadding", js.Array(value*))
    
    inline def setFinalSize(value: Double): Self = StObject.set(x, "finalSize", value.asInstanceOf[js.Any])
  }
}
