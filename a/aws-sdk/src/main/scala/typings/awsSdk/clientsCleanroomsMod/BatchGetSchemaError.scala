package typings.awsSdk.clientsCleanroomsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetSchemaError extends StObject {
  
  /**
    * An error code for the error. 
    */
  var code: String
  
  /**
    * An error message for the error.
    */
  var message: String
  
  /**
    * An error name for the error.
    */
  var name: TableAlias
}
object BatchGetSchemaError {
  
  inline def apply(code: String, message: String, name: TableAlias): BatchGetSchemaError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetSchemaError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchGetSchemaError] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: TableAlias): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
