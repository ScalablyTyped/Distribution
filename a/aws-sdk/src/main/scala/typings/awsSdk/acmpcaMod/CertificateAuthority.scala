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
  var CreatedAt: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Reason the request to create your private CA failed.
    */
  var FailureReason: js.UndefOr[typings.awsSdk.acmpcaMod.FailureReason] = js.undefined
  
  /**
    * Date and time at which your private CA was last updated.
    */
  var LastStateChangeAt: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Date and time after which your private CA certificate is not valid.
    */
  var NotAfter: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Date and time before which your private CA certificate is not valid.
    */
  var NotBefore: js.UndefOr[TStamp] = js.undefined
  
  /**
    * The AWS account ID that owns the certificate authority.
    */
  var OwnerAccount: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The period during which a deleted CA can be restored. For more information, see the PermanentDeletionTimeInDays parameter of the DeleteCertificateAuthorityRequest action. 
    */
  var RestorableUntil: js.UndefOr[TStamp] = js.undefined
  
  /**
    * Information about the certificate revocation list (CRL) created and maintained by your private CA. 
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
  
  @scala.inline
  def apply(): CertificateAuthority = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateAuthority]
  }
  
  @scala.inline
  implicit class CertificateAuthorityMutableBuilder[Self <: CertificateAuthority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setCertificateAuthorityConfiguration(value: CertificateAuthorityConfiguration): Self = StObject.set(x, "CertificateAuthorityConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateAuthorityConfigurationUndefined: Self = StObject.set(x, "CertificateAuthorityConfiguration", js.undefined)
    
    @scala.inline
    def setCreatedAt(value: TStamp): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    @scala.inline
    def setFailureReason(value: FailureReason): Self = StObject.set(x, "FailureReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureReasonUndefined: Self = StObject.set(x, "FailureReason", js.undefined)
    
    @scala.inline
    def setLastStateChangeAt(value: TStamp): Self = StObject.set(x, "LastStateChangeAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStateChangeAtUndefined: Self = StObject.set(x, "LastStateChangeAt", js.undefined)
    
    @scala.inline
    def setNotAfter(value: TStamp): Self = StObject.set(x, "NotAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotAfterUndefined: Self = StObject.set(x, "NotAfter", js.undefined)
    
    @scala.inline
    def setNotBefore(value: TStamp): Self = StObject.set(x, "NotBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotBeforeUndefined: Self = StObject.set(x, "NotBefore", js.undefined)
    
    @scala.inline
    def setOwnerAccount(value: AccountId): Self = StObject.set(x, "OwnerAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnerAccountUndefined: Self = StObject.set(x, "OwnerAccount", js.undefined)
    
    @scala.inline
    def setRestorableUntil(value: TStamp): Self = StObject.set(x, "RestorableUntil", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestorableUntilUndefined: Self = StObject.set(x, "RestorableUntil", js.undefined)
    
    @scala.inline
    def setRevocationConfiguration(value: RevocationConfiguration): Self = StObject.set(x, "RevocationConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevocationConfigurationUndefined: Self = StObject.set(x, "RevocationConfiguration", js.undefined)
    
    @scala.inline
    def setSerial(value: String): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialUndefined: Self = StObject.set(x, "Serial", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateAuthorityStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setType(value: CertificateAuthorityType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
