package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentNumber extends StObject {
  
  var percent: Double
  
  var `type`: String
}
object PercentNumber {
  
  inline def apply(percent: Double, `type`: String): PercentNumber = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PercentNumber] (val x: Self) extends AnyVal {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
