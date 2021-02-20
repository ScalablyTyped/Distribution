package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigurationEvent extends StObject {
  
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
  implicit class ConfigurationEventMutableBuilder[Self <: ConfigurationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEventDetail(value: ConfigurationEventDetail): Self = StObject.set(x, "EventDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventDetailUndefined: Self = StObject.set(x, "EventDetail", js.undefined)
    
    @scala.inline
    def setEventResourceName(value: ConfigurationEventResourceName): Self = StObject.set(x, "EventResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventResourceNameUndefined: Self = StObject.set(x, "EventResourceName", js.undefined)
    
    @scala.inline
    def setEventResourceType(value: ConfigurationEventResourceType): Self = StObject.set(x, "EventResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventResourceTypeUndefined: Self = StObject.set(x, "EventResourceType", js.undefined)
    
    @scala.inline
    def setEventStatus(value: ConfigurationEventStatus): Self = StObject.set(x, "EventStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventStatusUndefined: Self = StObject.set(x, "EventStatus", js.undefined)
    
    @scala.inline
    def setEventTime(value: ConfigurationEventTime): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    @scala.inline
    def setMonitoredResourceARN(value: ConfigurationEventMonitoredResourceARN): Self = StObject.set(x, "MonitoredResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMonitoredResourceARNUndefined: Self = StObject.set(x, "MonitoredResourceARN", js.undefined)
  }
}
