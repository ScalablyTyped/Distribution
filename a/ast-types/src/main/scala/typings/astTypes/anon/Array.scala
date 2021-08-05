package typings.astTypes.anon

import org.scalablytyped.runtime.StringDictionary
import typings.astTypes.typesMod.Type
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Array extends StObject {
  
  var Date: Type[typings.std.Date]
  
  var RegExp: Type[typings.std.RegExp]
  
  var array: Type[js.Array[js.Any]]
  
  var boolean: Type[Boolean]
  
  var function: Type[js.Function]
  
  var `null`: Type[Null]
  
  var number: Type[Double]
  
  var `object`: Type[StringDictionary[js.Any]]
  
  var string: Type[String]
  
  var undefined: Type[Unit]
}
object Array {
  
  inline def apply(
    Date: Type[Date],
    RegExp: Type[RegExp],
    array: Type[js.Array[js.Any]],
    boolean: Type[Boolean],
    function: Type[js.Function],
    `null`: Type[Null],
    number: Type[Double],
    `object`: Type[StringDictionary[js.Any]],
    string: Type[String],
    undefined: Type[Unit]
  ): Array = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], RegExp = RegExp.asInstanceOf[js.Any], array = array.asInstanceOf[js.Any], boolean = boolean.asInstanceOf[js.Any], function = function.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], undefined = undefined.asInstanceOf[js.Any])
    __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Array]
  }
  
  extension [Self <: Array](x: Self) {
    
    inline def setArray(value: Type[js.Array[js.Any]]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setBoolean(value: Type[Boolean]): Self = StObject.set(x, "boolean", value.asInstanceOf[js.Any])
    
    inline def setDate(value: Type[Date]): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setFunction(value: Type[js.Function]): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setNull(value: Type[Null]): Self = StObject.set(x, "null", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Type[Double]): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setObject(value: Type[StringDictionary[js.Any]]): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setRegExp(value: Type[RegExp]): Self = StObject.set(x, "RegExp", value.asInstanceOf[js.Any])
    
    inline def setString(value: Type[String]): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setUndefined(value: Type[Unit]): Self = StObject.set(x, "undefined", value.asInstanceOf[js.Any])
  }
}
