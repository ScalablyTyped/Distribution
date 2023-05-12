package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicDateRangeFilter extends StObject {
  
  /**
    * The constant used in a date range filter.
    */
  var Constant: js.UndefOr[TopicRangeFilterConstant] = js.undefined
  
  /**
    * A Boolean value that indicates whether the date range filter should include the boundary values. If set to true, the filter includes the start and end dates. If set to false, the filter excludes them.
    */
  var Inclusive: js.UndefOr[Boolean] = js.undefined
}
object TopicDateRangeFilter {
  
  inline def apply(): TopicDateRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicDateRangeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicDateRangeFilter] (val x: Self) extends AnyVal {
    
    inline def setConstant(value: TopicRangeFilterConstant): Self = StObject.set(x, "Constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "Constant", js.undefined)
    
    inline def setInclusive(value: Boolean): Self = StObject.set(x, "Inclusive", value.asInstanceOf[js.Any])
    
    inline def setInclusiveUndefined: Self = StObject.set(x, "Inclusive", js.undefined)
  }
}
