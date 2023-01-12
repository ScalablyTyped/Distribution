package typings.awsSdk.clientsDlmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EncryptionConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the KMS key to use for EBS encryption. If this parameter is not specified, the default KMS key for the account is used.
    */
  var CmkArn: js.UndefOr[typings.awsSdk.clientsDlmMod.CmkArn] = js.undefined
  
  /**
    * To encrypt a copy of an unencrypted snapshot when encryption by default is not enabled, enable encryption using this parameter. Copies of encrypted snapshots are encrypted, even if this parameter is false or when encryption by default is not enabled.
    */
  var Encrypted: typings.awsSdk.clientsDlmMod.Encrypted
}
object EncryptionConfiguration {
  
  inline def apply(Encrypted: Encrypted): EncryptionConfiguration = {
    val __obj = js.Dynamic.literal(Encrypted = Encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptionConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EncryptionConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCmkArn(value: CmkArn): Self = StObject.set(x, "CmkArn", value.asInstanceOf[js.Any])
    
    inline def setCmkArnUndefined: Self = StObject.set(x, "CmkArn", js.undefined)
    
    inline def setEncrypted(value: Encrypted): Self = StObject.set(x, "Encrypted", value.asInstanceOf[js.Any])
  }
}
