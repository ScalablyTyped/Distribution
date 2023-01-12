package typings.apolloReportingProtobuf.generatedProtobufMod

import typings.apolloProtobufjs.mod.ToArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldStat extends StObject {
  
  /** FieldStat errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldStat estimatedExecutionCount */
  var estimatedExecutionCount: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldStat latencyCount */
  var latencyCount: js.UndefOr[ToArray[Double] | js.Array[Double] | Null] = js.undefined
  
  /** FieldStat observedExecutionCount */
  var observedExecutionCount: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldStat requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldStat returnType */
  var returnType: js.UndefOr[String | Null] = js.undefined
}
object IFieldStat {
  
  inline def apply(): IFieldStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldStat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IFieldStat] (val x: Self) extends AnyVal {
    
    inline def setErrorsCount(value: Double): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    inline def setErrorsCountNull: Self = StObject.set(x, "errorsCount", null)
    
    inline def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    inline def setEstimatedExecutionCount(value: Double): Self = StObject.set(x, "estimatedExecutionCount", value.asInstanceOf[js.Any])
    
    inline def setEstimatedExecutionCountNull: Self = StObject.set(x, "estimatedExecutionCount", null)
    
    inline def setEstimatedExecutionCountUndefined: Self = StObject.set(x, "estimatedExecutionCount", js.undefined)
    
    inline def setLatencyCount(value: ToArray[Double] | js.Array[Double]): Self = StObject.set(x, "latencyCount", value.asInstanceOf[js.Any])
    
    inline def setLatencyCountNull: Self = StObject.set(x, "latencyCount", null)
    
    inline def setLatencyCountUndefined: Self = StObject.set(x, "latencyCount", js.undefined)
    
    inline def setLatencyCountVarargs(value: Double*): Self = StObject.set(x, "latencyCount", js.Array(value*))
    
    inline def setObservedExecutionCount(value: Double): Self = StObject.set(x, "observedExecutionCount", value.asInstanceOf[js.Any])
    
    inline def setObservedExecutionCountNull: Self = StObject.set(x, "observedExecutionCount", null)
    
    inline def setObservedExecutionCountUndefined: Self = StObject.set(x, "observedExecutionCount", js.undefined)
    
    inline def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    inline def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    inline def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
