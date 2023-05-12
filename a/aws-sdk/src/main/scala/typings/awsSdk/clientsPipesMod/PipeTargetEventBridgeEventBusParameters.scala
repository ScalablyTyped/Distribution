package typings.awsSdk.clientsPipesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipeTargetEventBridgeEventBusParameters extends StObject {
  
  /**
    * A free-form string, with a maximum of 128 characters, used to decide what fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[EventBridgeDetailType] = js.undefined
  
  /**
    * The URL subdomain of the endpoint. For example, if the URL for Endpoint is https://abcde.veo.endpoints.event.amazonaws.com, then the EndpointId is abcde.veo.  When using Java, you must include auth-crt on the class path. 
    */
  var EndpointId: js.UndefOr[EventBridgeEndpointId] = js.undefined
  
  /**
    * Amazon Web Services resources, identified by Amazon Resource Name (ARN), which the event primarily concerns. Any number, including zero, may be present.
    */
  var Resources: js.UndefOr[EventBridgeEventResourceList] = js.undefined
  
  /**
    * The source of the event.
    */
  var Source: js.UndefOr[EventBridgeEventSource] = js.undefined
  
  /**
    * The time stamp of the event, per RFC3339. If no time stamp is provided, the time stamp of the PutEvents call is used.
    */
  var Time: js.UndefOr[JsonPath] = js.undefined
}
object PipeTargetEventBridgeEventBusParameters {
  
  inline def apply(): PipeTargetEventBridgeEventBusParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipeTargetEventBridgeEventBusParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PipeTargetEventBridgeEventBusParameters] (val x: Self) extends AnyVal {
    
    inline def setDetailType(value: EventBridgeDetailType): Self = StObject.set(x, "DetailType", value.asInstanceOf[js.Any])
    
    inline def setDetailTypeUndefined: Self = StObject.set(x, "DetailType", js.undefined)
    
    inline def setEndpointId(value: EventBridgeEndpointId): Self = StObject.set(x, "EndpointId", value.asInstanceOf[js.Any])
    
    inline def setEndpointIdUndefined: Self = StObject.set(x, "EndpointId", js.undefined)
    
    inline def setResources(value: EventBridgeEventResourceList): Self = StObject.set(x, "Resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "Resources", js.undefined)
    
    inline def setResourcesVarargs(value: ArnOrJsonPath*): Self = StObject.set(x, "Resources", js.Array(value*))
    
    inline def setSource(value: EventBridgeEventSource): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setTime(value: JsonPath): Self = StObject.set(x, "Time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "Time", js.undefined)
  }
}
