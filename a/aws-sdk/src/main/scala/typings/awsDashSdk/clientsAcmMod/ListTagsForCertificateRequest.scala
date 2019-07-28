package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTagsForCertificateRequest extends js.Object {
  /**
    * String that contains the ARN of the ACM certificate for which you want to list the tags. This must have the following form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
    */
  var CertificateArn: Arn
}

object ListTagsForCertificateRequest {
  @scala.inline
  def apply(CertificateArn: Arn): ListTagsForCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn)
  
    __obj.asInstanceOf[ListTagsForCertificateRequest]
  }
}

