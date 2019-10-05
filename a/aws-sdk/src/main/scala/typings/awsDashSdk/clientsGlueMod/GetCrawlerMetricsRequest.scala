package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCrawlerMetricsRequest extends js.Object {
  /**
    * A list of the names of crawlers about which to retrieve metrics.
    */
  var CrawlerNameList: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CrawlerNameList] = js.undefined
  /**
    * The maximum size of a list to return.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetCrawlerMetricsRequest {
  @scala.inline
  def apply(CrawlerNameList: CrawlerNameList = null, MaxResults: Int | Double = null, NextToken: Token = null): GetCrawlerMetricsRequest = {
    val __obj = js.Dynamic.literal()
    if (CrawlerNameList != null) __obj.updateDynamic("CrawlerNameList")(CrawlerNameList)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetCrawlerMetricsRequest]
  }
}

