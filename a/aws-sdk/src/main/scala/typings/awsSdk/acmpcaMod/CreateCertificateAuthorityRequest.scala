package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCertificateAuthorityRequest extends StObject {
  
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
  implicit class CreateCertificateAuthorityRequestMutableBuilder[Self <: CreateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = StObject.set(x, "CertificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityType(value: CertificateAuthorityType): Self = StObject.set(x, "CertificateAuthorityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    @scala.inline
    def setRevocationConfiguration(value: RevocationConfiguration): Self = StObject.set(x, "RevocationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationConfigurationUndefined: Self = StObject.set(x, "RevocationConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
