package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFieldStat extends StObject {
  
  /** FieldStat count */
  var count: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldStat errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /** FieldStat latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.undefined
  
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
  
  extension [Self <: IFieldStat](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountNull: Self = StObject.set(x, "count", null)
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setErrorsCount(value: Double): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    inline def setErrorsCountNull: Self = StObject.set(x, "errorsCount", null)
    
    inline def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    inline def setLatencyCount(value: js.Array[Double]): Self = StObject.set(x, "latencyCount", value.asInstanceOf[js.Any])
    
    inline def setLatencyCountNull: Self = StObject.set(x, "latencyCount", null)
    
    inline def setLatencyCountUndefined: Self = StObject.set(x, "latencyCount", js.undefined)
    
    inline def setLatencyCountVarargs(value: Double*): Self = StObject.set(x, "latencyCount", js.Array(value :_*))
    
    inline def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    inline def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    inline def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
    
    inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
