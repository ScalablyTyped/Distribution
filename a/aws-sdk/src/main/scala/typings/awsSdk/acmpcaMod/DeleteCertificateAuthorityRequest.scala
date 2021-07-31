package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCertificateAuthorityRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that was returned when you called CreateCertificateAuthority. This must have the following form:   arn:aws:acm-pca:region:account:certificate-authority/12345678-1234-1234-1234-123456789012 . 
    */
  var CertificateAuthorityArn: Arn
  
  /**
    * The number of days to make a CA restorable after it has been deleted. This can be anywhere from 7 to 30 days, with 30 being the default.
    */
  var PermanentDeletionTimeInDays: js.UndefOr[typings.awsSdk.acmpcaMod.PermanentDeletionTimeInDays] = js.undefined
}
object DeleteCertificateAuthorityRequest {
  
  @scala.inline
  def apply(CertificateAuthorityArn: Arn): DeleteCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityArn = CertificateAuthorityArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class DeleteCertificateAuthorityRequestMutableBuilder[Self <: DeleteCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = StObject.set(x, "CertificateAuthorityArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentDeletionTimeInDays(value: PermanentDeletionTimeInDays): Self = StObject.set(x, "PermanentDeletionTimeInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermanentDeletionTimeInDaysUndefined: Self = StObject.set(x, "PermanentDeletionTimeInDays", js.undefined)
  }
}
