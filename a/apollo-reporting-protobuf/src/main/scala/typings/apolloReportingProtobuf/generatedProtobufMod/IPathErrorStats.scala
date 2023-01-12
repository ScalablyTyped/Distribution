package typings.apolloReportingProtobuf.generatedProtobufMod

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
  
  inline def apply(): IPathErrorStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPathErrorStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPathErrorStats] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: StringDictionary[IPathErrorStats]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setErrorsCount(value: Double): Self = StObject.set(x, "errorsCount", value.asInstanceOf[js.Any])
    
    inline def setErrorsCountNull: Self = StObject.set(x, "errorsCount", null)
    
    inline def setErrorsCountUndefined: Self = StObject.set(x, "errorsCount", js.undefined)
    
    inline def setRequestsWithErrorsCount(value: Double): Self = StObject.set(x, "requestsWithErrorsCount", value.asInstanceOf[js.Any])
    
    inline def setRequestsWithErrorsCountNull: Self = StObject.set(x, "requestsWithErrorsCount", null)
    
    inline def setRequestsWithErrorsCountUndefined: Self = StObject.set(x, "requestsWithErrorsCount", js.undefined)
  }
}
