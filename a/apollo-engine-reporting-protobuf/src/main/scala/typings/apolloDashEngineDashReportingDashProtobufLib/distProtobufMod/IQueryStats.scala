package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IQueryStats extends js.Object {
  /** QueryStats perClientName */
  var perClientName: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IClientNameStats] | scala.Null] = js.undefined
  /** QueryStats perType */
  var perType: js.UndefOr[js.Array[ITypeStat] | scala.Null] = js.undefined
  /** QueryStats perTypeStat */
  var perTypeStat: js.UndefOr[org.scalablytyped.runtime.StringDictionary[ITypeStat] | scala.Null] = js.undefined
  /** QueryStats queryStatsWithContext */
  var queryStatsWithContext: js.UndefOr[js.Array[IContextualizedQueryLatencyStats] | scala.Null] = js.undefined
  /** QueryStats typeStatsWithContext */
  var typeStatsWithContext: js.UndefOr[js.Array[IContextualizedTypeStats] | scala.Null] = js.undefined
}

