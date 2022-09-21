package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceDestinationProperties extends StObject {
  
  /**
    *  The settings that determine how Amazon AppFlow handles an error when placing data in the Salesforce destination. For example, this setting would determine if the flow should fail after one insertion error, or continue and attempt to insert every record regardless of the initial failure. ErrorHandlingConfig is a part of the destination connector details. 
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    *  The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update or delete. 
    */
  var idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined
  
  /**
    *  The object specified in the Salesforce flow destination. 
    */
  var `object`: Object
  
  /**
    *  This specifies the type of write operation to be performed in Salesforce. When the value is UPSERT, then idFieldNames is required. 
    */
  var writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
}
object SalesforceDestinationProperties {
  
  inline def apply(`object`: Object): SalesforceDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceDestinationProperties]
  }
  
  extension [Self <: SalesforceDestinationProperties](x: Self) {
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setIdFieldNames(value: IdFieldNameList): Self = StObject.set(x, "idFieldNames", value.asInstanceOf[js.Any])
    
    inline def setIdFieldNamesUndefined: Self = StObject.set(x, "idFieldNames", js.undefined)
    
    inline def setIdFieldNamesVarargs(value: Name*): Self = StObject.set(x, "idFieldNames", js.Array(value*))
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationType(value: WriteOperationType): Self = StObject.set(x, "writeOperationType", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationTypeUndefined: Self = StObject.set(x, "writeOperationType", js.undefined)
  }
}
