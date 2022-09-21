package typings.awsSdk.acmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateAuthority extends StObject {
  
  /**
    * Amazon Resource Name (ARN) for your private certificate authority (CA). The format is  12345678-1234-1234-1234-123456789012 .
    */
  var Arn: js.UndefOr[typings.awsSdk.acmpcaMod.Arn] = js.undefined
  
  /**
    * Your private CA configuration.
    */
  var CertificateAuthorityConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.CertificateAuthorityConfiguration] = js.undefined
  
  /**
    * Date and time at which your private CA was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Reason the request to create your private CA failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.acmpcaMod.FailureReason] = js.undefined
  
  /**
    * Defines a cryptographic key management compliance standard used for handling CA keys.  Default: FIPS_140_2_LEVEL_3_OR_HIGHER Note: Amazon Web Services Region ap-northeast-3 supports only FIPS_140_2_LEVEL_2_OR_HIGHER. You must explicitly specify this parameter and value when creating a CA in that Region. Specifying a different value (or no value) results in an InvalidArgsException with the message "A certificate authority cannot be created in this region with the specified security standard."
    */
  var KeyStorageSecurityStandard: js.UndefOr[typings.awsSdk.acmpcaMod.KeyStorageSecurityStandard] = js.undefined
  
  /**
    * Date and time at which your private CA was last updated.
    */
  var LastStateChangeAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Date and time after which your private CA certificate is not valid.
    */
  var NotAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Date and time before which your private CA certificate is not valid.
    */
  var NotBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Web Services account ID that owns the certificate authority.
    */
  var OwnerAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest action. 
    */
  var RestorableUntil: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the Online Certificate Status Protocol (OCSP) configuration or certificate revocation list (CRL) created and maintained by your private CA. 
    */
  var RevocationConfiguration: js.UndefOr[typings.awsSdk.acmpcaMod.RevocationConfiguration] = js.undefined
  
  /**
    * Serial number of your private CA.
    */
  var Serial: js.UndefOr[String] = js.undefined
  
  /**
    * Status of your private CA.
    */
  var Status: js.UndefOr[CertificateAuthorityStatus] = js.undefined
  
  /**
    * Type of your private CA.
    */
  var Type: js.UndefOr[CertificateAuthorityType] = js.undefined
}
object CertificateAuthority {
  
  inline def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  
  extension [Self <: CertificateAuthority](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = StObject.set(x, "CertificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    
    inline def setCertificateAuthorityConfigurationUndefined: Self = StObject.set(x, "CertificateAuthorityConfiguration", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    inline def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    inline def setKeyStorageSecurityStandard(value: KeyStorageSecurityStandard): Self = StObject.set(x, "KeyStorageSecurityStandard", value.asInstanceOf[js.Any])
    
    inline def setKeyStorageSecurityStandardUndefined: Self = StObject.set(x, "KeyStorageSecurityStandard", js.undefined)
    
    inline def setLastStateChangeAt(value: js.Date): Self = StObject.set(x, "LastStateChangeAt", value.asInstanceOf[js.Any])
    
    inline def setLastStateChangeAtUndefined: Self = StObject.set(x, "LastStateChangeAt", js.undefined)
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    inline def setOwnerAccount(value: AccountId): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    inline def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    inline def setRestorableUntil(value: js.Date): Self = StObject.set(x, "RestorableUntil", value.asInstanceOf[js.Any])
    
    inline def setRestorableUntilUndefined: Self = StObject.set(x, "RestorableUntil", js.undefined)
    
    inline def setRevocationConfiguration(value: RevocationConfiguration): Self = StObject.set(x, "RevocationConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRevocationConfigurationUndefined: Self = StObject.set(x, "RevocationConfiguration", js.undefined)
    
    inline def setSerial(value: String): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "Serial", js.undefined)
    
    inline def setStatus(value: CertificateAuthorityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: CertificateAuthorityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
