package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPermissionsRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the private CA to inspect. You can find the ARN by calling the ListCertificateAuthorities action. This must be of the form: arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 You can get a private CA's ARN by running the ListCertificateAuthorities action.
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * When paginating results, use this parameter to specify the maximum number of items to return in the response. If additional items exist beyond the number you specify, the NextToken element is sent in the response. Use this NextToken value in a subsequent request to retrieve additional items.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.MaxResults] = js.undefined
  
  /**
    * When paginating results, use this parameter in a subsequent request after you receive a response with truncated results. Set it to the value of NextToken from the response you just received.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.NextToken] = js.undefined
}
object ListPermissionsRequest {
  
  inline def apply(CertificateAuthorityArn: Arn): ListPermissionsRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPermissionsRequest]
  }
  
  extension [Self <: ListPermissionsRequest](x: Self) {
    
    inline def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
