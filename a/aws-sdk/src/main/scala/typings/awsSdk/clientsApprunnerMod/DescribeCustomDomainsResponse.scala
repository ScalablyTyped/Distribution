package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomDomainsResponse extends StObject {
  
  /**
    * A list of descriptions of custom domain names that are associated with the service. In a paginated request, the request returns up to MaxResults records per call.
    */
  var CustomDomains: CustomDomainList
  
  /**
    * The App Runner subdomain of the App Runner service. The associated custom domain names are mapped to this target name.
    */
  var DNSTarget: String
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the App Runner service whose associated custom domain names you want to describe.
    */
  var ServiceArn: AppRunnerResourceArn
}
object DescribeCustomDomainsResponse {
  
  inline def apply(CustomDomains: CustomDomainList, DNSTarget: String, ServiceArn: AppRunnerResourceArn): DescribeCustomDomainsResponse = {
    val __obj = js.Dynamic.literal(CustomDomains = CustomDomains.asInstanceOf[js.Any], DNSTarget = DNSTarget.asInstanceOf[js.Any], ServiceArn = ServiceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomDomainsResponse]
  }
  
  extension [Self <: DescribeCustomDomainsResponse](x: Self) {
    
    inline def setCustomDomains(value: CustomDomainList): Self = StObject.set(x, "CustomDomains", value.asInstanceOf[js.Any])
    
    inline def setCustomDomainsVarargs(value: CustomDomain*): Self = StObject.set(x, "CustomDomains", js.Array(value*))
    
    inline def setDNSTarget(value: String): Self = StObject.set(x, "DNSTarget", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setServiceArn(value: AppRunnerResourceArn): Self = StObject.set(x, "ServiceArn", value.asInstanceOf[js.Any])
  }
}
