package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventDimensions extends StObject {
  
  /**
    * One or more custom attributes that your application reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  
  /**
    * The name of the event that causes the campaign to be sent or the journey activity to be performed. This can be a standard event that Amazon Pinpoint generates, such as _email.delivered. For campaigns, this can also be a custom event that's specific to your application. For information about standard events, see Streaming Amazon Pinpoint Events in the Amazon Pinpoint Developer Guide.
    */
  var EventType: js.UndefOr[SetDimension] = js.undefined
  
  /**
    * One or more custom metrics that your application reports to Amazon Pinpoint. You can use these metrics as selection criteria when you create an event filter.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
}
object EventDimensions {
  
  inline def apply(): EventDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventDimensions]
  }
  
  extension [Self <: EventDimensions](x: Self) {
    
    inline def setAttributes(value: MapOfAttributeDimension): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setEventType(value: SetDimension): Self = StObject.set(x, "EventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "EventType", js.undefined)
    
    inline def setMetrics(value: MapOfMetricDimension): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
  }
}
