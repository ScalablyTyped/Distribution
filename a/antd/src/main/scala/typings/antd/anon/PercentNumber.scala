package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PercentNumber extends StObject {
  
  var percent: Double
}
object PercentNumber {
  
  inline def apply(percent: Double): PercentNumber = {
    val __obj = js.Dynamic.literal(percent = percent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PercentNumber] (val x: Self) extends AnyVal {
    
    inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
  }
}
