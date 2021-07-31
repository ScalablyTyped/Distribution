package typings.awsSdk.acmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the ACM certificate. The ARN must have the following form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var CertificateArn: Arn
}
object DescribeCertificateRequest {
  
  @scala.inline
  def apply(CertificateArn: Arn): DescribeCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateRequest]
  }
  
  @scala.inline
  implicit class DescribeCertificateRequestMutableBuilder[Self <: DescribeCertificateRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
  }
}
