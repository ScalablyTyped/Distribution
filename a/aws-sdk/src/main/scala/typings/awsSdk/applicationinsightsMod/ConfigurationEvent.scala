package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    EventDetail: ConfigurationEventDetail = null,
    EventResourceName: ConfigurationEventResourceName = null,
    EventResourceType: ConfigurationEventResourceType = null,
    EventStatus: ConfigurationEventStatus = null,
    EventTime: ConfigurationEventTime = null,
    MonitoredResourceARN: ConfigurationEventMonitoredResourceARN = null
  ): ConfigurationEvent = {
    val __obj = js.Dynamic.literal()
    if (EventDetail != null) __obj.updateDynamic("EventDetail")(EventDetail.asInstanceOf[js.Any])
    if (EventResourceName != null) __obj.updateDynamic("EventResourceName")(EventResourceName.asInstanceOf[js.Any])
    if (EventResourceType != null) __obj.updateDynamic("EventResourceType")(EventResourceType.asInstanceOf[js.Any])
    if (EventStatus != null) __obj.updateDynamic("EventStatus")(EventStatus.asInstanceOf[js.Any])
    if (EventTime != null) __obj.updateDynamic("EventTime")(EventTime.asInstanceOf[js.Any])
    if (MonitoredResourceARN != null) __obj.updateDynamic("MonitoredResourceARN")(MonitoredResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigurationEvent]
  }
}

