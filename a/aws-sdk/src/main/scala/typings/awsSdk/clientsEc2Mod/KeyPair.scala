package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPair extends StObject {
  
  /**
    *   For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.   For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with OpenSSH 6.8.  
    */
  var KeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * An unencrypted PEM encoded RSA or ED25519 private key.
    */
  var KeyMaterial: js.UndefOr[SensitiveUserData] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object KeyPair {
  
  inline def apply(): KeyPair = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPair]
  }
  
  extension [Self <: KeyPair](x: Self) {
    
    inline def setKeyFingerprint(value: String): Self = StObject.set(x, "KeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setKeyFingerprintUndefined: Self = StObject.set(x, "KeyFingerprint", js.undefined)
    
    inline def setKeyMaterial(value: SensitiveUserData): Self = StObject.set(x, "KeyMaterial", value.asInstanceOf[js.Any])
    
    inline def setKeyMaterialUndefined: Self = StObject.set(x, "KeyMaterial", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setKeyPairId(value: String): Self = StObject.set(x, "KeyPairId", value.asInstanceOf[js.Any])
    
    inline def setKeyPairIdUndefined: Self = StObject.set(x, "KeyPairId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
