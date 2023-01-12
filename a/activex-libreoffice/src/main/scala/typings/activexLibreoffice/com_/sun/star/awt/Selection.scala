package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a numerical range. */
trait Selection extends StObject {
  
  /** specifies the upper limit of the range. */
  var Max: Double
  
  /** specifies the lower limit of the range. */
  var Min: Double
}
object Selection {
  
  inline def apply(Max: Double, Min: Double): Selection = {
    val __obj = js.Dynamic.literal(Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "Max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "Min", value.asInstanceOf[js.Any])
  }
}
