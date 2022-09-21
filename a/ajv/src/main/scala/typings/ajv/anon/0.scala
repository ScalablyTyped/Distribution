package typings.ajv.anon

import typings.ajv.ajvStrings.string
import typings.ajv.jsonSchemaMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[IsPartial /* <: Boolean */] extends StObject {
  
  var `type`: JSONType[string, IsPartial]
}
object `0` {
  
  inline def apply[IsPartial /* <: Boolean */](): `0`[IsPartial] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`[IsPartial]]
  }
  
  extension [Self <: `0`[?], IsPartial /* <: Boolean */](x: Self & `0`[IsPartial]) {
    
    inline def setType(value: JSONType[string, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
