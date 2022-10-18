package typings.awsSdk.clientsConnectcasesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsResponse extends StObject {
  
  /**
    * The Cases domain.
    */
  var domains: DomainSummaryList
  
  /**
    * The token for the next set of results. This is null if there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListDomainsResponse {
  
  inline def apply(domains: DomainSummaryList): ListDomainsResponse = {
    val __obj = js.Dynamic.literal(domains = domains.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDomainsResponse]
  }
  
  extension [Self <: ListDomainsResponse](x: Self) {
    
    inline def setDomains(value: DomainSummaryList): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    inline def setDomainsVarargs(value: DomainSummary*): Self = StObject.set(x, "domains", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
