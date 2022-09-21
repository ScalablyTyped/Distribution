package typings.ajv.anon

import typings.ajv.typesJtdSchemaMod.EnumString
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnumArray[T] extends StObject {
  
  var `enum`: js.Array[EnumString[Exclude[T, Null]]]
}
object EnumArray {
  
  inline def apply[T](`enum`: js.Array[EnumString[Exclude[T, Null]]]): EnumArray[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enum")(`enum`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnumArray[T]]
  }
  
  extension [Self <: EnumArray[?], T](x: Self & EnumArray[T]) {
    
    inline def setEnum(value: js.Array[EnumString[Exclude[T, Null]]]): Self = StObject.set(x, "enum", value.asInstanceOf[js.Any])
    
    inline def setEnumVarargs(value: (EnumString[Exclude[T, Null]])*): Self = StObject.set(x, "enum", js.Array(value*))
  }
}
