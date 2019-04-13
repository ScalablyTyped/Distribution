package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudWatchLogsLogStream extends js.Object {
  /**
    * Specifies the max number of log events in a batch, up to 10000. The default value is 1000.
    */
  var BatchCount: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies the maximum size of log events in a batch, in bytes, up to 1048576 bytes. The default value is 32768 bytes. This size is calculated as the sum of all event messages in UTF-8, plus 26 bytes for each log event.
    */
  var BatchSize: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies the time duration for the batching of log events. The minimum value is 5000ms and default value is 5000ms.
    */
  var BufferDuration: js.UndefOr[Integer] = js.undefined
  /**
    * Specifies how the time stamp is extracted from logs. For more information, see the CloudWatch Logs Agent Reference.
    */
  var DatetimeFormat: js.UndefOr[String] = js.undefined
  /**
    * Specifies the encoding of the log file so that the file can be read correctly. The default is utf_8. Encodings supported by Python codecs.decode() can be used here.
    */
  var Encoding: js.UndefOr[CloudWatchLogsEncoding] = js.undefined
  /**
    * Specifies log files that you want to push to CloudWatch Logs.  File can point to a specific file or multiple files (by using wild card characters such as /var/log/system.log*). Only the latest file is pushed to CloudWatch Logs, based on file modification time. We recommend that you use wild card characters to specify a series of files of the same type, such as access_log.2014-06-01-01, access_log.2014-06-01-02, and so on by using a pattern like access_log.*. Don't use a wildcard to match multiple file types, such as access_log_80 and access_log_443. To specify multiple, different file types, add another log stream entry to the configuration file, so that each log file type is stored in a different log group. Zipped files are not supported.
    */
  var File: js.UndefOr[String] = js.undefined
  /**
    * Specifies the range of lines for identifying a file. The valid values are one number, or two dash-delimited numbers, such as '1', '2-5'. The default value is '1', meaning the first line is used to calculate the fingerprint. Fingerprint lines are not sent to CloudWatch Logs unless all specified lines are available.
    */
  var FileFingerprintLines: js.UndefOr[String] = js.undefined
  /**
    * Specifies where to start to read data (start_of_file or end_of_file). The default is start_of_file. This setting is only used if there is no state persisted for that log stream.
    */
  var InitialPosition: js.UndefOr[CloudWatchLogsInitialPosition] = js.undefined
  /**
    * Specifies the destination log group. A log group is created automatically if it doesn't already exist. Log group names can be between 1 and 512 characters long. Allowed characters include a-z, A-Z, 0-9, '_' (underscore), '-' (hyphen), '/' (forward slash), and '.' (period).
    */
  var LogGroupName: js.UndefOr[String] = js.undefined
  /**
    * Specifies the pattern for identifying the start of a log message.
    */
  var MultiLineStartPattern: js.UndefOr[String] = js.undefined
  /**
    * Specifies the time zone of log event time stamps.
    */
  var TimeZone: js.UndefOr[CloudWatchLogsTimeZone] = js.undefined
}

object CloudWatchLogsLogStream {
  @scala.inline
  def apply(
    BatchCount: js.UndefOr[Integer] = js.undefined,
    BatchSize: js.UndefOr[Integer] = js.undefined,
    BufferDuration: js.UndefOr[Integer] = js.undefined,
    DatetimeFormat: String = null,
    Encoding: CloudWatchLogsEncoding = null,
    File: String = null,
    FileFingerprintLines: String = null,
    InitialPosition: CloudWatchLogsInitialPosition = null,
    LogGroupName: String = null,
    MultiLineStartPattern: String = null,
    TimeZone: CloudWatchLogsTimeZone = null
  ): CloudWatchLogsLogStream = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(BatchCount)) __obj.updateDynamic("BatchCount")(BatchCount)
    if (!js.isUndefined(BatchSize)) __obj.updateDynamic("BatchSize")(BatchSize)
    if (!js.isUndefined(BufferDuration)) __obj.updateDynamic("BufferDuration")(BufferDuration)
    if (DatetimeFormat != null) __obj.updateDynamic("DatetimeFormat")(DatetimeFormat)
    if (Encoding != null) __obj.updateDynamic("Encoding")(Encoding.asInstanceOf[js.Any])
    if (File != null) __obj.updateDynamic("File")(File)
    if (FileFingerprintLines != null) __obj.updateDynamic("FileFingerprintLines")(FileFingerprintLines)
    if (InitialPosition != null) __obj.updateDynamic("InitialPosition")(InitialPosition.asInstanceOf[js.Any])
    if (LogGroupName != null) __obj.updateDynamic("LogGroupName")(LogGroupName)
    if (MultiLineStartPattern != null) __obj.updateDynamic("MultiLineStartPattern")(MultiLineStartPattern)
    if (TimeZone != null) __obj.updateDynamic("TimeZone")(TimeZone.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudWatchLogsLogStream]
  }
}

