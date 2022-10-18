package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAPODataDestinationProperties extends StObject {
  
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  var idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined
  
  /**
    * The object path specified in the SAPOData flow destination.
    */
  var objectPath: Object
  
  /**
    * Determines how Amazon AppFlow handles the success response that it gets from the connector after placing data. For example, this setting would determine where to write the response from a destination connector upon a successful insert operation.
    */
  var successResponseHandlingConfig: js.UndefOr[SuccessResponseHandlingConfig] = js.undefined
  
  var writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
}
object SAPODataDestinationProperties {
  
  inline def apply(objectPath: Object): SAPODataDestinationProperties = {
    val __obj = js.Dynamic.literal(objectPath = objectPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SAPODataDestinationProperties]
  }
  
  extension [Self <: SAPODataDestinationProperties](x: Self) {
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setIdFieldNames(value: IdFieldNameList): Self = StObject.set(x, "idFieldNames", value.asInstanceOf[js.Any])
    
    inline def setIdFieldNamesUndefined: Self = StObject.set(x, "idFieldNames", js.undefined)
    
    inline def setIdFieldNamesVarargs(value: Name*): Self = StObject.set(x, "idFieldNames", js.Array(value*))
    
    inline def setObjectPath(value: Object): Self = StObject.set(x, "objectPath", value.asInstanceOf[js.Any])
    
    inline def setSuccessResponseHandlingConfig(value: SuccessResponseHandlingConfig): Self = StObject.set(x, "successResponseHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setSuccessResponseHandlingConfigUndefined: Self = StObject.set(x, "successResponseHandlingConfig", js.undefined)
    
    inline def setWriteOperationType(value: WriteOperationType): Self = StObject.set(x, "writeOperationType", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationTypeUndefined: Self = StObject.set(x, "writeOperationType", js.undefined)
  }
}
