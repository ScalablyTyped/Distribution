package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCrawlersResponse extends js.Object {
  /**
    * The names of all crawlers in the account, or the crawlers with the specified tags.
    */
  var CrawlerNames: js.UndefOr[CrawlerNameList] = js.undefined
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object ListCrawlersResponse {
  @scala.inline
  def apply(CrawlerNames: CrawlerNameList = null, NextToken: Token = null): ListCrawlersResponse = {
    val __obj = js.Dynamic.literal()
    if (CrawlerNames != null) __obj.updateDynamic("CrawlerNames")(CrawlerNames)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCrawlersResponse]
  }
}

