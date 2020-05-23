package typings.apolloEngineReportingProtobuf.protobufMod

import typings.apolloEngineReportingProtobuf.protobufMod.Trace.ICachePolicy
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IDetails
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IHTTP
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.INode
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IQueryPlanNode
import typings.apolloEngineReportingProtobuf.protobufMod.google.protobuf.ITimestamp
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
    cachePolicy: js.UndefOr[Null | ICachePolicy] = js.undefined,
    clientAddress: js.UndefOr[Null | String] = js.undefined,
    clientName: js.UndefOr[Null | String] = js.undefined,
    clientReferenceId: js.UndefOr[Null | String] = js.undefined,
    clientVersion: js.UndefOr[Null | String] = js.undefined,
    details: js.UndefOr[Null | IDetails] = js.undefined,
    durationNs: js.UndefOr[Null | Double] = js.undefined,
    endTime: js.UndefOr[Null | ITimestamp] = js.undefined,
    forbiddenOperation: js.UndefOr[Null | Boolean] = js.undefined,
    fullQueryCacheHit: js.UndefOr[Null | Boolean] = js.undefined,
    http: js.UndefOr[Null | IHTTP] = js.undefined,
    legacySignatureNeedsResigning: js.UndefOr[Null | String] = js.undefined,
    persistedQueryHit: js.UndefOr[Null | Boolean] = js.undefined,
    persistedQueryRegister: js.UndefOr[Null | Boolean] = js.undefined,
    queryPlan: js.UndefOr[Null | IQueryPlanNode] = js.undefined,
    registeredOperation: js.UndefOr[Null | Boolean] = js.undefined,
    root: js.UndefOr[Null | INode] = js.undefined,
    signature: js.UndefOr[Null | String] = js.undefined,
    startTime: js.UndefOr[Null | ITimestamp] = js.undefined
  ): ITrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cachePolicy)) __obj.updateDynamic("cachePolicy")(cachePolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(clientAddress)) __obj.updateDynamic("clientAddress")(clientAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(clientName)) __obj.updateDynamic("clientName")(clientName.asInstanceOf[js.Any])
    if (!js.isUndefined(clientReferenceId)) __obj.updateDynamic("clientReferenceId")(clientReferenceId.asInstanceOf[js.Any])
    if (!js.isUndefined(clientVersion)) __obj.updateDynamic("clientVersion")(clientVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(details)) __obj.updateDynamic("details")(details.asInstanceOf[js.Any])
    if (!js.isUndefined(durationNs)) __obj.updateDynamic("durationNs")(durationNs.asInstanceOf[js.Any])
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(forbiddenOperation)) __obj.updateDynamic("forbiddenOperation")(forbiddenOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(fullQueryCacheHit)) __obj.updateDynamic("fullQueryCacheHit")(fullQueryCacheHit.asInstanceOf[js.Any])
    if (!js.isUndefined(http)) __obj.updateDynamic("http")(http.asInstanceOf[js.Any])
    if (!js.isUndefined(legacySignatureNeedsResigning)) __obj.updateDynamic("legacySignatureNeedsResigning")(legacySignatureNeedsResigning.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryHit)) __obj.updateDynamic("persistedQueryHit")(persistedQueryHit.asInstanceOf[js.Any])
    if (!js.isUndefined(persistedQueryRegister)) __obj.updateDynamic("persistedQueryRegister")(persistedQueryRegister.asInstanceOf[js.Any])
    if (!js.isUndefined(queryPlan)) __obj.updateDynamic("queryPlan")(queryPlan.asInstanceOf[js.Any])
    if (!js.isUndefined(registeredOperation)) __obj.updateDynamic("registeredOperation")(registeredOperation.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(signature)) __obj.updateDynamic("signature")(signature.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITrace]
  }
}

