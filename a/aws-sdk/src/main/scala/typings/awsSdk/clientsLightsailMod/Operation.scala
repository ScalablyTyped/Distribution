package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  /**
    * The timestamp when the operation was initialized (e.g., 1479816991.349).
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The error code.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The error details.
    */
  var errorDetails: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the operation.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A Boolean value indicating whether the operation is terminal.
    */
  var isTerminal: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Web Services Region and Availability Zone.
    */
  var location: js.UndefOr[ResourceLocation] = js.undefined
  
  /**
    * Details about the operation (e.g., Debian-1GB-Ohio-1).
    */
  var operationDetails: js.UndefOr[String] = js.undefined
  
  /**
    * The type of operation. 
    */
  var operationType: js.UndefOr[OperationType] = js.undefined
  
  /**
    * The resource name.
    */
  var resourceName: js.UndefOr[ResourceName] = js.undefined
  
  /**
    * The resource type. 
    */
  var resourceType: js.UndefOr[ResourceType] = js.undefined
  
  /**
    * The status of the operation. 
    */
  var status: js.UndefOr[OperationStatus] = js.undefined
  
  /**
    * The timestamp when the status was changed (e.g., 1479816991.349).
    */
  var statusChangedAt: js.UndefOr[js.Date] = js.undefined
}
object Operation {
  
  inline def apply(): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorDetails(value: String): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    inline def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsTerminal(value: Boolean): Self = StObject.set(x, "isTerminal", value.asInstanceOf[js.Any])
    
    inline def setIsTerminalUndefined: Self = StObject.set(x, "isTerminal", js.undefined)
    
    inline def setLocation(value: ResourceLocation): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setOperationDetails(value: String): Self = StObject.set(x, "operationDetails", value.asInstanceOf[js.Any])
    
    inline def setOperationDetailsUndefined: Self = StObject.set(x, "operationDetails", js.undefined)
    
    inline def setOperationType(value: OperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setResourceName(value: ResourceName): Self = StObject.set(x, "resourceName", value.asInstanceOf[js.Any])
    
    inline def setResourceNameUndefined: Self = StObject.set(x, "resourceName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusChangedAt(value: js.Date): Self = StObject.set(x, "statusChangedAt", value.asInstanceOf[js.Any])
    
    inline def setStatusChangedAtUndefined: Self = StObject.set(x, "statusChangedAt", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
