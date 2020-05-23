package typings.apolloEngineReportingProtobuf.protobufMod

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
    cacheHits: js.UndefOr[Null | Double] = js.undefined,
    cacheLatencyCount: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    forbiddenOperationCount: js.UndefOr[Null | Double] = js.undefined,
    latencyCount: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    persistedQueryHits: js.UndefOr[Null | Double] = js.undefined,
    persistedQueryMisses: js.UndefOr[Null | Double] = js.undefined,
    privateCacheTtlCount: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    publicCacheTtlCount: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    registeredOperationCount: js.UndefOr[Null | Double] = js.undefined,
    requestCount: js.UndefOr[Null | Double] = js.undefined,
    requestsWithErrorsCount: js.UndefOr[Null | Double] = js.undefined,
    rootErrorStats: js.UndefOr[Null | IPathErrorStats] = js.undefined
  ): IQueryLatencyStats = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cacheHits)) __obj.updateDynamic("cacheHits")(cacheHits.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheLatencyCount)) __obj.updateDynamic("cacheLatencyCount")(cacheLatencyCount.asInstanceOf[js.Any])
    if (!js.isUndefined(forbiddenOperationCount)) __obj.updateDynamic("forbiddenOperationCount")(forbiddenOperationCount.asInstanceOf[js.Any])
    if (!js.isUndefined(latencyCount)) __obj.updateDynamic("latencyCount")(latencyCount.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryHits)) __obj.updateDynamic("persistedQueryHits")(persistedQueryHits.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryMisses)) __obj.updateDynamic("persistedQueryMisses")(persistedQueryMisses.asInstanceOf[js.Any])
    if (!js.isUndefined(privateCacheTtlCount)) __obj.updateDynamic("privateCacheTtlCount")(privateCacheTtlCount.asInstanceOf[js.Any])
    if (!js.isUndefined(publicCacheTtlCount)) __obj.updateDynamic("publicCacheTtlCount")(publicCacheTtlCount.asInstanceOf[js.Any])
    if (!js.isUndefined(registeredOperationCount)) __obj.updateDynamic("registeredOperationCount")(registeredOperationCount.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCount)) __obj.updateDynamic("requestCount")(requestCount.asInstanceOf[js.Any])
    if (!js.isUndefined(requestsWithErrorsCount)) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (!js.isUndefined(rootErrorStats)) __obj.updateDynamic("rootErrorStats")(rootErrorStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQueryLatencyStats]
  }
}

