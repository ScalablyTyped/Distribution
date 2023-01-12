package typings.angularDevkitCore.anon

import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schema[ContextT] extends StObject {
  
  var context: js.UndefOr[ContextT] = js.undefined
  
  var schema: js.UndefOr[JsonObject] = js.undefined
}
object Schema {
  
  inline def apply[ContextT](): Schema[ContextT] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schema[ContextT]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Schema[?], ContextT] (val x: Self & Schema[ContextT]) extends AnyVal {
    
    inline def setContext(value: ContextT): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setSchema(value: JsonObject): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
