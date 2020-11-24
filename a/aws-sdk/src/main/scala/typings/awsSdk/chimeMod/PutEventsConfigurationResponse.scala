package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutEventsConfigurationResponse extends js.Object {
  
  var EventsConfiguration: js.UndefOr[typings.awsSdk.chimeMod.EventsConfiguration] = js.native
}
object PutEventsConfigurationResponse {
  
  @scala.inline
  def apply(): PutEventsConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutEventsConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutEventsConfigurationResponseOps[Self <: PutEventsConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventsConfiguration(value: EventsConfiguration): Self = this.set("EventsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventsConfiguration: Self = this.set("EventsConfiguration", js.undefined)
  }
}
