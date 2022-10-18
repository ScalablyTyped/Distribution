package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInsightsResponse extends StObject {
  
  /**
    * The analytics data that the GetInsights API returned. 
    */
  var insights: js.UndefOr[Insights] = js.undefined
}
object GetInsightsResponse {
  
  inline def apply(): GetInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInsightsResponse]
  }
  
  extension [Self <: GetInsightsResponse](x: Self) {
    
    inline def setInsights(value: Insights): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
  }
}
