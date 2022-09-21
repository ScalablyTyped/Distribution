package typings.ajv.anon

import typings.ajv.ajvBooleans.`true`
import typings.ajv.ajvStrings.`null`
import typings.ajv.jsonSchemaMod.JSONType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nullable[IsPartial /* <: Boolean */] extends StObject {
  
  var nullable: `true`
  
  var `type`: JSONType[`null`, IsPartial]
}
object Nullable {
  
  inline def apply[IsPartial /* <: Boolean */](): Nullable[IsPartial] = {
    val __obj = js.Dynamic.literal(nullable = true)
    __obj.asInstanceOf[Nullable[IsPartial]]
  }
  
  extension [Self <: Nullable[?], IsPartial /* <: Boolean */](x: Self & Nullable[IsPartial]) {
    
    inline def setNullable(value: `true`): Self = StObject.set(x, "nullable", value.asInstanceOf[js.Any])
    
    inline def setType(value: JSONType[`null`, IsPartial]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
