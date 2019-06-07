package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClientNameStats extends js.Object {
  /** ClientNameStats cacheHitsPerVersion */
  var cacheHitsPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats cacheLatencyCount */
  var cacheLatencyCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats forbiddenOperationCountPerVersion */
  var forbiddenOperationCountPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats latencyCount */
  var latencyCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats persistedQueryHitsPerVersion */
  var persistedQueryHitsPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats persistedQueryMissesPerVersion */
  var persistedQueryMissesPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats privateCacheTtlCount */
  var privateCacheTtlCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats publicCacheTtlCount */
  var publicCacheTtlCount: js.UndefOr[js.Array[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats registeredOperationCountPerVersion */
  var registeredOperationCountPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats requestsCountPerVersion */
  var requestsCountPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** ClientNameStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | scala.Null] = js.undefined
}

object IClientNameStats {
  @scala.inline
  def apply(
    cacheHitsPerVersion: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    cacheLatencyCount: js.Array[scala.Double] = null,
    forbiddenOperationCountPerVersion: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    latencyCount: js.Array[scala.Double] = null,
    persistedQueryHitsPerVersion: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    persistedQueryMissesPerVersion: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    privateCacheTtlCount: js.Array[scala.Double] = null,
    publicCacheTtlCount: js.Array[scala.Double] = null,
    registeredOperationCountPerVersion: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    requestsCountPerVersion: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    requestsWithErrorsCount: scala.Int | scala.Double = null,
    rootErrorStats: IPathErrorStats = null
  ): IClientNameStats = {
    val __obj = js.Dynamic.literal()
    if (cacheHitsPerVersion != null) __obj.updateDynamic("cacheHitsPerVersion")(cacheHitsPerVersion)
    if (cacheLatencyCount != null) __obj.updateDynamic("cacheLatencyCount")(cacheLatencyCount)
    if (forbiddenOperationCountPerVersion != null) __obj.updateDynamic("forbiddenOperationCountPerVersion")(forbiddenOperationCountPerVersion)
    if (latencyCount != null) __obj.updateDynamic("latencyCount")(latencyCount)
    if (persistedQueryHitsPerVersion != null) __obj.updateDynamic("persistedQueryHitsPerVersion")(persistedQueryHitsPerVersion)
    if (persistedQueryMissesPerVersion != null) __obj.updateDynamic("persistedQueryMissesPerVersion")(persistedQueryMissesPerVersion)
    if (privateCacheTtlCount != null) __obj.updateDynamic("privateCacheTtlCount")(privateCacheTtlCount)
    if (publicCacheTtlCount != null) __obj.updateDynamic("publicCacheTtlCount")(publicCacheTtlCount)
    if (registeredOperationCountPerVersion != null) __obj.updateDynamic("registeredOperationCountPerVersion")(registeredOperationCountPerVersion)
    if (requestsCountPerVersion != null) __obj.updateDynamic("requestsCountPerVersion")(requestsCountPerVersion)
    if (requestsWithErrorsCount != null) __obj.updateDynamic("requestsWithErrorsCount")(requestsWithErrorsCount.asInstanceOf[js.Any])
    if (rootErrorStats != null) __obj.updateDynamic("rootErrorStats")(rootErrorStats)
    __obj.asInstanceOf[IClientNameStats]
  }
}

