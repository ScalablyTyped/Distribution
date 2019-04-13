package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetCrawlersRequest extends js.Object {
  /**
    * A list of crawler names, which may be the names returned from the ListCrawlers operation.
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

