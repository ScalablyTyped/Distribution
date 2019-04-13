package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCrawlerMetricsResponse extends js.Object {
  /**
    * A list of metrics for the specified crawler.
    */
  var CrawlerMetricsList: js.UndefOr[CrawlerMetricsList] = js.undefined
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}

object GetCrawlerMetricsResponse {
  @scala.inline
  def apply(CrawlerMetricsList: CrawlerMetricsList = null, NextToken: Token = null): GetCrawlerMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (CrawlerMetricsList != null) __obj.updateDynamic("CrawlerMetricsList")(CrawlerMetricsList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetCrawlerMetricsResponse]
  }
}

