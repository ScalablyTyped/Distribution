package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsXrayEncryptionConfigDetails extends StObject {
  
  /**
    * The identifier of the KMS key that is used for encryption. Provided if Type is KMS.
    */
  var KeyId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The current status of the encryption configuration. Valid values are ACTIVE or UPDATING. When Status is equal to UPDATING, X-Ray might use both the old and new encryption.
    */
  var Status: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The type of encryption. KMS indicates that the encryption uses KMS keys. NONE indicates the default encryption.
    */
  var Type: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsXrayEncryptionConfigDetails {
  
  inline def apply(): AwsXrayEncryptionConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsXrayEncryptionConfigDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsXrayEncryptionConfigDetails] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: NonEmptyString): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setKeyIdUndefined: Self = StObject.set(x, "KeyId", js.undefined)
    
    inline def setStatus(value: NonEmptyString): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: NonEmptyString): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
