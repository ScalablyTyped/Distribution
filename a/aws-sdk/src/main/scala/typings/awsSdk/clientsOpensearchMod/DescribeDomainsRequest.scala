package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDomainsRequest extends StObject {
  
  /**
    * Array of OpenSearch Service domain names that you want information about. If you don't specify any domains, OpenSearch Service returns information about all domains owned by the account.
    */
  var DomainNames: DomainNameList
}
object DescribeDomainsRequest {
  
  inline def apply(DomainNames: DomainNameList): DescribeDomainsRequest = {
    val __obj = js.Dynamic.literal(DomainNames = DomainNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDomainsRequest]
  }
  
  extension [Self <: DescribeDomainsRequest](x: Self) {
    
    inline def setDomainNames(value: DomainNameList): Self = StObject.set(x, "DomainNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNamesVarargs(value: DomainName*): Self = StObject.set(x, "DomainNames", js.Array(value*))
  }
}
