package typings.awsSdk.applicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigurationEvent extends StObject {
  
  /**
    *  The details of the event in plain text. 
    */
  var EventDetail: js.UndefOr[ConfigurationEventDetail] = js.undefined
  
  /**
    *  The name of the resource Application Insights attempted to configure. 
    */
  var EventResourceName: js.UndefOr[ConfigurationEventResourceName] = js.undefined
  
  /**
    *  The resource type that Application Insights attempted to configure, for example, CLOUDWATCH_ALARM. 
    */
  var EventResourceType: js.UndefOr[ConfigurationEventResourceType] = js.undefined
  
  /**
    *  The status of the configuration update event. Possible values include INFO, WARN, and ERROR. 
    */
  var EventStatus: js.UndefOr[ConfigurationEventStatus] = js.undefined
  
  /**
    *  The timestamp of the event. 
    */
  var EventTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The resource monitored by Application Insights. 
    */
  var MonitoredResourceARN: js.UndefOr[ConfigurationEventMonitoredResourceARN] = js.undefined
}
object ConfigurationEvent {
  
  inline def apply(): ConfigurationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigurationEvent]
  }
  
  extension [Self <: ConfigurationEvent](x: Self) {
    
    inline def setEventDetail(value: ConfigurationEventDetail): Self = StObject.set(x, "EventDetail", value.asInstanceOf[js.Any])
    
    inline def setEventDetailUndefined: Self = StObject.set(x, "EventDetail", js.undefined)
    
    inline def setEventResourceName(value: ConfigurationEventResourceName): Self = StObject.set(x, "EventResourceName", value.asInstanceOf[js.Any])
    
    inline def setEventResourceNameUndefined: Self = StObject.set(x, "EventResourceName", js.undefined)
    
    inline def setEventResourceType(value: ConfigurationEventResourceType): Self = StObject.set(x, "EventResourceType", value.asInstanceOf[js.Any])
    
    inline def setEventResourceTypeUndefined: Self = StObject.set(x, "EventResourceType", js.undefined)
    
    inline def setEventStatus(value: ConfigurationEventStatus): Self = StObject.set(x, "EventStatus", value.asInstanceOf[js.Any])
    
    inline def setEventStatusUndefined: Self = StObject.set(x, "EventStatus", js.undefined)
    
    inline def setEventTime(value: js.Date): Self = StObject.set(x, "EventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "EventTime", js.undefined)
    
    inline def setMonitoredResourceARN(value: ConfigurationEventMonitoredResourceARN): Self = StObject.set(x, "MonitoredResourceARN", value.asInstanceOf[js.Any])
    
    inline def setMonitoredResourceARNUndefined: Self = StObject.set(x, "MonitoredResourceARN", js.undefined)
  }
}
