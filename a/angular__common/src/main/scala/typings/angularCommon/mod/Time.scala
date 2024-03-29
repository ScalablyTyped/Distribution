package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Time extends StObject {
  
  var hours: Double
  
  var minutes: Double
}
object Time {
  
  inline def apply(hours: Double, minutes: Double): Time = {
    val __obj = js.Dynamic.literal(hours = hours.asInstanceOf[js.Any], minutes = minutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Time]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Time] (val x: Self) extends AnyVal {
    
    inline def setHours(value: Double): Self = StObject.set(x, "hours", value.asInstanceOf[js.Any])
    
    inline def setMinutes(value: Double): Self = StObject.set(x, "minutes", value.asInstanceOf[js.Any])
  }
}
