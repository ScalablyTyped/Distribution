package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZendeskDestinationProperties extends StObject {
  
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  var idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined
  
  /**
    * The object specified in the Zendesk flow destination.
    */
  var `object`: Object
  
  var writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
}
object ZendeskDestinationProperties {
  
  inline def apply(`object`: Object): ZendeskDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZendeskDestinationProperties]
  }
  
  extension [Self <: ZendeskDestinationProperties](x: Self) {
    
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
