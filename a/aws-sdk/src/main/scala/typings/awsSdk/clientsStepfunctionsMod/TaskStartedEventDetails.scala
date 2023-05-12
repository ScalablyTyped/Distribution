package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskStartedEventDetails extends StObject {
  
  /**
    * The action of the resource called by a task state.
    */
  var resource: Name
  
  /**
    * The service name of the resource in a task state.
    */
  var resourceType: Name
}
object TaskStartedEventDetails {
  
  inline def apply(resource: Name, resourceType: Name): TaskStartedEventDetails = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskStartedEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskStartedEventDetails] (val x: Self) extends AnyVal {
    
    inline def setResource(value: Name): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: Name): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
