package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsConfigurationResponse extends StObject {
  
  var EventsConfiguration: js.UndefOr[typings.awsSdk.clientsChimeMod.EventsConfiguration] = js.undefined
}
object PutEventsConfigurationResponse {
  
  inline def apply(): PutEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsConfigurationResponse]
  }
  
  extension [Self <: PutEventsConfigurationResponse](x: Self) {
    
    inline def setEventsConfiguration(value: EventsConfiguration): Self = StObject.set(x, "EventsConfiguration", value.asInstanceOf[js.Any])
    
    inline def setEventsConfigurationUndefined: Self = StObject.set(x, "EventsConfiguration", js.undefined)
  }
}
