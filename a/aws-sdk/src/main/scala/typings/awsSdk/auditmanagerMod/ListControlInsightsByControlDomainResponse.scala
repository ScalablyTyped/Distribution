package typings.awsSdk.auditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListControlInsightsByControlDomainResponse extends StObject {
  
  /**
    * The control analytics data that the ListControlInsightsByControlDomain API returned. 
    */
  var controlInsightsMetadata: js.UndefOr[ControlInsightsMetadata] = js.undefined
  
  /**
    * The pagination token that's used to fetch the next set of results. 
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListControlInsightsByControlDomainResponse {
  
  inline def apply(): ListControlInsightsByControlDomainResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListControlInsightsByControlDomainResponse]
  }
  
  extension [Self <: ListControlInsightsByControlDomainResponse](x: Self) {
    
    inline def setControlInsightsMetadata(value: ControlInsightsMetadata): Self = StObject.set(x, "controlInsightsMetadata", value.asInstanceOf[js.Any])
    
    inline def setControlInsightsMetadataUndefined: Self = StObject.set(x, "controlInsightsMetadata", js.undefined)
    
    inline def setControlInsightsMetadataVarargs(value: ControlInsightsMetadataItem*): Self = StObject.set(x, "controlInsightsMetadata", js.Array(value*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
