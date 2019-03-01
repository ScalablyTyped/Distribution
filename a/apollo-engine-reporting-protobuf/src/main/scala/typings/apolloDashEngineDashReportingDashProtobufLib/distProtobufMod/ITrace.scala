package typings
package apolloDashEngineDashReportingDashProtobufLib.distProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrace extends js.Object {
  /** Trace cachePolicy */
  var cachePolicy: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy | scala.Null
  ] = js.undefined
  /** Trace clientAddress */
  var clientAddress: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Trace clientName */
  var clientName: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Trace clientReferenceId */
  var clientReferenceId: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Trace clientVersion */
  var clientVersion: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Trace details */
  var details: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails | scala.Null
  ] = js.undefined
  /** Trace durationNs */
  var durationNs: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Trace endTime */
  var endTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** Trace fullQueryCacheHit */
  var fullQueryCacheHit: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /** Trace http */
  var http: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP | scala.Null
  ] = js.undefined
  /** Trace legacySignatureNeedsResigning */
  var legacySignatureNeedsResigning: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Trace originReportedDurationNs */
  var originReportedDurationNs: js.UndefOr[scala.Double | scala.Null] = js.undefined
  /** Trace originReportedEndTime */
  var originReportedEndTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** Trace originReportedStartTime */
  var originReportedStartTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
  /** Trace persistedQueryHit */
  var persistedQueryHit: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /** Trace persistedQueryRegister */
  var persistedQueryRegister: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  /** Trace root */
  var root: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode | scala.Null
  ] = js.undefined
  /** Trace signature */
  var signature: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  /** Trace startTime */
  var startTime: js.UndefOr[
    apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp | scala.Null
  ] = js.undefined
}

object ITrace {
  @scala.inline
  def apply(
    cachePolicy: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.ICachePolicy = null,
    clientAddress: java.lang.String = null,
    clientName: java.lang.String = null,
    clientReferenceId: java.lang.String = null,
    clientVersion: java.lang.String = null,
    details: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IDetails = null,
    durationNs: scala.Int | scala.Double = null,
    endTime: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp = null,
    fullQueryCacheHit: js.UndefOr[scala.Boolean] = js.undefined,
    http: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP = null,
    legacySignatureNeedsResigning: java.lang.String = null,
    originReportedDurationNs: scala.Int | scala.Double = null,
    originReportedEndTime: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp = null,
    originReportedStartTime: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp = null,
    persistedQueryHit: js.UndefOr[scala.Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[scala.Boolean] = js.undefined,
    root: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.INode = null,
    signature: java.lang.String = null,
    startTime: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.googleNs.protobufNs.ITimestamp = null
  ): ITrace = {
    val __obj = js.Dynamic.literal()
    if (cachePolicy != null) __obj.updateDynamic("cachePolicy")(cachePolicy)
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress)
    if (clientName != null) __obj.updateDynamic("clientName")(clientName)
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId)
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion)
    if (details != null) __obj.updateDynamic("details")(details)
    if (durationNs != null) __obj.updateDynamic("durationNs")(durationNs.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (!js.isUndefined(fullQueryCacheHit)) __obj.updateDynamic("fullQueryCacheHit")(fullQueryCacheHit)
    if (http != null) __obj.updateDynamic("http")(http)
    if (legacySignatureNeedsResigning != null) __obj.updateDynamic("legacySignatureNeedsResigning")(legacySignatureNeedsResigning)
    if (originReportedDurationNs != null) __obj.updateDynamic("originReportedDurationNs")(originReportedDurationNs.asInstanceOf[js.Any])
    if (originReportedEndTime != null) __obj.updateDynamic("originReportedEndTime")(originReportedEndTime)
    if (originReportedStartTime != null) __obj.updateDynamic("originReportedStartTime")(originReportedStartTime)
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit)
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister)
    if (root != null) __obj.updateDynamic("root")(root)
    if (signature != null) __obj.updateDynamic("signature")(signature)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[ITrace]
  }
}

