package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEventsConfigurationResponse extends StObject {
  
  /**
    * The events configuration details.
    */
  var EventsConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.EventsConfiguration] = js.undefined
}
object GetEventsConfigurationResponse {
  
  inline def apply(): GetEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventsConfigurationResponse]
  }
  
  extension [Self <: GetEventsConfigurationResponse](x: Self) {
    
    inline def setEventsConfiguration(value: EventsConfiguration): Self = StObject.set(x, "EventsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEventsConfigurationUndefined: Self = StObject.set(x, "EventsConfiguration", js.undefined)
  }
}
