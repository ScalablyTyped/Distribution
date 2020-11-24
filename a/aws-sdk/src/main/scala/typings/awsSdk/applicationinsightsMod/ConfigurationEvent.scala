package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationEvent extends js.Object {
  
  /**
    *  The details of the event in plain text. 
    */
  var EventDetail: js.UndefOr[ConfigurationEventDetail] = js.native
  
  /**
    *  The name of the resource Application Insights attempted to configure. 
    */
  var EventResourceName: js.UndefOr[ConfigurationEventResourceName] = js.native
  
  /**
    *  The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM. 
    */
  var EventResourceType: js.UndefOr[ConfigurationEventResourceType] = js.native
  
  /**
    *  The status of the configuration update event. Possible values include INFO, WARN, and ERROR. 
    */
  var EventStatus: js.UndefOr[ConfigurationEventStatus] = js.native
  
  /**
    *  The timestamp of the event. 
    */
  var EventTime: js.UndefOr[ConfigurationEventTime] = js.native
  
  /**
    *  The resource monitored by Application Insights. 
    */
  var MonitoredResourceARN: js.UndefOr[ConfigurationEventMonitoredResourceARN] = js.native
}
object ConfigurationEvent {
  
  @scala.inline
  def apply(): ConfigurationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationEvent]
  }
  
  @scala.inline
  implicit class ConfigurationEventOps[Self <: ConfigurationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEventDetail(value: ConfigurationEventDetail): Self = this.set("EventDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventDetail: Self = this.set("EventDetail", js.undefined)
    
    @scala.inline
    def setEventResourceName(value: ConfigurationEventResourceName): Self = this.set("EventResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventResourceName: Self = this.set("EventResourceName", js.undefined)
    
    @scala.inline
    def setEventResourceType(value: ConfigurationEventResourceType): Self = this.set("EventResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventResourceType: Self = this.set("EventResourceType", js.undefined)
    
    @scala.inline
    def setEventStatus(value: ConfigurationEventStatus): Self = this.set("EventStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventStatus: Self = this.set("EventStatus", js.undefined)
    
    @scala.inline
    def setEventTime(value: ConfigurationEventTime): Self = this.set("EventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTime: Self = this.set("EventTime", js.undefined)
    
    @scala.inline
    def setMonitoredResourceARN(value: ConfigurationEventMonitoredResourceARN): Self = this.set("MonitoredResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitoredResourceARN: Self = this.set("MonitoredResourceARN", js.undefined)
  }
}
