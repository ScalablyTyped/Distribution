package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPackagesForDomainRequest extends StObject {
  
  /**
    * The name of the domain for which you want to list associated packages.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * Limits results to a maximum number of packages.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsOpensearchMod.MaxResults] = js.undefined
  
  /**
    * Used for pagination. Only necessary if a previous API call includes a non-null NextToken value. If provided, returns results for the next page. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object ListPackagesForDomainRequest {
  
  inline def apply(DomainName: DomainName): ListPackagesForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPackagesForDomainRequest]
  }
  
  extension [Self <: ListPackagesForDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
