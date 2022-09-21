package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  var array: String
  
  var boolean: String
  
  var date: String
  
  var email: String
  
  var float: String
  
  var hex: String
  
  var integer: String
  
  var method: String
  
  var number: String
  
  var `object`: String
  
  var regexp: String
  
  var string: String
  
  var url: String
}
object Array {
  
  inline def apply(
    array: String,
    boolean: String,
    date: String,
    email: String,
    float: String,
    hex: String,
    integer: String,
    method: String,
    number: String,
    `object`: String,
    regexp: String,
    string: String,
    url: String
  ): Array = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], hex = hex.asInstanceOf[js.Any], integer = integer.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: String): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setBoolean(value: String): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFloat(value: String): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
    
    inline def setHex(value: String): Self = StObject.set(x, "hex", value.asInstanceOf[js.Any])
    
    inline def setInteger(value: String): Self = StObject.set(x, "integer", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setObject(value: String): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRegexp(value: String): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
