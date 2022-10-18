package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificateAuthoritiesRequest extends StObject {
  
  /**
    * Use this parameter when paginating results to specify the maximum number of items to return in the response on each page. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.MaxResults] = js.undefined
  
  /**
    * Use this parameter when paginating results in a subsequent request after you receive a response with truncated results. Set it to the value of the NextToken parameter from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.NextToken] = js.undefined
  
  /**
    * Use this parameter to filter the returned set of certificate authorities based on their owner. The default is SELF.
    */
  var ResourceOwner: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.ResourceOwner] = js.undefined
}
object ListCertificateAuthoritiesRequest {
  
  inline def apply(): ListCertificateAuthoritiesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCertificateAuthoritiesRequest]
  }
  
  extension [Self <: ListCertificateAuthoritiesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setResourceOwner(value: ResourceOwner): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
  }
}
