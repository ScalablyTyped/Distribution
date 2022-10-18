package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskStartFailedEventDetails extends StObject {
  
  /**
    * A more detailed explanation of the cause of the failure.
    */
  var cause: js.UndefOr[SensitiveCause] = js.undefined
  
  /**
    * The error code of the failure.
    */
  var error: js.UndefOr[SensitiveError] = js.undefined
  
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
}
object TaskStartFailedEventDetails {
  
  inline def apply(resource: Name, resourceType: Name): TaskStartFailedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStartFailedEventDetails]
  }
  
  extension [Self <: TaskStartFailedEventDetails](x: Self) {
    
    inline def setCause(value: SensitiveCause): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setError(value: SensitiveError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setResource(value: Name): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: Name): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
