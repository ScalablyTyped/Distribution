package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEventsDetectionJobResponse extends StObject {
  
  /**
    * An object that contains the properties associated with an event detection job.
    */
  var EventsDetectionJobProperties: js.UndefOr[typings.awsSdk.clientsComprehendMod.EventsDetectionJobProperties] = js.undefined
}
object DescribeEventsDetectionJobResponse {
  
  inline def apply(): DescribeEventsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeEventsDetectionJobResponse]
  }
  
  extension [Self <: DescribeEventsDetectionJobResponse](x: Self) {
    
    inline def setEventsDetectionJobProperties(value: EventsDetectionJobProperties): Self = StObject.set(x, "EventsDetectionJobProperties", value.asInstanceOf[js.Any])
    
    inline def setEventsDetectionJobPropertiesUndefined: Self = StObject.set(x, "EventsDetectionJobProperties", js.undefined)
  }
}
