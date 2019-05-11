package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetCrawlersResponse extends js.Object {
  /**
    * A list of crawler definitions.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.undefined
  /**
    * A list of names of crawlers that were not found.
    */
  var CrawlersNotFound: js.UndefOr[CrawlerNameList] = js.undefined
}

object BatchGetCrawlersResponse {
  @scala.inline
  def apply(Crawlers: CrawlerList = null, CrawlersNotFound: CrawlerNameList = null): BatchGetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    if (Crawlers != null) __obj.updateDynamic("Crawlers")(Crawlers)
    if (CrawlersNotFound != null) __obj.updateDynamic("CrawlersNotFound")(CrawlersNotFound)
    __obj.asInstanceOf[BatchGetCrawlersResponse]
  }
}

