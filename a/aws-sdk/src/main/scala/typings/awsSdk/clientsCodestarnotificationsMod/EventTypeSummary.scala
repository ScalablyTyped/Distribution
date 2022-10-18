package typings.awsSdk.clientsCodestarnotificationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventTypeSummary extends StObject {
  
  /**
    * The system-generated ID of the event. For a complete list of event types and IDs, see Notification concepts in the Developer Tools Console User Guide.
    */
  var EventTypeId: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.EventTypeId] = js.undefined
  
  /**
    * The name of the event.
    */
  var EventTypeName: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.EventTypeName] = js.undefined
  
  /**
    * The resource type of the event.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.ResourceType] = js.undefined
  
  /**
    * The name of the service for which the event applies.
    */
  var ServiceName: js.UndefOr[typings.awsSdk.clientsCodestarnotificationsMod.ServiceName] = js.undefined
}
object EventTypeSummary {
  
  inline def apply(): EventTypeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventTypeSummary]
  }
  
  extension [Self <: EventTypeSummary](x: Self) {
    
    inline def setEventTypeId(value: EventTypeId): Self = StObject.set(x, "EventTypeId", value.asInstanceOf[js.Any])
    
    inline def setEventTypeIdUndefined: Self = StObject.set(x, "EventTypeId", js.undefined)
    
    inline def setEventTypeName(value: EventTypeName): Self = StObject.set(x, "EventTypeName", value.asInstanceOf[js.Any])
    
    inline def setEventTypeNameUndefined: Self = StObject.set(x, "EventTypeName", js.undefined)
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setServiceName(value: ServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
  }
}
