package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEventIntegrationRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If not provided, the Amazon Web Services SDK populates this field. For more information about idempotency, see Making retries safe with idempotent APIs.
    */
  var ClientToken: js.UndefOr[IdempotencyToken] = js.undefined
  
  /**
    * The description of the event integration.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * The EventBridge bus.
    */
  var EventBridgeBus: typings.awsSdk.clientsAppintegrationsMod.EventBridgeBus
  
  /**
    * The event filter.
    */
  var EventFilter: typings.awsSdk.clientsAppintegrationsMod.EventFilter
  
  /**
    * The name of the event integration.
    */
  var Name: typings.awsSdk.clientsAppintegrationsMod.Name
  
  /**
    * The tags used to organize, track, or control access for this resource. For example, { "tags": {"key1":"value1", "key2":"value2"} }.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateEventIntegrationRequest {
  
  inline def apply(EventBridgeBus: EventBridgeBus, EventFilter: EventFilter, Name: Name): CreateEventIntegrationRequest = {
    val __obj = js.Dynamic.literal(EventBridgeBus = EventBridgeBus.asInstanceOf[js.Any], EventFilter = EventFilter.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEventIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: IdempotencyToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBridgeBus(value: EventBridgeBus): Self = StObject.set(x, "EventBridgeBus", value.asInstanceOf[js.Any])
    
    inline def setEventFilter(value: EventFilter): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
