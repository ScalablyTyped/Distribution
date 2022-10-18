package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePolicyRequest extends StObject {
  
  /**
    * The Amazon Resource Number (ARN) of the private CA that will have its policy deleted. You can find the CA's ARN by calling the ListCertificateAuthorities action. The ARN value must have the form arn:aws:acm-pca:region:account:certificate-authority/01234567-89ab-cdef-0123-0123456789ab. 
    */
  var ResourceArn: Arn
}
object DeletePolicyRequest {
  
  inline def apply(ResourceArn: Arn): DeletePolicyRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePolicyRequest]
  }
  
  extension [Self <: DeletePolicyRequest](x: Self) {
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
  }
}
