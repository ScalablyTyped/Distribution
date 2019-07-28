package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastCrawlInfo extends js.Object {
  /**
    * If an error occurred, the error information about the last crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The log group for the last crawl.
    */
  var LogGroup: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LogGroup] = js.undefined
  /**
    * The log stream for the last crawl.
    */
  var LogStream: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LogStream] = js.undefined
  /**
    * The prefix for a message about this crawl.
    */
  var MessagePrefix: js.UndefOr[typings.awsDashSdk.clientsGlueMod.MessagePrefix] = js.undefined
  /**
    * The time at which the crawl started.
    */
  var StartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Status of the last crawl.
    */
  var Status: js.UndefOr[LastCrawlStatus] = js.undefined
}

object LastCrawlInfo {
  @scala.inline
  def apply(
    ErrorMessage: DescriptionString = null,
    LogGroup: LogGroup = null,
    LogStream: LogStream = null,
    MessagePrefix: MessagePrefix = null,
    StartTime: Timestamp = null,
    Status: LastCrawlStatus = null
  ): LastCrawlInfo = {
    val __obj = js.Dynamic.literal()
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup)
    if (LogStream != null) __obj.updateDynamic("LogStream")(LogStream)
    if (MessagePrefix != null) __obj.updateDynamic("MessagePrefix")(MessagePrefix)
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastCrawlInfo]
  }
}

