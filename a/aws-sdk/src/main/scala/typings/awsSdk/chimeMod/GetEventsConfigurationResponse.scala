package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetEventsConfigurationResponse extends StObject {
  
  /**
    * The events configuration details.
    */
  var EventsConfiguration: js.UndefOr[typings.awsSdk.chimeMod.EventsConfiguration] = js.native
}
object GetEventsConfigurationResponse {
  
  @scala.inline
  def apply(): GetEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEventsConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetEventsConfigurationResponseMutableBuilder[Self <: GetEventsConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventsConfiguration(value: EventsConfiguration): Self = StObject.set(x, "EventsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsConfigurationUndefined: Self = StObject.set(x, "EventsConfiguration", js.undefined)
  }
}
