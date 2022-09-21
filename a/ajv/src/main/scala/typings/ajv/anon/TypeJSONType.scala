package typings.ajv.anon

import typings.ajv.ajvStrings.integer
import typings.ajv.ajvStrings.number
import typings.ajv.jsonSchemaMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeJSONType[IsPartial /* <: Boolean */] extends StObject {
  
  var `type`: JSONType[number | integer, IsPartial]
}
object TypeJSONType {
  
  inline def apply[IsPartial /* <: Boolean */](): TypeJSONType[IsPartial] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeJSONType[IsPartial]]
  }
  
  extension [Self <: TypeJSONType[?], IsPartial /* <: Boolean */](x: Self & TypeJSONType[IsPartial]) {
    
    inline def setType(value: JSONType[number | integer, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
