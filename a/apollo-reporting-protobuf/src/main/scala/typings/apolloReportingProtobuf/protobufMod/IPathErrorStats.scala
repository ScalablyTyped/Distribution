package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPathErrorStats extends js.Object {
  
  /** PathErrorStats children */
  var children: js.UndefOr[StringDictionary[IPathErrorStats] | Null] = js.native
  
  /** PathErrorStats errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.native
  
  /** PathErrorStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.native
}
object IPathErrorStats {
  
  @scala.inline
  def apply(): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathErrorStats]
  }
  
  @scala.inline
  implicit class IPathErrorStatsOps[Self <: IPathErrorStats] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: StringDictionary[IPathErrorStats]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setChildrenNull: Self = this.set("children", null)
    
    @scala.inline
    def setErrorsCount(value: Double): Self = this.set("errorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorsCount: Self = this.set("errorsCount", js.undefined)
    
    @scala.inline
    def setErrorsCountNull: Self = this.set("errorsCount", null)
    
    @scala.inline
    def setRequestsWithErrorsCount(value: Double): Self = this.set("requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestsWithErrorsCount: Self = this.set("requestsWithErrorsCount", js.undefined)
    
    @scala.inline
    def setRequestsWithErrorsCountNull: Self = this.set("requestsWithErrorsCount", null)
  }
}
