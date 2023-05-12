package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetSchemaOutput extends StObject {
  
  /**
    * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be retrieved.
    */
  var errors: BatchGetSchemaErrorList
  
  /**
    * The retrieved list of schemas.
    */
  var schemas: SchemaList
}
object BatchGetSchemaOutput {
  
  inline def apply(errors: BatchGetSchemaErrorList, schemas: SchemaList): BatchGetSchemaOutput = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], schemas = schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetSchemaOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetSchemaOutput] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchGetSchemaErrorList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: BatchGetSchemaError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setSchemas(value: SchemaList): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasVarargs(value: Schema*): Self = StObject.set(x, "schemas", js.Array(value*))
  }
}
