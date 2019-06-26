package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTrafficMirrorSessionsResult extends js.Object {
  /**
    * The token to use to retrieve the next page of results. The value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * Describes one or more Traffic Mirror sessions. By default, all Traffic Mirror sessions are described. Alternatively, you can filter the results.
    */
  var TrafficMirrorSessions: js.UndefOr[TrafficMirrorSessionSet] = js.undefined
}

object DescribeTrafficMirrorSessionsResult {
  @scala.inline
  def apply(NextToken: String = null, TrafficMirrorSessions: TrafficMirrorSessionSet = null): DescribeTrafficMirrorSessionsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TrafficMirrorSessions != null) __obj.updateDynamic("TrafficMirrorSessions")(TrafficMirrorSessions)
    __obj.asInstanceOf[DescribeTrafficMirrorSessionsResult]
  }
}

