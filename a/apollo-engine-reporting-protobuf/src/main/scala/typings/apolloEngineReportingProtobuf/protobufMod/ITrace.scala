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

@js.native
trait ITrace extends js.Object {
  /** Trace cachePolicy */
  var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.native
  /** Trace clientAddress */
  var clientAddress: js.UndefOr[String | Null] = js.native
  /** Trace clientName */
  var clientName: js.UndefOr[String | Null] = js.native
  /** Trace clientReferenceId */
  var clientReferenceId: js.UndefOr[String | Null] = js.native
  /** Trace clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.native
  /** Trace details */
  var details: js.UndefOr[IDetails | Null] = js.native
  /** Trace durationNs */
  var durationNs: js.UndefOr[Double | Null] = js.native
  /** Trace endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.native
  /** Trace forbiddenOperation */
  var forbiddenOperation: js.UndefOr[Boolean | Null] = js.native
  /** Trace fullQueryCacheHit */
  var fullQueryCacheHit: js.UndefOr[Boolean | Null] = js.native
  /** Trace http */
  var http: js.UndefOr[IHTTP | Null] = js.native
  /** Trace legacySignatureNeedsResigning */
  var legacySignatureNeedsResigning: js.UndefOr[String | Null] = js.native
  /** Trace persistedQueryHit */
  var persistedQueryHit: js.UndefOr[Boolean | Null] = js.native
  /** Trace persistedQueryRegister */
  var persistedQueryRegister: js.UndefOr[Boolean | Null] = js.native
  /** Trace queryPlan */
  var queryPlan: js.UndefOr[IQueryPlanNode | Null] = js.native
  /** Trace registeredOperation */
  var registeredOperation: js.UndefOr[Boolean | Null] = js.native
  /** Trace root */
  var root: js.UndefOr[INode | Null] = js.native
  /** Trace signature */
  var signature: js.UndefOr[String | Null] = js.native
  /** Trace startTime */
  var startTime: js.UndefOr[ITimestamp | Null] = js.native
}

object ITrace {
  @scala.inline
  def apply(): ITrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrace]
  }
  @scala.inline
  implicit class ITraceOps[Self <: ITrace] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCachePolicy(value: ICachePolicy): Self = this.set("cachePolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCachePolicy: Self = this.set("cachePolicy", js.undefined)
    @scala.inline
    def setCachePolicyNull: Self = this.set("cachePolicy", null)
    @scala.inline
    def setClientAddress(value: String): Self = this.set("clientAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAddress: Self = this.set("clientAddress", js.undefined)
    @scala.inline
    def setClientAddressNull: Self = this.set("clientAddress", null)
    @scala.inline
    def setClientName(value: String): Self = this.set("clientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientName: Self = this.set("clientName", js.undefined)
    @scala.inline
    def setClientNameNull: Self = this.set("clientName", null)
    @scala.inline
    def setClientReferenceId(value: String): Self = this.set("clientReferenceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientReferenceId: Self = this.set("clientReferenceId", js.undefined)
    @scala.inline
    def setClientReferenceIdNull: Self = this.set("clientReferenceId", null)
    @scala.inline
    def setClientVersion(value: String): Self = this.set("clientVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientVersion: Self = this.set("clientVersion", js.undefined)
    @scala.inline
    def setClientVersionNull: Self = this.set("clientVersion", null)
    @scala.inline
    def setDetails(value: IDetails): Self = this.set("details", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetails: Self = this.set("details", js.undefined)
    @scala.inline
    def setDetailsNull: Self = this.set("details", null)
    @scala.inline
    def setDurationNs(value: Double): Self = this.set("durationNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurationNs: Self = this.set("durationNs", js.undefined)
    @scala.inline
    def setDurationNsNull: Self = this.set("durationNs", null)
    @scala.inline
    def setEndTime(value: ITimestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setEndTimeNull: Self = this.set("endTime", null)
    @scala.inline
    def setForbiddenOperation(value: Boolean): Self = this.set("forbiddenOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForbiddenOperation: Self = this.set("forbiddenOperation", js.undefined)
    @scala.inline
    def setForbiddenOperationNull: Self = this.set("forbiddenOperation", null)
    @scala.inline
    def setFullQueryCacheHit(value: Boolean): Self = this.set("fullQueryCacheHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullQueryCacheHit: Self = this.set("fullQueryCacheHit", js.undefined)
    @scala.inline
    def setFullQueryCacheHitNull: Self = this.set("fullQueryCacheHit", null)
    @scala.inline
    def setHttp(value: IHTTP): Self = this.set("http", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttp: Self = this.set("http", js.undefined)
    @scala.inline
    def setHttpNull: Self = this.set("http", null)
    @scala.inline
    def setLegacySignatureNeedsResigning(value: String): Self = this.set("legacySignatureNeedsResigning", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegacySignatureNeedsResigning: Self = this.set("legacySignatureNeedsResigning", js.undefined)
    @scala.inline
    def setLegacySignatureNeedsResigningNull: Self = this.set("legacySignatureNeedsResigning", null)
    @scala.inline
    def setPersistedQueryHit(value: Boolean): Self = this.set("persistedQueryHit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueryHit: Self = this.set("persistedQueryHit", js.undefined)
    @scala.inline
    def setPersistedQueryHitNull: Self = this.set("persistedQueryHit", null)
    @scala.inline
    def setPersistedQueryRegister(value: Boolean): Self = this.set("persistedQueryRegister", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePersistedQueryRegister: Self = this.set("persistedQueryRegister", js.undefined)
    @scala.inline
    def setPersistedQueryRegisterNull: Self = this.set("persistedQueryRegister", null)
    @scala.inline
    def setQueryPlan(value: IQueryPlanNode): Self = this.set("queryPlan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryPlan: Self = this.set("queryPlan", js.undefined)
    @scala.inline
    def setQueryPlanNull: Self = this.set("queryPlan", null)
    @scala.inline
    def setRegisteredOperation(value: Boolean): Self = this.set("registeredOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredOperation: Self = this.set("registeredOperation", js.undefined)
    @scala.inline
    def setRegisteredOperationNull: Self = this.set("registeredOperation", null)
    @scala.inline
    def setRoot(value: INode): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    @scala.inline
    def setSignature(value: String): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setSignatureNull: Self = this.set("signature", null)
    @scala.inline
    def setStartTime(value: ITimestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    @scala.inline
    def setStartTimeNull: Self = this.set("startTime", null)
  }
  
}

