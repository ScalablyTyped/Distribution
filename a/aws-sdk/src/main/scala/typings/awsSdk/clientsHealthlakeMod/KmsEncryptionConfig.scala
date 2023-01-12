package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KmsEncryptionConfig extends StObject {
  
  /**
    *  The type of customer-managed-key(CMK) used for encyrption. The two types of supported CMKs are customer owned CMKs and AWS owned CMKs. 
    */
  var CmkType: typings.awsSdk.clientsHealthlakeMod.CmkType
  
  /**
    *  The KMS encryption key id/alias used to encrypt the Data Store contents at rest. 
    */
  var KmsKeyId: js.UndefOr[EncryptionKeyID] = js.undefined
}
object KmsEncryptionConfig {
  
  inline def apply(CmkType: CmkType): KmsEncryptionConfig = {
    val __obj = js.Dynamic.literal(CmkType = CmkType.asInstanceOf[js.Any])
    __obj.asInstanceOf[KmsEncryptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KmsEncryptionConfig] (val x: Self) extends AnyVal {
    
    inline def setCmkType(value: CmkType): Self = StObject.set(x, "CmkType", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyId(value: EncryptionKeyID): Self = StObject.set(x, "KmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyIdUndefined: Self = StObject.set(x, "KmsKeyId", js.undefined)
  }
}
