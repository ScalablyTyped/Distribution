package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldStat extends StObject {
  
  /** FieldStat count */
  var count: js.UndefOr[Double | Null] = js.native
  
  /** FieldStat errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.native
  
  /** FieldStat latencyCount */
  var latencyCount: js.UndefOr[js.Array[Double] | Null] = js.native
  
  /** FieldStat requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
  
  /** FieldStat returnType */
  var returnType: js.UndefOr[String | Null] = js.native
}
object IFieldStat {
  
  @scala.inline
  def apply(): IFieldStat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IFieldStat]
  }
  
  @scala.inline
  implicit class IFieldStatMutableBuilder[Self <: IFieldStat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountNull: Self = StObject.set(x, "count", null)
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setErrorsCount(value: Double): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsCountNull: Self = StObject.set(x, "errorsCount", null)
    
    @scala.inline
    def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    @scala.inline
    def setLatencyCount(value: js.Array[Double]): Self = StObject.set(x, "latencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyCountNull: Self = StObject.set(x, "latencyCount", null)
    
    @scala.inline
    def setLatencyCountUndefined: Self = StObject.set(x, "latencyCount", js.undefined)
    
    @scala.inline
    def setLatencyCountVarargs(value: Double*): Self = StObject.set(x, "latencyCount", js.Array(value :_*))
    
    @scala.inline
    def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    @scala.inline
    def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
    
    @scala.inline
    def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
  }
}
