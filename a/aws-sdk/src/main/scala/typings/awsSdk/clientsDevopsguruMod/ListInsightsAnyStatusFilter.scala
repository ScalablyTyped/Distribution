package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsightsAnyStatusFilter extends StObject {
  
  /**
    *  A time range used to specify when the behavior of the filtered insights started. 
    */
  var StartTimeRange: typings.awsSdk.clientsDevopsguruMod.StartTimeRange
  
  /**
    *  Use to filter for either REACTIVE or PROACTIVE insights. 
    */
  var Type: InsightType
}
object ListInsightsAnyStatusFilter {
  
  inline def apply(StartTimeRange: StartTimeRange, Type: InsightType): ListInsightsAnyStatusFilter = {
    val __obj = js.Dynamic.literal(StartTimeRange = StartTimeRange.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInsightsAnyStatusFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInsightsAnyStatusFilter] (val x: Self) extends AnyVal {
    
    inline def setStartTimeRange(value: StartTimeRange): Self = StObject.set(x, "StartTimeRange", value.asInstanceOf[js.Any])
    
    inline def setType(value: InsightType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
