package typings.awsDashSdk.clientsCloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LookupEventsRequest extends js.Object {
  /**
    * Specifies that only events that occur before or at the specified time are returned. If the specified end time is before the specified start time, an error is returned.
    */
  var EndTime: js.UndefOr[_Date] = js.undefined
  /**
    * Contains a list of lookup attributes. Currently the list can contain only one item.
    */
  var LookupAttributes: js.UndefOr[LookupAttributesList] = js.undefined
  /**
    * The number of events to return. Possible values are 1 through 50. The default is 50.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.MaxResults] = js.undefined
  /**
    * The token to use to get the next page of results after a previous API call. This token must be passed in with the same parameters that were specified in the the original call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudtrailMod.NextToken] = js.undefined
  /**
    * Specifies that only events that occur after or at the specified time are returned. If the specified start time is after the specified end time, an error is returned.
    */
  var StartTime: js.UndefOr[_Date] = js.undefined
}

object LookupEventsRequest {
  @scala.inline
  def apply(
    EndTime: _Date = null,
    LookupAttributes: LookupAttributesList = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    StartTime: _Date = null
  ): LookupEventsRequest = {
    val __obj = js.Dynamic.literal()
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (LookupAttributes != null) __obj.updateDynamic("LookupAttributes")(LookupAttributes)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    __obj.asInstanceOf[LookupEventsRequest]
  }
}

