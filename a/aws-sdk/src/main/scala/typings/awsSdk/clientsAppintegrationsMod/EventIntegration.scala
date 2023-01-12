package typings.awsSdk.clientsAppintegrationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventIntegration extends StObject {
  
  /**
    * The event integration description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Description] = js.undefined
  
  /**
    * The Amazon EventBridge bus for the event integration.
    */
  var EventBridgeBus: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.EventBridgeBus] = js.undefined
  
  /**
    * The event integration filter.
    */
  var EventFilter: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.EventFilter] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the event integration.
    */
  var EventIntegrationArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the event integration.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsAppintegrationsMod.Name] = js.undefined
  
  /**
    * The tags.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object EventIntegration {
  
  inline def apply(): EventIntegration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventIntegration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventIntegration] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setEventBridgeBus(value: EventBridgeBus): Self = StObject.set(x, "EventBridgeBus", value.asInstanceOf[js.Any])
    
    inline def setEventBridgeBusUndefined: Self = StObject.set(x, "EventBridgeBus", js.undefined)
    
    inline def setEventFilter(value: EventFilter): Self = StObject.set(x, "EventFilter", value.asInstanceOf[js.Any])
    
    inline def setEventFilterUndefined: Self = StObject.set(x, "EventFilter", js.undefined)
    
    inline def setEventIntegrationArn(value: Arn): Self = StObject.set(x, "EventIntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setEventIntegrationArnUndefined: Self = StObject.set(x, "EventIntegrationArn", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
