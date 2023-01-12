package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomConnectorDestinationProperties extends StObject {
  
  /**
    * The custom properties that are specific to the connector when it's used as a destination in the flow.
    */
  var customProperties: js.UndefOr[CustomProperties] = js.undefined
  
  /**
    * The entity specified in the custom connector as a destination in the flow.
    */
  var entityName: EntityName
  
  /**
    * The settings that determine how Amazon AppFlow handles an error when placing data in the custom connector as destination.
    */
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    * The name of the field that Amazon AppFlow uses as an ID when performing a write operation such as update, delete, or upsert.
    */
  var idFieldNames: js.UndefOr[IdFieldNameList] = js.undefined
  
  /**
    * Specifies the type of write operation to be performed in the custom connector when it's used as destination.
    */
  var writeOperationType: js.UndefOr[WriteOperationType] = js.undefined
}
object CustomConnectorDestinationProperties {
  
  inline def apply(entityName: EntityName): CustomConnectorDestinationProperties = {
    val __obj = js.Dynamic.literal(entityName = entityName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomConnectorDestinationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomConnectorDestinationProperties] (val x: Self) extends AnyVal {
    
    inline def setCustomProperties(value: CustomProperties): Self = StObject.set(x, "customProperties", value.asInstanceOf[js.Any])
    
    inline def setCustomPropertiesUndefined: Self = StObject.set(x, "customProperties", js.undefined)
    
    inline def setEntityName(value: EntityName): Self = StObject.set(x, "entityName", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setIdFieldNames(value: IdFieldNameList): Self = StObject.set(x, "idFieldNames", value.asInstanceOf[js.Any])
    
    inline def setIdFieldNamesUndefined: Self = StObject.set(x, "idFieldNames", js.undefined)
    
    inline def setIdFieldNamesVarargs(value: Name*): Self = StObject.set(x, "idFieldNames", js.Array(value*))
    
    inline def setWriteOperationType(value: WriteOperationType): Self = StObject.set(x, "writeOperationType", value.asInstanceOf[js.Any])
    
    inline def setWriteOperationTypeUndefined: Self = StObject.set(x, "writeOperationType", js.undefined)
  }
}
