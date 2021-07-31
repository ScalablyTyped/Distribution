package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutEventsConfigurationResponse extends StObject {
  
  var EventsConfiguration: js.UndefOr[typings.awsSdk.chimeMod.EventsConfiguration] = js.undefined
}
object PutEventsConfigurationResponse {
  
  @scala.inline
  def apply(): PutEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutEventsConfigurationResponseMutableBuilder[Self <: PutEventsConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventsConfiguration(value: EventsConfiguration): Self = StObject.set(x, "EventsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsConfigurationUndefined: Self = StObject.set(x, "EventsConfiguration", js.undefined)
  }
}
