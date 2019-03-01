package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryLatencyStats extends js.Object {
  /** QueryLatencyStats cacheHits */
  var cacheHits: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** QueryLatencyStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** QueryLatencyStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** QueryLatencyStats persistedQueryHits */
  var persistedQueryHits: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** QueryLatencyStats persistedQueryMisses */
  var persistedQueryMisses: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** QueryLatencyStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** QueryLatencyStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** QueryLatencyStats requestCount */
  var requestCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** QueryLatencyStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** QueryLatencyStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | scala.Null] = js.undefined
}

object IQueryLatencyStats {
  @scala.inline
  def apply(
    cacheHits: scala.Int | scala.Double = null,
    cacheLatencyCount: js.Array[scala.Double] = null,
    latencyCount: js.Array[scala.Double] = null,
    persistedQueryHits: scala.Int | scala.Double = null,
    persistedQueryMisses: scala.Int | scala.Double = null,
    privateCacheTtlCount: js.Array[scala.Double] = null,
    publicCacheTtlCount: js.Array[scala.Double] = null,
    requestCount: scala.Int | scala.Double = null,
    requestsWithErrorsCount: scala.Int | scala.Double = null,
    rootErrorStats: IPathErrorStats = null
  ): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    if (cacheHits != null) __obj.updateDynamic("cacheHits")(cacheHits.asInstanceOf[js.Any])
    if (cacheLatencyCount != null) __obj.updateDynamic("cacheLatencyCount")(cacheLatencyCount)
    if (latencyCount != null) __obj.updateDynamic("latencyCount")(latencyCount)
    if (persistedQueryHits != null) __obj.updateDynamic("persistedQueryHits")(persistedQueryHits.asInstanceOf[js.Any])
    if (persistedQueryMisses != null) __obj.updateDynamic("persistedQueryMisses")(persistedQueryMisses.asInstanceOf[js.Any])
    if (privateCacheTtlCount != null) __obj.updateDynamic("privateCacheTtlCount")(privateCacheTtlCount)
    if (publicCacheTtlCount != null) __obj.updateDynamic("publicCacheTtlCount")(publicCacheTtlCount)
    if (requestCount != null) __obj.updateDynamic("requestCount")(requestCount.asInstanceOf[js.Any])
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (rootErrorStats != null) __obj.updateDynamic("rootErrorStats")(rootErrorStats)
    __obj.asInstanceOf[IQueryLatencyStats]
  }
}

