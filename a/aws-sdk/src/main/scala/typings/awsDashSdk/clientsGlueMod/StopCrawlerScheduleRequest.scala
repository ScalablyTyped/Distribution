package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopCrawlerScheduleRequest extends js.Object {
  /**
    * Name of the crawler whose schedule state to set.
    */
  var CrawlerName: NameString = js.native
}

object StopCrawlerScheduleRequest {
  @scala.inline
  def apply(CrawlerName: NameString): StopCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StopCrawlerScheduleRequest]
  }
}

