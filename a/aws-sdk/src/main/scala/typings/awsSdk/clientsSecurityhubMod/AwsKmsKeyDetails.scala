package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsKmsKeyDetails extends StObject {
  
  /**
    * The twelve-digit account ID of the Amazon Web Services account that owns the KMS key.
    */
  var AWSAccountId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Indicates when the KMS key was created. Uses the date-time format specified in RFC 3339 section 5.6, Internet Date/Time Format. The value cannot contain spaces. For example, 2020-03-22T13:22:13.933Z.
    */
  var CreationDate: js.UndefOr[Double] = js.undefined
  
  /**
    * A description of the KMS key.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The globally unique identifier for the KMS key.
    */
  var KeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The manager of the KMS key. KMS keys in your Amazon Web Services account are either customer managed or Amazon Web Services managed.
    */
  var KeyManager: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether the key has key rotation enabled.
    */
  var KeyRotationStatus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The state of the KMS key. Valid values are as follows:    Disabled     Enabled     PendingDeletion     PendingImport     Unavailable   
    */
  var KeyState: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The source of the KMS key material. When this value is AWS_KMS, KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the KMS key lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsKmsKeyDetails {
  
  inline def apply(): AwsKmsKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsKmsKeyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsKmsKeyDetails] (val x: Self) extends AnyVal {
    
    inline def setAWSAccountId(value: NonEmptyString): Self = StObject.set(x, "AWSAccountId", value.asInstanceOf[js.Any])
    
    inline def setAWSAccountIdUndefined: Self = StObject.set(x, "AWSAccountId", js.undefined)
    
    inline def setCreationDate(value: Double): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setKeyId(value: NonEmptyString): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setKeyManager(value: NonEmptyString): Self = StObject.set(x, "KeyManager", value.asInstanceOf[js.Any])
    
    inline def setKeyManagerUndefined: Self = StObject.set(x, "KeyManager", js.undefined)
    
    inline def setKeyRotationStatus(value: Boolean): Self = StObject.set(x, "KeyRotationStatus", value.asInstanceOf[js.Any])
    
    inline def setKeyRotationStatusUndefined: Self = StObject.set(x, "KeyRotationStatus", js.undefined)
    
    inline def setKeyState(value: NonEmptyString): Self = StObject.set(x, "KeyState", value.asInstanceOf[js.Any])
    
    inline def setKeyStateUndefined: Self = StObject.set(x, "KeyState", js.undefined)
    
    inline def setOrigin(value: NonEmptyString): Self = StObject.set(x, "Origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "Origin", js.undefined)
  }
}
