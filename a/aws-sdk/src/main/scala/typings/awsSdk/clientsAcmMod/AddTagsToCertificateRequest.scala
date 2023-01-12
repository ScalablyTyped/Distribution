package typings.awsSdk.clientsAcmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddTagsToCertificateRequest extends StObject {
  
  /**
    * String that contains the ARN of the ACM certificate to which the tag is to be applied. This must be of the form:  arn:aws:acm:region:123456789012:certificate/12345678-1234-1234-1234-123456789012  For more information about ARNs, see Amazon Resource Names (ARNs).
    */
  var CertificateArn: Arn
  
  /**
    * The key-value pair that defines the tag. The tag value is optional.
    */
  var Tags: TagList
}
object AddTagsToCertificateRequest {
  
  inline def apply(CertificateArn: Arn, Tags: TagList): AddTagsToCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateArn = CertificateArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTagsToCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddTagsToCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateArn(value: Arn): Self = StObject.set(x, "CertificateArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
