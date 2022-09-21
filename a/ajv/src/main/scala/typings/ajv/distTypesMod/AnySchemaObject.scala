package typings.ajv.distTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.ajv.distTypesMod.SchemaObject
  - typings.ajv.distTypesMod.AsyncSchema
*/
trait AnySchemaObject extends StObject
object AnySchemaObject {
  
  inline def AsyncSchema(): typings.ajv.distTypesMod.AsyncSchema = {
    val __obj = js.Dynamic.literal($async = true)
    __obj.asInstanceOf[typings.ajv.distTypesMod.AsyncSchema]
  }
  
  inline def SchemaObject(): typings.ajv.distTypesMod.SchemaObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.ajv.distTypesMod.SchemaObject]
  }
}
