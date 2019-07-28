package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetCrawlersRequest extends js.Object {
  /**
    * A list of crawler names, which might be the names returned from the ListCrawlers operation.
    */
  var CrawlerNames: CrawlerNameList
}

object BatchGetCrawlersRequest {
  @scala.inline
  def apply(CrawlerNames: CrawlerNameList): BatchGetCrawlersRequest = {
    val __obj = js.Dynamic.literal(CrawlerNames = CrawlerNames)
  
    __obj.asInstanceOf[BatchGetCrawlersRequest]
  }
}

