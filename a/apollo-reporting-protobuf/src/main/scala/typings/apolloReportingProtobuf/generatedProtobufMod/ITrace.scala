package typings.apolloReportingProtobuf.generatedProtobufMod

import typings.apolloReportingProtobuf.generatedProtobufMod.Trace.ICachePolicy
import typings.apolloReportingProtobuf.generatedProtobufMod.Trace.IDetails
import typings.apolloReportingProtobuf.generatedProtobufMod.Trace.IHTTP
import typings.apolloReportingProtobuf.generatedProtobufMod.Trace.INode
import typings.apolloReportingProtobuf.generatedProtobufMod.Trace.IQueryPlanNode
import typings.apolloReportingProtobuf.generatedProtobufMod.google.protobuf.ITimestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITrace extends StObject {
  
  /** Trace cachePolicy */
  var cachePolicy: js.UndefOr[ICachePolicy | Null] = js.undefined
  
  /** Trace clientName */
  var clientName: js.UndefOr[String | Null] = js.undefined
  
  /** Trace clientVersion */
  var clientVersion: js.UndefOr[String | Null] = js.undefined
  
  /** Trace details */
  var details: js.UndefOr[IDetails | Null] = js.undefined
  
  /** Trace durationNs */
  var durationNs: js.UndefOr[Double | Null] = js.undefined
  
  /** Trace endTime */
  var endTime: js.UndefOr[ITimestamp | Null] = js.undefined
  
  /** Trace fieldExecutionWeight */
  var fieldExecutionWeight: js.UndefOr[Double | Null] = js.undefined
  
  /** Trace forbiddenOperation */
  var forbiddenOperation: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Trace fullQueryCacheHit */
  var fullQueryCacheHit: js.UndefOr[Boolean | Null] = js.undefined
  
  /** Trace http */
  var http: js.UndefOr[IHTTP | Null] = js.undefined
  
  /** Trace isIncomplete */
  var isIncomplete: js.UndefOr[Boolean | Null] = js.undefined
  
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
  
  /** Trace unexecutedOperationBody */
  var unexecutedOperationBody: js.UndefOr[String | Null] = js.undefined
  
  /** Trace unexecutedOperationName */
  var unexecutedOperationName: js.UndefOr[String | Null] = js.undefined
}
object ITrace {
  
  inline def apply(): ITrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITrace]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITrace] (val x: Self) extends AnyVal {
    
    inline def setCachePolicy(value: ICachePolicy): Self = StObject.set(x, "cachePolicy", value.asInstanceOf[js.Any])
    
    inline def setCachePolicyNull: Self = StObject.set(x, "cachePolicy", null)
    
    inline def setCachePolicyUndefined: Self = StObject.set(x, "cachePolicy", js.undefined)
    
    inline def setClientName(value: String): Self = StObject.set(x, "clientName", value.asInstanceOf[js.Any])
    
    inline def setClientNameNull: Self = StObject.set(x, "clientName", null)
    
    inline def setClientNameUndefined: Self = StObject.set(x, "clientName", js.undefined)
    
    inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
    
    inline def setClientVersionNull: Self = StObject.set(x, "clientVersion", null)
    
    inline def setClientVersionUndefined: Self = StObject.set(x, "clientVersion", js.undefined)
    
    inline def setDetails(value: IDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsNull: Self = StObject.set(x, "details", null)
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDurationNs(value: Double): Self = StObject.set(x, "durationNs", value.asInstanceOf[js.Any])
    
    inline def setDurationNsNull: Self = StObject.set(x, "durationNs", null)
    
    inline def setDurationNsUndefined: Self = StObject.set(x, "durationNs", js.undefined)
    
    inline def setEndTime(value: ITimestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeNull: Self = StObject.set(x, "endTime", null)
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setFieldExecutionWeight(value: Double): Self = StObject.set(x, "fieldExecutionWeight", value.asInstanceOf[js.Any])
    
    inline def setFieldExecutionWeightNull: Self = StObject.set(x, "fieldExecutionWeight", null)
    
    inline def setFieldExecutionWeightUndefined: Self = StObject.set(x, "fieldExecutionWeight", js.undefined)
    
    inline def setForbiddenOperation(value: Boolean): Self = StObject.set(x, "forbiddenOperation", value.asInstanceOf[js.Any])
    
    inline def setForbiddenOperationNull: Self = StObject.set(x, "forbiddenOperation", null)
    
    inline def setForbiddenOperationUndefined: Self = StObject.set(x, "forbiddenOperation", js.undefined)
    
    inline def setFullQueryCacheHit(value: Boolean): Self = StObject.set(x, "fullQueryCacheHit", value.asInstanceOf[js.Any])
    
    inline def setFullQueryCacheHitNull: Self = StObject.set(x, "fullQueryCacheHit", null)
    
    inline def setFullQueryCacheHitUndefined: Self = StObject.set(x, "fullQueryCacheHit", js.undefined)
    
    inline def setHttp(value: IHTTP): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpNull: Self = StObject.set(x, "http", null)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setIsIncomplete(value: Boolean): Self = StObject.set(x, "isIncomplete", value.asInstanceOf[js.Any])
    
    inline def setIsIncompleteNull: Self = StObject.set(x, "isIncomplete", null)
    
    inline def setIsIncompleteUndefined: Self = StObject.set(x, "isIncomplete", js.undefined)
    
    inline def setPersistedQueryHit(value: Boolean): Self = StObject.set(x, "persistedQueryHit", value.asInstanceOf[js.Any])
    
    inline def setPersistedQueryHitNull: Self = StObject.set(x, "persistedQueryHit", null)
    
    inline def setPersistedQueryHitUndefined: Self = StObject.set(x, "persistedQueryHit", js.undefined)
    
    inline def setPersistedQueryRegister(value: Boolean): Self = StObject.set(x, "persistedQueryRegister", value.asInstanceOf[js.Any])
    
    inline def setPersistedQueryRegisterNull: Self = StObject.set(x, "persistedQueryRegister", null)
    
    inline def setPersistedQueryRegisterUndefined: Self = StObject.set(x, "persistedQueryRegister", js.undefined)
    
    inline def setQueryPlan(value: IQueryPlanNode): Self = StObject.set(x, "queryPlan", value.asInstanceOf[js.Any])
    
    inline def setQueryPlanNull: Self = StObject.set(x, "queryPlan", null)
    
    inline def setQueryPlanUndefined: Self = StObject.set(x, "queryPlan", js.undefined)
    
    inline def setRegisteredOperation(value: Boolean): Self = StObject.set(x, "registeredOperation", value.asInstanceOf[js.Any])
    
    inline def setRegisteredOperationNull: Self = StObject.set(x, "registeredOperation", null)
    
    inline def setRegisteredOperationUndefined: Self = StObject.set(x, "registeredOperation", js.undefined)
    
    inline def setRoot(value: INode): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureNull: Self = StObject.set(x, "signature", null)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "signature", js.undefined)
    
    inline def setStartTime(value: ITimestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeNull: Self = StObject.set(x, "startTime", null)
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setUnexecutedOperationBody(value: String): Self = StObject.set(x, "unexecutedOperationBody", value.asInstanceOf[js.Any])
    
    inline def setUnexecutedOperationBodyNull: Self = StObject.set(x, "unexecutedOperationBody", null)
    
    inline def setUnexecutedOperationBodyUndefined: Self = StObject.set(x, "unexecutedOperationBody", js.undefined)
    
    inline def setUnexecutedOperationName(value: String): Self = StObject.set(x, "unexecutedOperationName", value.asInstanceOf[js.Any])
    
    inline def setUnexecutedOperationNameNull: Self = StObject.set(x, "unexecutedOperationName", null)
    
    inline def setUnexecutedOperationNameUndefined: Self = StObject.set(x, "unexecutedOperationName", js.undefined)
  }
}
