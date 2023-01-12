package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsightsClosedStatusFilter extends StObject {
  
  /**
    *  A time range used to specify when the behavior of the filtered insights ended. 
    */
  var EndTimeRange: typings.awsSdk.clientsDevopsguruMod.EndTimeRange
  
  /**
    *  Use to filter for either REACTIVE or PROACTIVE insights. 
    */
  var Type: InsightType
}
object ListInsightsClosedStatusFilter {
  
  inline def apply(EndTimeRange: EndTimeRange, Type: InsightType): ListInsightsClosedStatusFilter = {
    val __obj = js.Dynamic.literal(EndTimeRange = EndTimeRange.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInsightsClosedStatusFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInsightsClosedStatusFilter] (val x: Self) extends AnyVal {
    
    inline def setEndTimeRange(value: EndTimeRange): Self = StObject.set(x, "EndTimeRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: InsightType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
