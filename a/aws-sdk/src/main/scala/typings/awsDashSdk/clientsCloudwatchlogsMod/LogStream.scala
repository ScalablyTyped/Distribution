package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogStream extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the log stream.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  /**
    * The creation time of the stream, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time of the first event, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var firstEventTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The time of the most recent log event in the log stream in CloudWatch Logs. This number is expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC. The lastEventTime value updates on an eventual consistency basis. It typically updates in less than an hour from ingestion, but may take longer in some rare situations.
    */
  var lastEventTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The ingestion time, expressed as the number of milliseconds after Jan 1, 1970 00:00:00 UTC.
    */
  var lastIngestionTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the log stream.
    */
  var logStreamName: js.UndefOr[LogStreamName] = js.undefined
  /**
    * The number of bytes stored.  IMPORTANT: Starting on June 17, 2019, this parameter will be deprecated for log streams, and will be reported as zero. This change applies only to log streams. The storedBytes parameter for log groups is not affected.
    */
  var storedBytes: js.UndefOr[StoredBytes] = js.undefined
  /**
    * The sequence token.
    */
  var uploadSequenceToken: js.UndefOr[SequenceToken] = js.undefined
}

object LogStream {
  @scala.inline
  def apply(
    arn: Arn = null,
    creationTime: Int | Double = null,
    firstEventTimestamp: Int | Double = null,
    lastEventTimestamp: Int | Double = null,
    lastIngestionTime: Int | Double = null,
    logStreamName: LogStreamName = null,
    storedBytes: Int | Double = null,
    uploadSequenceToken: SequenceToken = null
  ): LogStream = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime.asInstanceOf[js.Any])
    if (firstEventTimestamp != null) __obj.updateDynamic("firstEventTimestamp")(firstEventTimestamp.asInstanceOf[js.Any])
    if (lastEventTimestamp != null) __obj.updateDynamic("lastEventTimestamp")(lastEventTimestamp.asInstanceOf[js.Any])
    if (lastIngestionTime != null) __obj.updateDynamic("lastIngestionTime")(lastIngestionTime.asInstanceOf[js.Any])
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName)
    if (storedBytes != null) __obj.updateDynamic("storedBytes")(storedBytes.asInstanceOf[js.Any])
    if (uploadSequenceToken != null) __obj.updateDynamic("uploadSequenceToken")(uploadSequenceToken)
    __obj.asInstanceOf[LogStream]
  }
}

