package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateAuthorityRequest extends js.Object {
  
  /**
    * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject information.
    */
  var CertificateAuthorityConfiguration: typings.awsSdk.acmpcaMod.CertificateAuthorityConfiguration = js.native
  
  /**
    * The type of the certificate authority.
    */
  var CertificateAuthorityType: typings.awsSdk.acmpcaMod.CertificateAuthorityType = js.native
  
  /**
    * Alphanumeric string that can be used to distinguish between calls to CreateCertificateAuthority. For a given token, ACM Private CA creates exactly one CA. If you issue a subsequent call using the same token, ACM Private CA returns the ARN of the existing CA and takes no further action. If you change the idempotency token across multiple calls, ACM Private CA creates a unique CA for each unique token.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.acmpcaMod.IdempotencyToken] = js.native
  
  /**
    * Contains a Boolean value that you can use to enable a certification revocation list (CRL) for the CA, the name of the S3 bucket to which ACM Private CA will write the CRL, and an optional CNAME alias that you can use to hide the name of your bucket in the CRL Distribution Points extension of your CA certificate. For more information, see the CrlConfiguration structure. 
    */
  var RevocationConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.RevocationConfiguration] = js.native
  
  /**
    * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA. For information using tags with IAM to manage permissions, see Controlling Access Using IAM Tags.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object CreateCertificateAuthorityRequest {
  
  @scala.inline
  def apply(
    CertificateAuthorityConfiguration: CertificateAuthorityConfiguration,
    CertificateAuthorityType: CertificateAuthorityType
  ): CreateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityConfiguration = CertificateAuthorityConfiguration.asInstanceOf[js.Any], CertificateAuthorityType = CertificateAuthorityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit class CreateCertificateAuthorityRequestOps[Self <: CreateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = this.set("CertificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityType(value: CertificateAuthorityType): Self = this.set("CertificateAuthorityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdempotencyToken: Self = this.set("IdempotencyToken", js.undefined)
    
    @scala.inline
    def setRevocationConfiguration(value: RevocationConfiguration): Self = this.set("RevocationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRevocationConfiguration: Self = this.set("RevocationConfiguration", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
