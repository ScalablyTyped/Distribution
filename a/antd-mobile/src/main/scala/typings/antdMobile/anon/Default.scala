package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default extends StObject {
  
  var default: String
  
  var array: Len
  
  var date: Format
  
  var `enum`: String
  
  var number: Len
  
  var pattern: Mismatch
  
  var required: String
  
  var string: Len
  
  var types: Array
  
  var whitespace: String
}
object Default {
  
  inline def apply(
    array: Len,
    date: Format,
    default: String,
    `enum`: String,
    number: Len,
    pattern: Mismatch,
    required: String,
    string: Len,
    types: Array,
    whitespace: String
  ): Default = {
    val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], default = default.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any], whitespace = whitespace.asInstanceOf[js.Any])
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default]
  }
  
  extension [Self <: Default](x: Self) {
    
    inline def setArray(value: Len): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Format): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDefault(value: String): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setEnum(value: String): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Len): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: Mismatch): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setRequired(value: String): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
    
    inline def setString(value: Len): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: Array): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setWhitespace(value: String): Self = StObject.set(x, "whitespace", value.asInstanceOf[js.Any])
  }
}
