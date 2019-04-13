package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLogStreamsResponse extends js.Object {
  /**
    * The log streams.
    */
  var logStreams: js.UndefOr[LogStreams] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeLogStreamsResponse {
  @scala.inline
  def apply(logStreams: LogStreams = null, nextToken: NextToken = null): DescribeLogStreamsResponse = {
    val __obj = js.Dynamic.literal()
    if (logStreams != null) __obj.updateDynamic("logStreams")(logStreams)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeLogStreamsResponse]
  }
}

