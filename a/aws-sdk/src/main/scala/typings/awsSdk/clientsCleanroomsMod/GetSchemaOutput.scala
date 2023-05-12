package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSchemaOutput extends StObject {
  
  /**
    * The entire schema object.
    */
  var schema: Schema
}
object GetSchemaOutput {
  
  inline def apply(schema: Schema): GetSchemaOutput = {
    val __obj = js.Dynamic.literal(schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSchemaOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSchemaOutput] (val x: Self) extends AnyVal {
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
  }
}
