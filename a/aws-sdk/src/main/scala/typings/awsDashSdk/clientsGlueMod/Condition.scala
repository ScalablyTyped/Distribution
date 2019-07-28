package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * The state of the crawler to which this condition applies.
    */
  var CrawlState: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CrawlState] = js.undefined
  /**
    * The name of the crawler to which this condition applies.
    */
  var CrawlerName: js.UndefOr[NameString] = js.undefined
  /**
    * The name of the job whose JobRuns this condition applies to, and on which this trigger waits.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
  /**
    * A logical operator.
    */
  var LogicalOperator: js.UndefOr[typings.awsDashSdk.clientsGlueMod.LogicalOperator] = js.undefined
  /**
    * The condition state. Currently, the values supported are SUCCEEDED, STOPPED, TIMEOUT, and FAILED.
    */
  var State: js.UndefOr[JobRunState] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    CrawlState: CrawlState = null,
    CrawlerName: NameString = null,
    JobName: NameString = null,
    LogicalOperator: LogicalOperator = null,
    State: JobRunState = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (CrawlState != null) __obj.updateDynamic("CrawlState")(CrawlState.asInstanceOf[js.Any])
    if (CrawlerName != null) __obj.updateDynamic("CrawlerName")(CrawlerName)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (LogicalOperator != null) __obj.updateDynamic("LogicalOperator")(LogicalOperator.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

