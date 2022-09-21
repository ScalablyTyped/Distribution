package typings.ajv.anon

import typings.ajv.ajvStrings.boolean
import typings.ajv.jsonSchemaMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[IsPartial /* <: Boolean */] extends StObject {
  
  var `type`: JSONType[boolean, IsPartial]
}
object `1` {
  
  inline def apply[IsPartial /* <: Boolean */](): `1`[IsPartial] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`[IsPartial]]
  }
  
  extension [Self <: `1`[?], IsPartial /* <: Boolean */](x: Self & `1`[IsPartial]) {
    
    inline def setType(value: JSONType[boolean, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
