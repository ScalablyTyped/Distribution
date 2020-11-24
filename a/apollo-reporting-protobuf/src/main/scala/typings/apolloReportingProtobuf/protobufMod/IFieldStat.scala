package typings.apolloReportingProtobuf.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFieldStat extends js.Object {
  
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
  implicit class IFieldStatOps[Self <: IFieldStat] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCountNull: Self = this.set("count", null)
    
    @scala.inline
    def setErrorsCount(value: Double): Self = this.set("errorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorsCount: Self = this.set("errorsCount", js.undefined)
    
    @scala.inline
    def setErrorsCountNull: Self = this.set("errorsCount", null)
    
    @scala.inline
    def setLatencyCountVarargs(value: Double*): Self = this.set("latencyCount", js.Array(value :_*))
    
    @scala.inline
    def setLatencyCount(value: js.Array[Double]): Self = this.set("latencyCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatencyCount: Self = this.set("latencyCount", js.undefined)
    
    @scala.inline
    def setLatencyCountNull: Self = this.set("latencyCount", null)
    
    @scala.inline
    def setRequestsWithErrorsCount(value: Double): Self = this.set("requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsWithErrorsCount: Self = this.set("requestsWithErrorsCount", js.undefined)
    
    @scala.inline
    def setRequestsWithErrorsCountNull: Self = this.set("requestsWithErrorsCount", null)
    
    @scala.inline
    def setReturnType(value: String): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnType: Self = this.set("returnType", js.undefined)
    
    @scala.inline
    def setReturnTypeNull: Self = this.set("returnType", null)
  }
}
