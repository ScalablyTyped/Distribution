package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQueryLatencyStats extends js.Object {
  /** QueryLatencyStats cacheHits */
  var cacheHits: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** QueryLatencyStats forbiddenOperationCount */
  var forbiddenOperationCount: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** QueryLatencyStats persistedQueryHits */
  var persistedQueryHits: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats persistedQueryMisses */
  var persistedQueryMisses: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** QueryLatencyStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** QueryLatencyStats registeredOperationCount */
  var registeredOperationCount: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats requestCount */
  var requestCount: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
  /** QueryLatencyStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | Null] = js.undefined
}

object IQueryLatencyStats {
  @scala.inline
  def apply(
    cacheHits: Int | Double = null,
    cacheLatencyCount: js.Array[Double] = null,
    forbiddenOperationCount: Int | Double = null,
    latencyCount: js.Array[Double] = null,
    persistedQueryHits: Int | Double = null,
    persistedQueryMisses: Int | Double = null,
    privateCacheTtlCount: js.Array[Double] = null,
    publicCacheTtlCount: js.Array[Double] = null,
    registeredOperationCount: Int | Double = null,
    requestCount: Int | Double = null,
    requestsWithErrorsCount: Int | Double = null,
    rootErrorStats: IPathErrorStats = null
  ): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    if (cacheHits != null) __obj.updateDynamic("cacheHits")(cacheHits.asInstanceOf[js.Any])
    if (cacheLatencyCount != null) __obj.updateDynamic("cacheLatencyCount")(cacheLatencyCount.asInstanceOf[js.Any])
    if (forbiddenOperationCount != null) __obj.updateDynamic("forbiddenOperationCount")(forbiddenOperationCount.asInstanceOf[js.Any])
    if (latencyCount != null) __obj.updateDynamic("latencyCount")(latencyCount.asInstanceOf[js.Any])
    if (persistedQueryHits != null) __obj.updateDynamic("persistedQueryHits")(persistedQueryHits.asInstanceOf[js.Any])
    if (persistedQueryMisses != null) __obj.updateDynamic("persistedQueryMisses")(persistedQueryMisses.asInstanceOf[js.Any])
    if (privateCacheTtlCount != null) __obj.updateDynamic("privateCacheTtlCount")(privateCacheTtlCount.asInstanceOf[js.Any])
    if (publicCacheTtlCount != null) __obj.updateDynamic("publicCacheTtlCount")(publicCacheTtlCount.asInstanceOf[js.Any])
    if (registeredOperationCount != null) __obj.updateDynamic("registeredOperationCount")(registeredOperationCount.asInstanceOf[js.Any])
    if (requestCount != null) __obj.updateDynamic("requestCount")(requestCount.asInstanceOf[js.Any])
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (rootErrorStats != null) __obj.updateDynamic("rootErrorStats")(rootErrorStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryLatencyStats]
  }
}

