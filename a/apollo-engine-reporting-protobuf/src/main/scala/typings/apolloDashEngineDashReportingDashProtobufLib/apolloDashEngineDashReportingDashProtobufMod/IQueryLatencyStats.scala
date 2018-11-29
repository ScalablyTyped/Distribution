package typings
package apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod

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

