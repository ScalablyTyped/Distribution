package typings.asmcryptoJs

import typings.asmcryptoJs.sha1Mod.Sha1
import typings.asmcryptoJs.sha256Mod.Sha256
import typings.asmcryptoJs.sha512Mod.Sha512
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pkcs1Mod {
  
  @JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PKCS1_v1_5")
  @js.native
  class RSAPKCS1V15 protected () extends StObject {
    def this(key: js.Array[Uint8Array], hash: Sha1) = this()
    def this(key: js.Array[Uint8Array], hash: Sha256) = this()
    def this(key: js.Array[Uint8Array], hash: Sha512) = this()
    
    /* private */ val hash: js.Any = js.native
    
    /* private */ val rsa: js.Any = js.native
    
    def sign(data: Uint8Array): Uint8Array = js.native
    
    def verify(signature: Uint8Array, data: Uint8Array): Unit = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_OAEP")
  @js.native
  class RSA_OAEP protected () extends StObject {
    def this(key: js.Array[Uint8Array], hash: Sha1) = this()
    def this(key: js.Array[Uint8Array], hash: Sha256) = this()
    def this(key: js.Array[Uint8Array], hash: Sha512) = this()
    def this(key: js.Array[Uint8Array], hash: Sha1, label: Uint8Array) = this()
    def this(key: js.Array[Uint8Array], hash: Sha256, label: Uint8Array) = this()
    def this(key: js.Array[Uint8Array], hash: Sha512, label: Uint8Array) = this()
    
    def RSA_MGF1_generate(seed: Uint8Array): Uint8Array = js.native
    def RSA_MGF1_generate(seed: Uint8Array, length: Double): Uint8Array = js.native
    
    def decrypt(data: Uint8Array): Uint8Array = js.native
    
    def encrypt(data: Uint8Array): Uint8Array = js.native
    def encrypt(data: Uint8Array, random: Uint8Array): Uint8Array = js.native
    
    /* private */ val hash: js.Any = js.native
    
    /* private */ val label: js.Any = js.native
    
    /* private */ val rsa: js.Any = js.native
  }
  
  @JSImport("asmcrypto.js/dist_es8/rsa/pkcs1", "RSA_PSS")
  @js.native
  class RSA_PSS protected () extends StObject {
    def this(key: js.Array[Uint8Array], hash: Sha1) = this()
    def this(key: js.Array[Uint8Array], hash: Sha256) = this()
    def this(key: js.Array[Uint8Array], hash: Sha512) = this()
    def this(key: js.Array[Uint8Array], hash: Sha1, saltLength: Double) = this()
    def this(key: js.Array[Uint8Array], hash: Sha256, saltLength: Double) = this()
    def this(key: js.Array[Uint8Array], hash: Sha512, saltLength: Double) = this()
    
    def RSA_MGF1_generate(seed: Uint8Array): Uint8Array = js.native
    def RSA_MGF1_generate(seed: Uint8Array, length: Double): Uint8Array = js.native
    
    /* private */ val hash: js.Any = js.native
    
    /* private */ val rsa: js.Any = js.native
    
    /* private */ val saltLength: js.Any = js.native
    
    def sign(data: Uint8Array): Uint8Array = js.native
    def sign(data: Uint8Array, random: Uint8Array): Uint8Array = js.native
    
    def verify(signature: Uint8Array, data: Uint8Array): Unit = js.native
  }
}
