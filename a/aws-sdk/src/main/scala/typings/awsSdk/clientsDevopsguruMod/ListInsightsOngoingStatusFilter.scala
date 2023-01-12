package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInsightsOngoingStatusFilter extends StObject {
  
  /**
    *  Use to filter for either REACTIVE or PROACTIVE insights. 
    */
  var Type: InsightType
}
object ListInsightsOngoingStatusFilter {
  
  inline def apply(Type: InsightType): ListInsightsOngoingStatusFilter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInsightsOngoingStatusFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInsightsOngoingStatusFilter] (val x: Self) extends AnyVal {
    
    inline def setType(value: InsightType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
