package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckSchemaVersionValidityResponse extends StObject {
  
  /**
    * A validation failure error message.
    */
  var Error: js.UndefOr[SchemaValidationError] = js.undefined
  
  /**
    * Return true, if the schema is valid and false otherwise.
    */
  var Valid: js.UndefOr[IsVersionValid] = js.undefined
}
object CheckSchemaVersionValidityResponse {
  
  inline def apply(): CheckSchemaVersionValidityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckSchemaVersionValidityResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckSchemaVersionValidityResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: SchemaValidationError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setValid(value: IsVersionValid): Self = StObject.set(x, "Valid", value.asInstanceOf[js.Any])
    
    inline def setValidUndefined: Self = StObject.set(x, "Valid", js.undefined)
  }
}
