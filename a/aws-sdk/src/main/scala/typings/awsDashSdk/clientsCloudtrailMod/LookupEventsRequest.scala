package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LookupEventsRequest extends js.Object {
  /**
    * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
    */
  var EndTime: js.UndefOr[_Date] = js.native
  /**
    * Specifies the event category. If you do not specify an event category, events of the category are not returned in the response. For example, if you do not specify insight as the value of EventCategory, no Insights events are returned.
    */
  var EventCategory: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.EventCategory] = js.native
  /**
    * Contains a list of lookup attributes. Currently the list can contain only one item.
    */
  var LookupAttributes: js.UndefOr[LookupAttributesList] = js.native
  /**
    * The number of events to return. Possible values are 1 through 50. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.MaxResults] = js.native
  /**
    * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.NextToken] = js.native
  /**
    * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
    */
  var StartTime: js.UndefOr[_Date] = js.native
}

object LookupEventsRequest {
  @scala.inline
  def apply(
    EndTime: _Date = null,
    EventCategory: EventCategory = null,
    LookupAttributes: LookupAttributesList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    StartTime: _Date = null
  ): LookupEventsRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime.asInstanceOf[js.Any])
    if (EventCategory != null) __obj.updateDynamic("EventCategory")(EventCategory.asInstanceOf[js.Any])
    if (LookupAttributes != null) __obj.updateDynamic("LookupAttributes")(LookupAttributes.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[LookupEventsRequest]
  }
}

