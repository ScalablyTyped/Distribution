package typings.antDesignProUtils.anon

import typings.antDesignProUtils.typesMod.ProFieldValueType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DateFormat extends StObject {
  
  var dateFormat: String
  
  var valueType: ProFieldValueType
}
object DateFormat {
  
  inline def apply(dateFormat: String, valueType: ProFieldValueType): DateFormat = {
    val __obj = js.Dynamic.literal(dateFormat = dateFormat.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateFormat]
  }
  
  extension [Self <: DateFormat](x: Self) {
    
    inline def setDateFormat(value: String): Self = StObject.set(x, "dateFormat", value.asInstanceOf[js.Any])
    
    inline def setValueType(value: ProFieldValueType): Self = StObject.set(x, "valueType", value.asInstanceOf[js.Any])
  }
}
