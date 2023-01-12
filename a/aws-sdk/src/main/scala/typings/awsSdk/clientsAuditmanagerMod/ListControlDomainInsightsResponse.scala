package typings.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlDomainInsightsResponse extends StObject {
  
  /**
    * The control domain analytics data that the ListControlDomainInsights API returned. 
    */
  var controlDomainInsights: js.UndefOr[ControlDomainInsightsList] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlDomainInsightsResponse {
  
  inline def apply(): ListControlDomainInsightsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlDomainInsightsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListControlDomainInsightsResponse] (val x: Self) extends AnyVal {
    
    inline def setControlDomainInsights(value: ControlDomainInsightsList): Self = StObject.set(x, "controlDomainInsights", value.asInstanceOf[js.Any])
    
    inline def setControlDomainInsightsUndefined: Self = StObject.set(x, "controlDomainInsights", js.undefined)
    
    inline def setControlDomainInsightsVarargs(value: ControlDomainInsights*): Self = StObject.set(x, "controlDomainInsights", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
