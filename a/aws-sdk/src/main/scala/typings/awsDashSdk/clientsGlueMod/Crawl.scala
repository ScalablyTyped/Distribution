package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Crawl extends js.Object {
  /**
    * The date and time on which the crawl completed.
    */
  var CompletedOn: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The error message associated with the crawl.
    */
  var ErrorMessage: js.UndefOr[DescriptionString] = js.undefined
  /**
    * The log group associated with the crawl.
    */
  var LogGroup: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LogGroup] = js.undefined
  /**
    * The log stream associated with the crawl.
    */
  var LogStream: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LogStream] = js.undefined
  /**
    * The date and time on which the crawl started.
    */
  var StartedOn: js.UndefOr[TimestampValue] = js.undefined
  /**
    * The state of the crawler.
    */
  var State: js.UndefOr[CrawlState] = js.undefined
}

object Crawl {
  @scala.inline
  def apply(
    CompletedOn: TimestampValue = null,
    ErrorMessage: DescriptionString = null,
    LogGroup: LogGroup = null,
    LogStream: LogStream = null,
    StartedOn: TimestampValue = null,
    State: CrawlState = null
  ): Crawl = {
    val __obj = js.Dynamic.literal()
    if (CompletedOn != null) __obj.updateDynamic("CompletedOn")(CompletedOn)
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (LogGroup != null) __obj.updateDynamic("LogGroup")(LogGroup)
    if (LogStream != null) __obj.updateDynamic("LogStream")(LogStream)
    if (StartedOn != null) __obj.updateDynamic("StartedOn")(StartedOn)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Crawl]
  }
}

