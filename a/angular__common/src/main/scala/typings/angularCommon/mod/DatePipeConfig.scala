package typings.angularCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatePipeConfig extends StObject {
  
  var dateFormat: String
  
  var timezone: String
}
object DatePipeConfig {
  
  inline def apply(dateFormat: String, timezone: String): DatePipeConfig = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatePipeConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DatePipeConfig] (val x: Self) extends AnyVal {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
  }
}
