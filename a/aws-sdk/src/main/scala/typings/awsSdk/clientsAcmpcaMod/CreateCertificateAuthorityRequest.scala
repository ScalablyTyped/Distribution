package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCertificateAuthorityRequest extends StObject {
  
  /**
    * Name and bit size of the private key algorithm, the name of the signing algorithm, and X.500 certificate subject information.
    */
  var CertificateAuthorityConfiguration: typings.awsSdk.clientsAcmpcaMod.CertificateAuthorityConfiguration
  
  /**
    * The type of the certificate authority.
    */
  var CertificateAuthorityType: typings.awsSdk.clientsAcmpcaMod.CertificateAuthorityType
  
  /**
    * Custom string that can be used to distinguish between calls to the CreateCertificateAuthority action. Idempotency tokens for CreateCertificateAuthority time out after five minutes. Therefore, if you call CreateCertificateAuthority multiple times with the same idempotency token within five minutes, Amazon Web Services Private CA recognizes that you are requesting only certificate authority and will issue only one. If you change the idempotency token for each call, Amazon Web Services Private CA recognizes that you are requesting multiple certificate authorities.
    */
  var IdempotencyToken: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.IdempotencyToken] = js.undefined
  
  /**
    * Specifies a cryptographic key management compliance standard used for handling CA keys. Default: FIPS_140_2_LEVEL_3_OR_HIGHER  Note: FIPS_140_2_LEVEL_3_OR_HIGHER is not supported in the following Regions:   ap-northeast-3   ap-southeast-3   When creating a CA in these Regions, you must provide FIPS_140_2_LEVEL_2_OR_HIGHER as the argument for KeyStorageSecurityStandard. Failure to do this results in an InvalidArgsException with the message, "A certificate authority cannot be created in this region with the specified security standard."
    */
  var KeyStorageSecurityStandard: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.KeyStorageSecurityStandard] = js.undefined
  
  /**
    * Contains information to enable Online Certificate Status Protocol (OCSP) support, to enable a certificate revocation list (CRL), to enable both, or to enable neither. The default is for both certificate validation mechanisms to be disabled.   The following requirements apply to revocation configurations.   A configuration disabling CRLs or OCSP must contain only the Enabled=False parameter, and will fail if other parameters such as CustomCname or ExpirationInDays are included.   In a CRL configuration, the S3BucketName parameter must conform to Amazon S3 bucket naming rules.   A configuration containing a custom Canonical Name (CNAME) parameter for CRLs or OCSP must conform to RFC2396 restrictions on the use of special characters in a CNAME.    In a CRL or OCSP configuration, the value of a CNAME parameter must not include a protocol prefix such as "http://" or "https://".     For more information, see the OcspConfiguration and CrlConfiguration types.
    */
  var RevocationConfiguration: js.UndefOr[typings.awsSdk.clientsAcmpcaMod.RevocationConfiguration] = js.undefined
  
  /**
    * Key-value pairs that will be attached to the new private CA. You can associate up to 50 tags with a private CA. For information using tags with IAM to manage permissions, see Controlling Access Using IAM Tags.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * Specifies whether the CA issues general-purpose certificates that typically require a revocation mechanism, or short-lived certificates that may optionally omit revocation because they expire quickly. Short-lived certificate validity is limited to seven days. The default value is GENERAL_PURPOSE.
    */
  var UsageMode: js.UndefOr[CertificateAuthorityUsageMode] = js.undefined
}
object CreateCertificateAuthorityRequest {
  
  inline def apply(
    CertificateAuthorityConfiguration: CertificateAuthorityConfiguration,
    CertificateAuthorityType: CertificateAuthorityType
  ): CreateCertificateAuthorityRequest = {
    val __obj = js.Dynamic.literal(CertificateAuthorityConfiguration = CertificateAuthorityConfiguration.asInstanceOf[js.Any], CertificateAuthorityType = CertificateAuthorityType.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCertificateAuthorityRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateCertificateAuthorityRequest] (val x: Self) extends AnyVal {
    
    inline def setCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = StObject.set(x, "CertificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityType(value: CertificateAuthorityType): Self = StObject.set(x, "CertificateAuthorityType", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyToken(value: IdempotencyToken): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
    
    inline def setKeyStorageSecurityStandard(value: KeyStorageSecurityStandard): Self = StObject.set(x, "KeyStorageSecurityStandard", value.asInstanceOf[js.Any])
    
    inline def setKeyStorageSecurityStandardUndefined: Self = StObject.set(x, "KeyStorageSecurityStandard", js.undefined)
    
    inline def setRevocationConfiguration(value: RevocationConfiguration): Self = StObject.set(x, "RevocationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRevocationConfigurationUndefined: Self = StObject.set(x, "RevocationConfiguration", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUsageMode(value: CertificateAuthorityUsageMode): Self = StObject.set(x, "UsageMode", value.asInstanceOf[js.Any])
    
    inline def setUsageModeUndefined: Self = StObject.set(x, "UsageMode", js.undefined)
  }
}
