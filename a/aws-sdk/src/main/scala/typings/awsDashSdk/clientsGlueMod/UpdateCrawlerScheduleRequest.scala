package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCrawlerScheduleRequest extends js.Object {
  /**
    * The name of the crawler whose schedule to update.
    */
  var CrawlerName: NameString
  /**
    * The updated cron expression used to specify the schedule. For more information, see Time-Based Schedules for Jobs and Crawlers. For example, to run something every day at 12:15 UTC, specify cron(15 12 * * ? *).
    */
  var Schedule: js.UndefOr[CronExpression] = js.undefined
}

object UpdateCrawlerScheduleRequest {
  @scala.inline
  def apply(CrawlerName: NameString, Schedule: CronExpression = null): UpdateCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    __obj.asInstanceOf[UpdateCrawlerScheduleRequest]
  }
}

