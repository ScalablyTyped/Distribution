package typings.awsCryptoIe11Detection

import typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.HMAC
import typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSAES-PKCS1-v1_5`
import typings.awsCryptoIe11Detection.buildCryptoOperationMod.CryptoOperation
import typings.awsCryptoIe11Detection.buildKeyMod.Key
import typings.awsCryptoIe11Detection.buildKeyOperationMod.KeyOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMsSubtleCryptoMod {
  
  type EncryptionOrVerificationAlgorithm = `RSAES-PKCS1-v1_5`
  
  trait HashAlgorithm extends StObject {
    
    var name: Ie11DigestAlgorithm
  }
  object HashAlgorithm {
    
    inline def apply(name: Ie11DigestAlgorithm): HashAlgorithm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashAlgorithm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HashAlgorithm] (val x: Self) extends AnyVal {
      
      inline def setName(value: Ie11DigestAlgorithm): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait HmacAlgorithm extends StObject {
    
    var hash: HashAlgorithm
    
    var name: HMAC
  }
  object HmacAlgorithm {
    
    inline def apply(hash: HashAlgorithm): HmacAlgorithm = {
      val __obj = js.Dynamic.literal(hash = hash.asInstanceOf[js.Any], name = "HMAC")
      __obj.asInstanceOf[HmacAlgorithm]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HmacAlgorithm] (val x: Self) extends AnyVal {
      
      inline def setHash(value: HashAlgorithm): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setName(value: HMAC): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1`
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256`
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384`
  */
  trait Ie11DigestAlgorithm extends StObject
  object Ie11DigestAlgorithm {
    
    inline def `SHA-1`: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1` = "SHA-1".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-1`]
    
    inline def `SHA-256`: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256` = "SHA-256".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-256`]
    
    inline def `SHA-384`: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384` = "SHA-384".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`SHA-384`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-CBC`
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`AES-GCM`
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.`RSA-OAEP`
    - typings.awsCryptoIe11Detection.buildMsSubtleCryptoMod.EncryptionOrVerificationAlgorithm
  */
  type Ie11EncryptionAlgorithm = _Ie11EncryptionAlgorithm | EncryptionOrVerificationAlgorithm
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey
    - typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey
  */
  trait KeyUsage extends StObject
  object KeyUsage {
    
    inline def decrypt: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt = "decrypt".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.decrypt]
    
    inline def derive: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive = "derive".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.derive]
    
    inline def encrypt: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt = "encrypt".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.encrypt]
    
    inline def importKey: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey = "importKey".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.importKey]
    
    inline def sign: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign = "sign".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.sign]
    
    inline def unwrapKey: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey = "unwrapKey".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.unwrapKey]
    
    inline def verify: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify = "verify".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.verify]
    
    inline def wrapKey: typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey = "wrapKey".asInstanceOf[typings.awsCryptoIe11Detection.awsCryptoIe11DetectionStrings.wrapKey]
  }
  
  @js.native
  trait MsSubtleCrypto extends StObject {
    
    def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
    def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def digest(algorithm: Ie11DigestAlgorithm): CryptoOperation = js.native
    def digest(algorithm: Ie11DigestAlgorithm, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
    def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def exportKey(format: String, key: Key): KeyOperation = js.native
    
    def generateKey(algorithm: Ie11EncryptionAlgorithm): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Unit, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Boolean): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    def generateKey(algorithm: SigningAlgorithm, extractable: Unit, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
    
    def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: Any): KeyOperation = js.native
    def importKey(format: String, keyData: js.typedarray.ArrayBufferView, algorithm: Any, extractable: Boolean): KeyOperation = js.native
    def importKey(
      format: String,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: Any,
      extractable: Boolean,
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    def importKey(
      format: String,
      keyData: js.typedarray.ArrayBufferView,
      algorithm: Any,
      extractable: Unit,
      keyUsages: js.Array[KeyUsage]
    ): KeyOperation = js.native
    
    def sign(algorithm: SigningAlgorithm, key: Key): CryptoOperation = js.native
    def sign(algorithm: SigningAlgorithm, key: Key, buffer: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    
    def verify(algorithm: EncryptionOrVerificationAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    def verify(
      algorithm: EncryptionOrVerificationAlgorithm,
      key: Key,
      signature: js.typedarray.ArrayBufferView,
      buffer: js.typedarray.ArrayBufferView
    ): CryptoOperation = js.native
    def verify(algorithm: SigningAlgorithm, key: Key, signature: js.typedarray.ArrayBufferView): CryptoOperation = js.native
    def verify(
      algorithm: SigningAlgorithm,
      key: Key,
      signature: js.typedarray.ArrayBufferView,
      buffer: js.typedarray.ArrayBufferView
    ): CryptoOperation = js.native
  }
  
  type SigningAlgorithm = HmacAlgorithm
  
  trait _Ie11EncryptionAlgorithm extends StObject
}
