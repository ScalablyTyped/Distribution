package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventLogEntry extends StObject {
  
  /**
    * The code of the error, if any.
    */
  var errorCode: js.UndefOr[String] = js.undefined
  
  /**
    * The category for the event.
    */
  var eventCategory: String
  
  /**
    * The name of the event.
    */
  var eventName: String
  
  /**
    * The source of the event.
    */
  var eventSource: String
  
  /**
    * The time the event took place, in coordinated universal time (UTC) timestamp format as specified in RFC 3339.
    */
  var eventTime: js.Date
  
  /**
    * The type of the event.
    */
  var eventType: String
  
  /**
    * The system-generated unique ID of the event.
    */
  var id: String
  
  /**
    * The type of the event.
    */
  var operationType: OperationType
  
  /**
    * Information about the project where the event occurred.
    */
  var projectInformation: js.UndefOr[ProjectInformation] = js.undefined
  
  /**
    * The system-generated unique ID of the request.
    */
  var requestId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the payload of the request.
    */
  var requestPayload: js.UndefOr[EventPayload] = js.undefined
  
  /**
    * Information about the payload of the response, if any.
    */
  var responsePayload: js.UndefOr[EventPayload] = js.undefined
  
  /**
    * The IP address of the user whose actions are recorded in the event.
    */
  var sourceIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var userAgent: js.UndefOr[String] = js.undefined
  
  /**
    * The system-generated unique ID of the user whose actions are recorded in the event.
    */
  var userIdentity: UserIdentity
}
object EventLogEntry {
  
  inline def apply(
    eventCategory: String,
    eventName: String,
    eventSource: String,
    eventTime: js.Date,
    eventType: String,
    id: String,
    operationType: OperationType,
    userIdentity: UserIdentity
  ): EventLogEntry = {
    val __obj = js.Dynamic.literal(eventCategory = eventCategory.asInstanceOf[js.Any], eventName = eventName.asInstanceOf[js.Any], eventSource = eventSource.asInstanceOf[js.Any], eventTime = eventTime.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], operationType = operationType.asInstanceOf[js.Any], userIdentity = userIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventLogEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventLogEntry] (val x: Self) extends AnyVal {
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setEventCategory(value: String): Self = StObject.set(x, "eventCategory", value.asInstanceOf[js.Any])
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOperationType(value: OperationType): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setProjectInformation(value: ProjectInformation): Self = StObject.set(x, "projectInformation", value.asInstanceOf[js.Any])
    
    inline def setProjectInformationUndefined: Self = StObject.set(x, "projectInformation", js.undefined)
    
    inline def setRequestId(value: String): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setRequestPayload(value: EventPayload): Self = StObject.set(x, "requestPayload", value.asInstanceOf[js.Any])
    
    inline def setRequestPayloadUndefined: Self = StObject.set(x, "requestPayload", js.undefined)
    
    inline def setResponsePayload(value: EventPayload): Self = StObject.set(x, "responsePayload", value.asInstanceOf[js.Any])
    
    inline def setResponsePayloadUndefined: Self = StObject.set(x, "responsePayload", js.undefined)
    
    inline def setSourceIpAddress(value: String): Self = StObject.set(x, "sourceIpAddress", value.asInstanceOf[js.Any])
    
    inline def setSourceIpAddressUndefined: Self = StObject.set(x, "sourceIpAddress", js.undefined)
    
    inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
    
    inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
    
    inline def setUserIdentity(value: UserIdentity): Self = StObject.set(x, "userIdentity", value.asInstanceOf[js.Any])
  }
}
