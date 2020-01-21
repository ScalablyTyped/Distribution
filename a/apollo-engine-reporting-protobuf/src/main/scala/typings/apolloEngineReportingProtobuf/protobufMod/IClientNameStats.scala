package typings.apolloEngineReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientNameStats extends js.Object {
  /** ClientNameStats cacheHitsPerVersion */
  var cacheHitsPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  /** ClientNameStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** ClientNameStats forbiddenOperationCountPerVersion */
  var forbiddenOperationCountPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  /** ClientNameStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** ClientNameStats persistedQueryHitsPerVersion */
  var persistedQueryHitsPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  /** ClientNameStats persistedQueryMissesPerVersion */
  var persistedQueryMissesPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  /** ClientNameStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** ClientNameStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  /** ClientNameStats registeredOperationCountPerVersion */
  var registeredOperationCountPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  /** ClientNameStats requestsCountPerVersion */
  var requestsCountPerVersion: js.UndefOr[StringDictionary[Double] | Null] = js.undefined
  /** ClientNameStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
  /** ClientNameStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | Null] = js.undefined
}

object IClientNameStats {
  @scala.inline
  def apply(
    cacheHitsPerVersion: StringDictionary[Double] = null,
    cacheLatencyCount: js.Array[Double] = null,
    forbiddenOperationCountPerVersion: StringDictionary[Double] = null,
    latencyCount: js.Array[Double] = null,
    persistedQueryHitsPerVersion: StringDictionary[Double] = null,
    persistedQueryMissesPerVersion: StringDictionary[Double] = null,
    privateCacheTtlCount: js.Array[Double] = null,
    publicCacheTtlCount: js.Array[Double] = null,
    registeredOperationCountPerVersion: StringDictionary[Double] = null,
    requestsCountPerVersion: StringDictionary[Double] = null,
    requestsWithErrorsCount: Int | Double = null,
    rootErrorStats: IPathErrorStats = null
  ): IClientNameStats = {
    val __obj = js.Dynamic.literal()
    if (cacheHitsPerVersion != null) __obj.updateDynamic("cacheHitsPerVersion")(cacheHitsPerVersion.asInstanceOf[js.Any])
    if (cacheLatencyCount != null) __obj.updateDynamic("cacheLatencyCount")(cacheLatencyCount.asInstanceOf[js.Any])
    if (forbiddenOperationCountPerVersion != null) __obj.updateDynamic("forbiddenOperationCountPerVersion")(forbiddenOperationCountPerVersion.asInstanceOf[js.Any])
    if (latencyCount != null) __obj.updateDynamic("latencyCount")(latencyCount.asInstanceOf[js.Any])
    if (persistedQueryHitsPerVersion != null) __obj.updateDynamic("persistedQueryHitsPerVersion")(persistedQueryHitsPerVersion.asInstanceOf[js.Any])
    if (persistedQueryMissesPerVersion != null) __obj.updateDynamic("persistedQueryMissesPerVersion")(persistedQueryMissesPerVersion.asInstanceOf[js.Any])
    if (privateCacheTtlCount != null) __obj.updateDynamic("privateCacheTtlCount")(privateCacheTtlCount.asInstanceOf[js.Any])
    if (publicCacheTtlCount != null) __obj.updateDynamic("publicCacheTtlCount")(publicCacheTtlCount.asInstanceOf[js.Any])
    if (registeredOperationCountPerVersion != null) __obj.updateDynamic("registeredOperationCountPerVersion")(registeredOperationCountPerVersion.asInstanceOf[js.Any])
    if (requestsCountPerVersion != null) __obj.updateDynamic("requestsCountPerVersion")(requestsCountPerVersion.asInstanceOf[js.Any])
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (rootErrorStats != null) __obj.updateDynamic("rootErrorStats")(rootErrorStats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientNameStats]
  }
}

