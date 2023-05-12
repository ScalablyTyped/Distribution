package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRelativeDateFilter extends StObject {
  
  /**
    * The constant used in a relative date filter.
    */
  var Constant: js.UndefOr[TopicSingularFilterConstant] = js.undefined
  
  /**
    * The function to be used in a relative date filter to determine the range of dates to include in the results. Valid values for this structure are BEFORE, AFTER, and BETWEEN.
    */
  var RelativeDateFilterFunction: js.UndefOr[TopicRelativeDateFilterFunction] = js.undefined
  
  /**
    * The level of time precision that is used to aggregate DateTime values.
    */
  var TimeGranularity: js.UndefOr[TopicTimeGranularity] = js.undefined
}
object TopicRelativeDateFilter {
  
  inline def apply(): TopicRelativeDateFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopicRelativeDateFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TopicRelativeDateFilter] (val x: Self) extends AnyVal {
    
    inline def setConstant(value: TopicSingularFilterConstant): Self = StObject.set(x, "Constant", value.asInstanceOf[js.Any])
    
    inline def setConstantUndefined: Self = StObject.set(x, "Constant", js.undefined)
    
    inline def setRelativeDateFilterFunction(value: TopicRelativeDateFilterFunction): Self = StObject.set(x, "RelativeDateFilterFunction", value.asInstanceOf[js.Any])
    
    inline def setRelativeDateFilterFunctionUndefined: Self = StObject.set(x, "RelativeDateFilterFunction", js.undefined)
    
    inline def setTimeGranularity(value: TopicTimeGranularity): Self = StObject.set(x, "TimeGranularity", value.asInstanceOf[js.Any])
    
    inline def setTimeGranularityUndefined: Self = StObject.set(x, "TimeGranularity", js.undefined)
  }
}
