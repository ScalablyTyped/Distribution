package typings.apolloReportingProtobuf.protobufMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPathErrorStats extends StObject {
  
  /** PathErrorStats children */
  var children: js.UndefOr[StringDictionary[IPathErrorStats] | Null] = js.undefined
  
  /** PathErrorStats errorsCount */
  var errorsCount: js.UndefOr[Double | Null] = js.undefined
  
  /** PathErrorStats requestsWithErrorsCount */
  var requestsWithErrorsCount: js.UndefOr[Double | Null] = js.undefined
}
object IPathErrorStats {
  
  @scala.inline
  def apply(): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathErrorStats]
  }
  
  @scala.inline
  implicit class IPathErrorStatsMutableBuilder[Self <: IPathErrorStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: StringDictionary[IPathErrorStats]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setErrorsCount(value: Double): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsCountNull: Self = StObject.set(x, "errorsCount", null)
    
    @scala.inline
    def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    @scala.inline
    def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    @scala.inline
    def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
  }
}
