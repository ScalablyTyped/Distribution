package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointsForDomainRequest extends StObject {
  
  /**
    * Name of the ElasticSearch domain whose VPC endpoints are to be listed.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
}
object ListVpcEndpointsForDomainRequest {
  
  inline def apply(DomainName: DomainName): ListVpcEndpointsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointsForDomainRequest]
  }
  
  extension [Self <: ListVpcEndpointsForDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
