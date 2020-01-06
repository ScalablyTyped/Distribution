package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTagsToCertificateRequest extends js.Object {
  /**
    * String that contains the ARN of the ACM certificate to which the tag is to be applied. This must be of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
    */
  var CertificateArn: Arn = js.native
  /**
    * The key-value pair that defines the tag. The tag value is optional.
    */
  var Tags: TagList = js.native
}

object AddTagsToCertificateRequest {
  @scala.inline
  def apply(CertificateArn: Arn, Tags: TagList): AddTagsToCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddTagsToCertificateRequest]
  }
}

