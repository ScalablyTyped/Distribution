package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCrawlerResponse extends js.Object {
  /**
    * The metadata for the specified crawler.
    */
  var Crawler: js.UndefOr[typings.awsDashSdk.clientsGlueMod.Crawler] = js.undefined
}

object GetCrawlerResponse {
  @scala.inline
  def apply(Crawler: Crawler = null): GetCrawlerResponse = {
    val __obj = js.Dynamic.literal()
    if (Crawler != null) __obj.updateDynamic("Crawler")(Crawler)
    __obj.asInstanceOf[GetCrawlerResponse]
  }
}

