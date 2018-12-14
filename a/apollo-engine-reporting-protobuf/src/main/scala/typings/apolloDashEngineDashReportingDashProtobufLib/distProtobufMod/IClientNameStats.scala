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
  /** ClientNameStats requestsCountPerVersion */
  var requestsCountPerVersion: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double] | scala.Null] = js.undefined
  /** ClientNameStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** ClientNameStats rootErrorStats */
  var rootErrorStats: js.UndefOr[IPathErrorStats | scala.Null] = js.undefined
}

