package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLogEventsRequest extends js.Object {
  /**
    * The log events.
    */
  var logEvents: InputLogEvents
  /**
    * The name of the log group.
    */
  var logGroupName: LogGroupName
  /**
    * The name of the log stream.
    */
  var logStreamName: LogStreamName
  /**
    * The sequence token obtained from the response of the previous PutLogEvents call. An upload in a newly created log stream does not require a sequence token. You can also get the sequence token using DescribeLogStreams. If you call PutLogEvents twice within a narrow time period using the same value for sequenceToken, both calls may be successful, or one may be rejected.
    */
  var sequenceToken: js.UndefOr[SequenceToken] = js.undefined
}

object PutLogEventsRequest {
  @scala.inline
  def apply(
    logEvents: InputLogEvents,
    logGroupName: LogGroupName,
    logStreamName: LogStreamName,
    sequenceToken: SequenceToken = null
  ): PutLogEventsRequest = {
    val __obj = js.Dynamic.literal(logEvents = logEvents, logGroupName = logGroupName, logStreamName = logStreamName)
    if (sequenceToken != null) __obj.updateDynamic("sequenceToken")(sequenceToken)
    __obj.asInstanceOf[PutLogEventsRequest]
  }
}

