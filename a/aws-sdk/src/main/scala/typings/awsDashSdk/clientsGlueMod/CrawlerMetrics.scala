package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrawlerMetrics extends js.Object {
  /**
    * The name of the crawler.
    */
  var CrawlerName: js.UndefOr[NameString] = js.undefined
  /**
    * The duration of the crawler's most recent run, in seconds.
    */
  var LastRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
  /**
    * The median duration of this crawler's runs, in seconds.
    */
  var MedianRuntimeSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
  /**
    * True if the crawler is still estimating how long it will take to complete this run.
    */
  var StillEstimating: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of tables created by this crawler.
    */
  var TablesCreated: js.UndefOr[NonNegativeInteger] = js.undefined
  /**
    * The number of tables deleted by this crawler.
    */
  var TablesDeleted: js.UndefOr[NonNegativeInteger] = js.undefined
  /**
    * The number of tables updated by this crawler.
    */
  var TablesUpdated: js.UndefOr[NonNegativeInteger] = js.undefined
  /**
    * The estimated time left to complete a running crawl.
    */
  var TimeLeftSeconds: js.UndefOr[NonNegativeDouble] = js.undefined
}

object CrawlerMetrics {
  @scala.inline
  def apply(
    CrawlerName: NameString = null,
    LastRuntimeSeconds: Int | Double = null,
    MedianRuntimeSeconds: Int | Double = null,
    StillEstimating: js.UndefOr[scala.Boolean] = js.undefined,
    TablesCreated: Int | Double = null,
    TablesDeleted: Int | Double = null,
    TablesUpdated: Int | Double = null,
    TimeLeftSeconds: Int | Double = null
  ): CrawlerMetrics = {
    val __obj = js.Dynamic.literal()
    if (CrawlerName != null) __obj.updateDynamic("CrawlerName")(CrawlerName)
    if (LastRuntimeSeconds != null) __obj.updateDynamic("LastRuntimeSeconds")(LastRuntimeSeconds.asInstanceOf[js.Any])
    if (MedianRuntimeSeconds != null) __obj.updateDynamic("MedianRuntimeSeconds")(MedianRuntimeSeconds.asInstanceOf[js.Any])
    if (!js.isUndefined(StillEstimating)) __obj.updateDynamic("StillEstimating")(StillEstimating)
    if (TablesCreated != null) __obj.updateDynamic("TablesCreated")(TablesCreated.asInstanceOf[js.Any])
    if (TablesDeleted != null) __obj.updateDynamic("TablesDeleted")(TablesDeleted.asInstanceOf[js.Any])
    if (TablesUpdated != null) __obj.updateDynamic("TablesUpdated")(TablesUpdated.asInstanceOf[js.Any])
    if (TimeLeftSeconds != null) __obj.updateDynamic("TimeLeftSeconds")(TimeLeftSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrawlerMetrics]
  }
}

