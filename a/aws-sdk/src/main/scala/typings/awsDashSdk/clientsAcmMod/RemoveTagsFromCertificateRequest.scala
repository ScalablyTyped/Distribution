package typings.awsDashSdk.clientsAcmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveTagsFromCertificateRequest extends js.Object {
  /**
    * String that contains the ARN of the ACM Certificate with one or more tags that you want to remove. This must be of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs) and AWS Service Namespaces. 
    */
  var CertificateArn: Arn
  /**
    * The key-value pair that defines the tag to remove.
    */
  var Tags: TagList
}

object RemoveTagsFromCertificateRequest {
  @scala.inline
  def apply(CertificateArn: Arn, Tags: TagList): RemoveTagsFromCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn, Tags = Tags)
  
    __obj.asInstanceOf[RemoveTagsFromCertificateRequest]
  }
}

