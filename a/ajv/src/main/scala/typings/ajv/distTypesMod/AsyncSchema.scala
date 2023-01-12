package typings.ajv.distTypesMod

import typings.ajv.ajvBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncSchema
  extends StObject
     with _SchemaObject
     with AnySchemaObject {
  
  @JSName("$async")
  var $async: `true`
}
object AsyncSchema {
  
  inline def apply(): AsyncSchema = {
    val __obj = js.Dynamic.literal($async = true)
    __obj.asInstanceOf[AsyncSchema]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncSchema] (val x: Self) extends AnyVal {
    
    inline def set$async(value: `true`): Self = StObject.set(x, "$async", value.asInstanceOf[js.Any])
  }
}
