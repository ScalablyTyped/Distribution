package typings.ajv.anon

import typings.ajv.ajvStrings.boolean
import typings.ajv.ajvStrings.integer
import typings.ajv.ajvStrings.number
import typings.ajv.ajvStrings.string
import typings.ajv.jsonSchemaMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeArray[T, IsPartial /* <: Boolean */] extends StObject {
  
  var `type`: js.Array[JSONType[boolean | string | number | integer, IsPartial]]
}
object TypeArray {
  
  inline def apply[T, IsPartial /* <: Boolean */](`type`: js.Array[JSONType[boolean | string | number | integer, IsPartial]]): TypeArray[T, IsPartial] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeArray[T, IsPartial]]
  }
  
  extension [Self <: TypeArray[?, ?], T, IsPartial /* <: Boolean */](x: Self & (TypeArray[T, IsPartial])) {
    
    inline def setType(value: js.Array[JSONType[boolean | string | number | integer, IsPartial]]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: (JSONType[boolean | string | number | integer, IsPartial])*): Self = StObject.set(x, "type", js.Array(value*))
  }
}
