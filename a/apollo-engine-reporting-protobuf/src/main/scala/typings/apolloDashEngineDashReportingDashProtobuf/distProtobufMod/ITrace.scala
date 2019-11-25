package typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod

import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.ICachePolicy
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IDetails
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IHTTP
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.INode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IQueryPlanNode
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.google.protobuf.ITimestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITrace extends js.Object {
  /** Trace cachePolicy */
  var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.undefined
  /** Trace clientAddress */
  var clientAddress: js.UndefOr[String | Null] = js.undefined
  /** Trace clientName */
  var clientName: js.UndefOr[String | Null] = js.undefined
  /** Trace clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.undefined
  /** Trace clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
  /** Trace details */
  var details: js.UndefOr[IDetails | Null] = js.undefined
  /** Trace durationNs */
  var durationNs: js.UndefOr[Double | Null] = js.undefined
  /** Trace endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** Trace forbiddenOperation */
  var forbiddenOperation: js.UndefOr[Boolean | Null] = js.undefined
  /** Trace fullQueryCacheHit */
  var fullQueryCacheHit: js.UndefOr[Boolean | Null] = js.undefined
  /** Trace http */
  var http: js.UndefOr[IHTTP | Null] = js.undefined
  /** Trace legacySignatureNeedsResigning */
  var legacySignatureNeedsResigning: js.UndefOr[String | Null] = js.undefined
  /** Trace originReportedDurationNs */
  var originReportedDurationNs: js.UndefOr[Double | Null] = js.undefined
  /** Trace originReportedEndTime */
  var originReportedEndTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** Trace originReportedStartTime */
  var originReportedStartTime: js.UndefOr[ITimestamp | Null] = js.undefined
  /** Trace persistedQueryHit */
  var persistedQueryHit: js.UndefOr[Boolean | Null] = js.undefined
  /** Trace persistedQueryRegister */
  var persistedQueryRegister: js.UndefOr[Boolean | Null] = js.undefined
  /** Trace queryPlan */
  var queryPlan: js.UndefOr[IQueryPlanNode | Null] = js.undefined
  /** Trace registeredOperation */
  var registeredOperation: js.UndefOr[Boolean | Null] = js.undefined
  /** Trace root */
  var root: js.UndefOr[INode | Null] = js.undefined
  /** Trace signature */
  var signature: js.UndefOr[String | Null] = js.undefined
  /** Trace startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.undefined
}

object ITrace {
  @scala.inline
  def apply(
    cachePolicy: ICachePolicy = null,
    clientAddress: String = null,
    clientName: String = null,
    clientReferenceId: String = null,
    clientVersion: String = null,
    details: IDetails = null,
    durationNs: Int | Double = null,
    endTime: ITimestamp = null,
    forbiddenOperation: js.UndefOr[Boolean] = js.undefined,
    fullQueryCacheHit: js.UndefOr[Boolean] = js.undefined,
    http: IHTTP = null,
    legacySignatureNeedsResigning: String = null,
    originReportedDurationNs: Int | Double = null,
    originReportedEndTime: ITimestamp = null,
    originReportedStartTime: ITimestamp = null,
    persistedQueryHit: js.UndefOr[Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[Boolean] = js.undefined,
    queryPlan: IQueryPlanNode = null,
    registeredOperation: js.UndefOr[Boolean] = js.undefined,
    root: INode = null,
    signature: String = null,
    startTime: ITimestamp = null
  ): ITrace = {
    val __obj = js.Dynamic.literal()
    if (cachePolicy != null) __obj.updateDynamic("cachePolicy")(cachePolicy.asInstanceOf[js.Any])
    if (clientAddress != null) __obj.updateDynamic("clientAddress")(clientAddress.asInstanceOf[js.Any])
    if (clientName != null) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (clientReferenceId != null) __obj.updateDynamic("clientReferenceId")(clientReferenceId.asInstanceOf[js.Any])
    if (clientVersion != null) __obj.updateDynamic("clientVersion")(clientVersion.asInstanceOf[js.Any])
    if (details != null) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (durationNs != null) __obj.updateDynamic("durationNs")(durationNs.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(forbiddenOperation)) __obj.updateDynamic("forbiddenOperation")(forbiddenOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(fullQueryCacheHit)) __obj.updateDynamic("fullQueryCacheHit")(fullQueryCacheHit.asInstanceOf[js.Any])
    if (http != null) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (legacySignatureNeedsResigning != null) __obj.updateDynamic("legacySignatureNeedsResigning")(legacySignatureNeedsResigning.asInstanceOf[js.Any])
    if (originReportedDurationNs != null) __obj.updateDynamic("originReportedDurationNs")(originReportedDurationNs.asInstanceOf[js.Any])
    if (originReportedEndTime != null) __obj.updateDynamic("originReportedEndTime")(originReportedEndTime.asInstanceOf[js.Any])
    if (originReportedStartTime != null) __obj.updateDynamic("originReportedStartTime")(originReportedStartTime.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister.asInstanceOf[js.Any])
    if (queryPlan != null) __obj.updateDynamic("queryPlan")(queryPlan.asInstanceOf[js.Any])
    if (!js.isUndefined(registeredOperation)) __obj.updateDynamic("registeredOperation")(registeredOperation.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (signature != null) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrace]
  }
}

