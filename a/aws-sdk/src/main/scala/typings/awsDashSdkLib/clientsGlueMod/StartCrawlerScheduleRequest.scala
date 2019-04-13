package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartCrawlerScheduleRequest extends js.Object {
  /**
    * Name of the crawler to schedule.
    */
  var CrawlerName: NameString
}

object StartCrawlerScheduleRequest {
  @scala.inline
  def apply(CrawlerName: NameString): StartCrawlerScheduleRequest = {
    val __obj = js.Dynamic.literal(CrawlerName = CrawlerName)
  
    __obj.asInstanceOf[StartCrawlerScheduleRequest]
  }
}

