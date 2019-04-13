package typings
package awsDashSdkLib.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The AWS access key ID that was used to sign the request. If the request was made with temporary security credentials, this is the access key ID of the temporary credentials.
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  /**
    * A JSON string that contains a representation of the event returned.
    */
  var CloudTrailEvent: js.UndefOr[String] = js.undefined
  /**
    * The CloudTrail ID of the event returned.
    */
  var EventId: js.UndefOr[String] = js.undefined
  /**
    * The name of the event returned.
    */
  var EventName: js.UndefOr[String] = js.undefined
  /**
    * The AWS service that the request was made to.
    */
  var EventSource: js.UndefOr[String] = js.undefined
  /**
    * The date and time of the event returned.
    */
  var EventTime: js.UndefOr[_Date] = js.undefined
  /**
    * Information about whether the event is a write event or a read event. 
    */
  var ReadOnly: js.UndefOr[String] = js.undefined
  /**
    * A list of resources referenced by the event returned.
    */
  var Resources: js.UndefOr[ResourceList] = js.undefined
  /**
    * A user name or role name of the requester that called the API in the event returned.
    */
  var Username: js.UndefOr[String] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    AccessKeyId: String = null,
    CloudTrailEvent: String = null,
    EventId: String = null,
    EventName: String = null,
    EventSource: String = null,
    EventTime: _Date = null,
    ReadOnly: String = null,
    Resources: ResourceList = null,
    Username: String = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (AccessKeyId != null) __obj.updateDynamic("AccessKeyId")(AccessKeyId)
    if (CloudTrailEvent != null) __obj.updateDynamic("CloudTrailEvent")(CloudTrailEvent)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (EventName != null) __obj.updateDynamic("EventName")(EventName)
    if (EventSource != null) __obj.updateDynamic("EventSource")(EventSource)
    if (EventTime != null) __obj.updateDynamic("EventTime")(EventTime)
    if (ReadOnly != null) __obj.updateDynamic("ReadOnly")(ReadOnly)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (Username != null) __obj.updateDynamic("Username")(Username)
    __obj.asInstanceOf[Event]
  }
}

