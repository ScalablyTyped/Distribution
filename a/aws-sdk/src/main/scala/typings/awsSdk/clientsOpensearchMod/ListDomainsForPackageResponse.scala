package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDomainsForPackageResponse extends StObject {
  
  /**
    * Information about all domains associated with a package.
    */
  var DomainPackageDetailsList: js.UndefOr[typings.awsSdk.clientsOpensearchMod.DomainPackageDetailsList] = js.undefined
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListDomainsForPackageResponse {
  
  inline def apply(): ListDomainsForPackageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDomainsForPackageResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDomainsForPackageResponse] (val x: Self) extends AnyVal {
    
    inline def setDomainPackageDetailsList(value: DomainPackageDetailsList): Self = StObject.set(x, "DomainPackageDetailsList", value.asInstanceOf[js.Any])
    
    inline def setDomainPackageDetailsListUndefined: Self = StObject.set(x, "DomainPackageDetailsList", js.undefined)
    
    inline def setDomainPackageDetailsListVarargs(value: DomainPackageDetails*): Self = StObject.set(x, "DomainPackageDetailsList", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
