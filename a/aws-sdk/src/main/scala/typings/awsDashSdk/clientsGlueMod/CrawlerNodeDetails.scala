package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerNodeDetails extends js.Object {
  /**
    * A list of crawls represented by the crawl node.
    */
  var Crawls: js.UndefOr[CrawlList] = js.undefined
}

object CrawlerNodeDetails {
  @scala.inline
  def apply(Crawls: CrawlList = null): CrawlerNodeDetails = {
    val __obj = js.Dynamic.literal()
    if (Crawls != null) __obj.updateDynamic("Crawls")(Crawls)
    __obj.asInstanceOf[CrawlerNodeDetails]
  }
}

