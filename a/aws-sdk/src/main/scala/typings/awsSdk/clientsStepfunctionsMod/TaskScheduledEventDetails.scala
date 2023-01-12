package typings.awsSdk.clientsStepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskScheduledEventDetails extends StObject {
  
  /**
    * The maximum allowed duration between two heartbeats for the task.
    */
  var heartbeatInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
  
  /**
    * The JSON data passed to the resource referenced in a task state. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var parameters: ConnectorParameters
  
  /**
    * The region of the scheduled task
    */
  var region: Name
  
  /**
    * The service name of the resource in a task state.
    */
  var resource: Name
  
  /**
    * The action of the resource called by a task state.
    */
  var resourceType: Name
  
  /**
    * The maximum allowed duration of the task.
    */
  var timeoutInSeconds: js.UndefOr[TimeoutInSeconds] = js.undefined
}
object TaskScheduledEventDetails {
  
  inline def apply(parameters: ConnectorParameters, region: Name, resource: Name, resourceType: Name): TaskScheduledEventDetails = {
    val __obj = js.Dynamic.literal(parameters = parameters.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskScheduledEventDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskScheduledEventDetails] (val x: Self) extends AnyVal {
    
    inline def setHeartbeatInSeconds(value: TimeoutInSeconds): Self = StObject.set(x, "heartbeatInSeconds", value.asInstanceOf[js.Any])
    
    inline def setHeartbeatInSecondsUndefined: Self = StObject.set(x, "heartbeatInSeconds", js.undefined)
    
    inline def setParameters(value: ConnectorParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setRegion(value: Name): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setResource(value: Name): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: Name): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSeconds(value: TimeoutInSeconds): Self = StObject.set(x, "timeoutInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInSecondsUndefined: Self = StObject.set(x, "timeoutInSeconds", js.undefined)
  }
}
