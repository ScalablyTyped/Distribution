package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCrawlerMetricsResponse extends js.Object {
  /**
    * A list of metrics for the specified crawler.
    */
  var CrawlerMetricsList: js.UndefOr[typings.awsDashSdk.clientsGlueMod.CrawlerMetricsList] = js.native
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.native
}

object GetCrawlerMetricsResponse {
  @scala.inline
  def apply(CrawlerMetricsList: CrawlerMetricsList = null, NextToken: Token = null): GetCrawlerMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (CrawlerMetricsList != null) __obj.updateDynamic("CrawlerMetricsList")(CrawlerMetricsList.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCrawlerMetricsResponse]
  }
}

