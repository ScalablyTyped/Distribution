package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetFieldResponse extends StObject {
  
  /**
    * A list of field errors. 
    */
  var errors: BatchGetFieldResponseErrorsList
  
  /**
    * A list of detailed field information. 
    */
  var fields: BatchGetFieldResponseFieldsList
}
object BatchGetFieldResponse {
  
  inline def apply(errors: BatchGetFieldResponseErrorsList, fields: BatchGetFieldResponseFieldsList): BatchGetFieldResponse = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetFieldResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetFieldResponse] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: BatchGetFieldResponseErrorsList): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: FieldError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setFields(value: BatchGetFieldResponseFieldsList): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: GetFieldResponse*): Self = StObject.set(x, "fields", js.Array(value*))
  }
}
