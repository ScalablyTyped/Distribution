package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCrawlersResponse extends js.Object {
  /**
    * A list of crawler metadata.
    */
  var Crawlers: js.UndefOr[CrawlerList] = js.undefined
  /**
    * A continuation token, if the returned list has not reached the end of those defined in this customer account.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetCrawlersResponse {
  @scala.inline
  def apply(Crawlers: CrawlerList = null, NextToken: Token = null): GetCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    if (Crawlers != null) __obj.updateDynamic("Crawlers")(Crawlers)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetCrawlersResponse]
  }
}

