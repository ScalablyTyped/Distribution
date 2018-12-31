package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatsReport extends js.Object {
  /** StatsReport endTime */
  var endTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** StatsReport header */
  var header: js.UndefOr[IReportHeader | scala.Null] = js.undefined
  /** StatsReport legacyPerQueryImplicitOperationName */
  var legacyPerQueryImplicitOperationName: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IQueryStats] | scala.Null] = js.undefined
  /** StatsReport memStats */
  var memStats: js.UndefOr[IMemStats | scala.Null] = js.undefined
  /** StatsReport perQuery */
  var perQuery: js.UndefOr[org.scalablytyped.runtime.StringDictionary[IQueryStats] | scala.Null] = js.undefined
  /** StatsReport realtimeDuration */
  var realtimeDuration: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** StatsReport startTime */
  var startTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** StatsReport timeStats */
  var timeStats: js.UndefOr[ITimeStats | scala.Null] = js.undefined
  /** StatsReport type */
  var `type`: js.UndefOr[js.Array[IType] | scala.Null] = js.undefined
}

