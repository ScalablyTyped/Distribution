package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDeviceEventsRequest extends js.Object {
  /**
    * The ARN of a device.
    */
  var DeviceArn: Arn = js.native
  /**
    * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in reverse chronological order. If EventType is specified, this returns a list of device events for that EventType in reverse chronological order. 
    */
  var EventType: js.UndefOr[DeviceEventType] = js.native
  /**
    * The maximum number of results to include in the response. The default value is 50. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.alexaforbusinessMod.MaxResults] = js.native
  /**
    * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults. When the end of results is reached, the response has a value of null.
    */
  var NextToken: js.UndefOr[typings.awsSdk.alexaforbusinessMod.NextToken] = js.native
}

object ListDeviceEventsRequest {
  @scala.inline
  def apply(DeviceArn: Arn): ListDeviceEventsRequest = {
    val __obj = js.Dynamic.literal(DeviceArn = DeviceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDeviceEventsRequest]
  }
  @scala.inline
  implicit class ListDeviceEventsRequestOps[Self <: ListDeviceEventsRequest] (val x: Self) extends AnyVal {
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
    def setDeviceArn(value: Arn): Self = this.set("DeviceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventType(value: DeviceEventType): Self = this.set("EventType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventType: Self = this.set("EventType", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

