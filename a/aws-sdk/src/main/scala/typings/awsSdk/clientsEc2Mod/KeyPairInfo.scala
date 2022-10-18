package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyPairInfo extends StObject {
  
  /**
    * If you used Amazon EC2 to create the key pair, this is the date and time when the key was created, in ISO 8601 date-time format, in the UTC time zone. If you imported an existing key pair to Amazon EC2, this is the date and time the key was imported, in ISO 8601 date-time format, in the UTC time zone.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If you used CreateKeyPair to create the key pair:   For RSA key pairs, the key fingerprint is the SHA-1 digest of the DER encoded private key.   For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with OpenSSH 6.8.   If you used ImportKeyPair to provide Amazon Web Services the public key:   For RSA key pairs, the key fingerprint is the MD5 public key fingerprint as specified in section 4 of RFC4716.   For ED25519 key pairs, the key fingerprint is the base64-encoded SHA-256 digest, which is the default for OpenSSH, starting with OpenSSH 6.8.  
    */
  var KeyFingerprint: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the key pair.
    */
  var KeyName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the key pair.
    */
  var KeyPairId: js.UndefOr[String] = js.undefined
  
  /**
    * The type of key pair.
    */
  var KeyType: js.UndefOr[typings.awsSdk.clientsEc2Mod.KeyType] = js.undefined
  
  /**
    * The public key material.
    */
  var PublicKey: js.UndefOr[String] = js.undefined
  
  /**
    * Any tags applied to the key pair.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object KeyPairInfo {
  
  inline def apply(): KeyPairInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KeyPairInfo]
  }
  
  extension [Self <: KeyPairInfo](x: Self) {
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setKeyFingerprint(value: String): Self = StObject.set(x, "KeyFingerprint", value.asInstanceOf[js.Any])
    
    inline def setKeyFingerprintUndefined: Self = StObject.set(x, "KeyFingerprint", js.undefined)
    
    inline def setKeyName(value: String): Self = StObject.set(x, "KeyName", value.asInstanceOf[js.Any])
    
    inline def setKeyNameUndefined: Self = StObject.set(x, "KeyName", js.undefined)
    
    inline def setKeyPairId(value: String): Self = StObject.set(x, "KeyPairId", value.asInstanceOf[js.Any])
    
    inline def setKeyPairIdUndefined: Self = StObject.set(x, "KeyPairId", js.undefined)
    
    inline def setKeyType(value: KeyType): Self = StObject.set(x, "KeyType", value.asInstanceOf[js.Any])
    
    inline def setKeyTypeUndefined: Self = StObject.set(x, "KeyType", js.undefined)
    
    inline def setPublicKey(value: String): Self = StObject.set(x, "PublicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "PublicKey", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
