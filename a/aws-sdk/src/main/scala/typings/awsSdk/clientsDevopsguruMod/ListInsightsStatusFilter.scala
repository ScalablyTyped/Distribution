package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsightsStatusFilter extends StObject {
  
  /**
    *  A ListInsightsAnyStatusFilter that specifies insights of any status that are either REACTIVE or PROACTIVE. 
    */
  var Any: js.UndefOr[ListInsightsAnyStatusFilter] = js.undefined
  
  /**
    *  A ListInsightsClosedStatusFilter that specifies closed insights that are either REACTIVE or PROACTIVE. 
    */
  var Closed: js.UndefOr[ListInsightsClosedStatusFilter] = js.undefined
  
  /**
    *  A ListInsightsAnyStatusFilter that specifies ongoing insights that are either REACTIVE or PROACTIVE. 
    */
  var Ongoing: js.UndefOr[ListInsightsOngoingStatusFilter] = js.undefined
}
object ListInsightsStatusFilter {
  
  inline def apply(): ListInsightsStatusFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInsightsStatusFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInsightsStatusFilter] (val x: Self) extends AnyVal {
    
    inline def setAny(value: ListInsightsAnyStatusFilter): Self = StObject.set(x, "Any", value.asInstanceOf[js.Any])
    
    inline def setAnyUndefined: Self = StObject.set(x, "Any", js.undefined)
    
    inline def setClosed(value: ListInsightsClosedStatusFilter): Self = StObject.set(x, "Closed", value.asInstanceOf[js.Any])
    
    inline def setClosedUndefined: Self = StObject.set(x, "Closed", js.undefined)
    
    inline def setOngoing(value: ListInsightsOngoingStatusFilter): Self = StObject.set(x, "Ongoing", value.asInstanceOf[js.Any])
    
    inline def setOngoingUndefined: Self = StObject.set(x, "Ongoing", js.undefined)
  }
}
