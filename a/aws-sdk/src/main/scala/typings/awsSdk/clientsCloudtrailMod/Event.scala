package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event extends StObject {
  
  /**
    * The Amazon Web Services access key ID that was used to sign the request. If the request was made with temporary security credentials, this is the access key ID of the temporary credentials.
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * A JSON string that contains a representation of the event returned.
    */
  var CloudTrailEvent: js.UndefOr[String] = js.undefined
  
  /**
    * The CloudTrail ID of the event returned.
    */
  var EventId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the event returned.
    */
  var EventName: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Web Services service to which the request was made.
    */
  var EventSource: js.UndefOr[String] = js.undefined
  
  /**
    * The date and time of the event returned.
    */
  var EventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about whether the event is a write event or a read event. 
    */
  var ReadOnly: js.UndefOr[String] = js.undefined
  
  /**
    * A list of resources referenced by the event returned.
    */
  var Resources: js.UndefOr[ResourceList] = js.undefined
  
  /**
    * A user name or role name of the requester that called the API in the event returned.
    */
  var Username: js.UndefOr[String] = js.undefined
}
object Event {
  
  inline def apply(): Event = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Event]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setCloudTrailEvent(value: String): Self = StObject.set(x, "CloudTrailEvent", value.asInstanceOf[js.Any])
    
    inline def setCloudTrailEventUndefined: Self = StObject.set(x, "CloudTrailEvent", js.undefined)
    
    inline def setEventId(value: String): Self = StObject.set(x, "EventId", value.asInstanceOf[js.Any])
    
    inline def setEventIdUndefined: Self = StObject.set(x, "EventId", js.undefined)
    
    inline def setEventName(value: String): Self = StObject.set(x, "EventName", value.asInstanceOf[js.Any])
    
    inline def setEventNameUndefined: Self = StObject.set(x, "EventName", js.undefined)
    
    inline def setEventSource(value: String): Self = StObject.set(x, "EventSource", value.asInstanceOf[js.Any])
    
    inline def setEventSourceUndefined: Self = StObject.set(x, "EventSource", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    inline def setReadOnly(value: String): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "ReadOnly", js.undefined)
    
    inline def setResources(value: ResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setUsername(value: String): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
