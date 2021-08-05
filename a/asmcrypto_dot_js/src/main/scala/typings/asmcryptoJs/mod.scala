package typings.asmcryptoJs

import typings.asmcryptoJs.anon.BitLength
import typings.asmcryptoJs.anon.Gcd
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asmcrypto.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("asmcrypto.js", "AES_CBC")
  @js.native
  class AES_CBC protected ()
    extends typings.asmcryptoJs.cbcMod.AES_CBC {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
    def this(key: Uint8Array, iv: Unit, padding: Boolean) = this()
    def this(key: Uint8Array, iv: Uint8Array, padding: Boolean) = this()
  }
  /* static members */
  object AES_CBC {
    
    @JSImport("asmcrypto.js", "AES_CBC")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, padding: Unit, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, padding: Unit, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_CCM")
  @js.native
  class AES_CCM protected ()
    extends typings.asmcryptoJs.ccmMod.AES_CCM {
    def this(key: Uint8Array, nonce: Uint8Array, adata: Unit, tagSize: Double, dataLength: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Unit, tagSize: Unit, dataLength: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double, dataLength: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Unit, dataLength: Double) = this()
  }
  /* static members */
  object AES_CCM {
    
    @JSImport("asmcrypto.js", "AES_CCM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Unit, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(cipher.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Unit, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(clear.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_CFB")
  @js.native
  class AES_CFB protected ()
    extends typings.asmcryptoJs.cfbMod.AES_CFB {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
  }
  /* static members */
  object AES_CFB {
    
    @JSImport("asmcrypto.js", "AES_CFB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_CMAC")
  @js.native
  class AES_CMAC protected ()
    extends typings.asmcryptoJs.cmacMod.AES_CMAC {
    def this(key: Uint8Array) = this()
  }
  /* static members */
  object AES_CMAC {
    
    @JSImport("asmcrypto.js", "AES_CMAC")
    @js.native
    val ^ : js.Any = js.native
    
    inline def bytes(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("bytes")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_CTR")
  @js.native
  class AES_CTR protected ()
    extends typings.asmcryptoJs.ctrMod.AES_CTR {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
  }
  /* static members */
  object AES_CTR {
    
    @JSImport("asmcrypto.js", "AES_CTR")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_ECB")
  @js.native
  class AES_ECB protected ()
    extends typings.asmcryptoJs.ecbMod.AES_ECB {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, padding: Boolean) = this()
  }
  /* static members */
  object AES_ECB {
    
    @JSImport("asmcrypto.js", "AES_ECB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_GCM")
  @js.native
  class AES_GCM protected ()
    extends typings.asmcryptoJs.gcmMod.AES_GCM {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Unit, tagSize: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double) = this()
  }
  /* static members */
  object AES_GCM {
    
    @JSImport("asmcrypto.js", "AES_GCM")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Unit, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(ciphertext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cleartext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Unit, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cleartext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cleartext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(cleartext.asInstanceOf[js.Any], key.asInstanceOf[js.Any], nonce.asInstanceOf[js.Any], adata.asInstanceOf[js.Any], tagsize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "AES_OFB")
  @js.native
  class AES_OFB protected ()
    extends typings.asmcryptoJs.ofbMod.AES_OFB {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
  }
  /* static members */
  object AES_OFB {
    
    @JSImport("asmcrypto.js", "AES_OFB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("decrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    
    inline def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
    inline def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("encrypt")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any], iv.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  }
  
  @JSImport("asmcrypto.js", "BigNumber")
  @js.native
  class BigNumber ()
    extends typings.asmcryptoJs.bignumMod.BigNumber {
    def this(num: Uint8Array) = this()
  }
  /* static members */
  object BigNumber {
    
    @JSImport("asmcrypto.js", "BigNumber")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.ONE")
    @js.native
    def ONE: typings.asmcryptoJs.bignumMod.BigNumber = js.native
    inline def ONE_=(x: typings.asmcryptoJs.bignumMod.BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.ZERO")
    @js.native
    def ZERO: typings.asmcryptoJs.bignumMod.BigNumber = js.native
    inline def ZERO_=(x: typings.asmcryptoJs.bignumMod.BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.extGCD")
    @js.native
    def extGCD: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
    inline def extGCD(a: this.type, b: this.type): Gcd = (^.asInstanceOf[js.Dynamic].applyDynamic("extGCD")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Gcd]
    inline def extGCD_=(x: js.Function2[/* a */ this.type, /* b */ this.type, Gcd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extGCD")(x.asInstanceOf[js.Any])
    
    inline def fromArrayBuffer(buffer: ArrayBuffer): typings.asmcryptoJs.bignumMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.asmcryptoJs.bignumMod.BigNumber]
    
    inline def fromConfig(obj: BitLength): typings.asmcryptoJs.bignumMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromConfig")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.asmcryptoJs.bignumMod.BigNumber]
    
    inline def fromNumber(num: Double): typings.asmcryptoJs.bignumMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNumber")(num.asInstanceOf[js.Any]).asInstanceOf[typings.asmcryptoJs.bignumMod.BigNumber]
    
    inline def fromString(str: String): typings.asmcryptoJs.bignumMod.BigNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[typings.asmcryptoJs.bignumMod.BigNumber]
  }
  
  @JSImport("asmcrypto.js", "HmacSha1")
  @js.native
  class HmacSha1 protected ()
    extends typings.asmcryptoJs.hmacSha1Mod.HmacSha1 {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "HmacSha256")
  @js.native
  class HmacSha256 protected ()
    extends typings.asmcryptoJs.hmacSha256Mod.HmacSha256 {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "HmacSha512")
  @js.native
  class HmacSha512 protected ()
    extends typings.asmcryptoJs.hmacSha512Mod.HmacSha512 {
    def this(password: Uint8Array) = this()
    def this(password: Uint8Array, verify: Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "IllegalArgumentError")
  @js.native
  class IllegalArgumentError protected ()
    extends typings.asmcryptoJs.errorsMod.IllegalArgumentError {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("asmcrypto.js", "IllegalStateError")
  @js.native
  class IllegalStateError protected ()
    extends typings.asmcryptoJs.errorsMod.IllegalStateError {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("asmcrypto.js", "Modulus")
  @js.native
  class Modulus protected ()
    extends typings.asmcryptoJs.bignumMod.Modulus {
    def this(number: typings.asmcryptoJs.bignumMod.BigNumber) = this()
  }
  /* static members */
  object Modulus {
    
    @JSImport("asmcrypto.js", "Modulus")
    @js.native
    val ^ : js.Any = js.native
    
    inline def _Montgomery_reduce(a: typings.asmcryptoJs.bignumMod.BigNumber, n: typings.asmcryptoJs.bignumMod.Modulus): typings.asmcryptoJs.bignumMod.BigNumber = (^.asInstanceOf[js.Dynamic].applyDynamic("_Montgomery_reduce")(a.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[typings.asmcryptoJs.bignumMod.BigNumber]
  }
  
  inline def Pbkdf2HmacSha1(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Pbkdf2HmacSha1")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], count.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def Pbkdf2HmacSha256(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Pbkdf2HmacSha256")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], count.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  inline def Pbkdf2HmacSha512(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("Pbkdf2HmacSha512")(password.asInstanceOf[js.Any], salt.asInstanceOf[js.Any], count.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @JSImport("asmcrypto.js", "RSA")
  @js.native
  class RSA protected ()
    extends typings.asmcryptoJs.rsaMod.RSA {
    def this(key: js.Array[Uint8Array]) = this()
  }
  
  @JSImport("asmcrypto.js", "RSA_PKCS1_v1_5")
  @js.native
  class RSAPKCS1V15 protected ()
    extends typings.asmcryptoJs.pkcs1Mod.RSAPKCS1V15 {
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512) = this()
  }
  
  @JSImport("asmcrypto.js", "RSA_OAEP")
  @js.native
  class RSA_OAEP protected ()
    extends typings.asmcryptoJs.pkcs1Mod.RSA_OAEP {
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1, label: Uint8Array) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256, label: Uint8Array) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512, label: Uint8Array) = this()
  }
  
  @JSImport("asmcrypto.js", "RSA_PSS")
  @js.native
  class RSA_PSS protected ()
    extends typings.asmcryptoJs.pkcs1Mod.RSA_PSS {
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha1Mod.Sha1, saltLength: Double) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha256Mod.Sha256, saltLength: Double) = this()
    def this(key: js.Array[Uint8Array], hash: typings.asmcryptoJs.sha512Mod.Sha512, saltLength: Double) = this()
  }
  
  @JSImport("asmcrypto.js", "SecurityError")
  @js.native
  class SecurityError protected ()
    extends typings.asmcryptoJs.errorsMod.SecurityError {
    def this(args: js.Any*) = this()
  }
  
  @JSImport("asmcrypto.js", "Sha1")
  @js.native
  class Sha1 ()
    extends typings.asmcryptoJs.sha1Mod.Sha1
  /* static members */
  object Sha1 {
    
    @JSImport("asmcrypto.js", "Sha1")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "Sha1.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js", "Sha256")
  @js.native
  class Sha256 ()
    extends typings.asmcryptoJs.sha256Mod.Sha256
  /* static members */
  object Sha256 {
    
    @JSImport("asmcrypto.js", "Sha256")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "Sha256.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js", "Sha512")
  @js.native
  class Sha512 ()
    extends typings.asmcryptoJs.sha512Mod.Sha512
  /* static members */
  object Sha512 {
    
    @JSImport("asmcrypto.js", "Sha512")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("asmcrypto.js", "Sha512.NAME")
    @js.native
    def NAME: String = js.native
    inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  inline def base64ToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def bytesToBase64(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_base64")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToHex(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_hex")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToString(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_string")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def bytesToString(bytes: Uint8Array, utf8: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_string")(bytes.asInstanceOf[js.Any], utf8.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def stringToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("string_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def stringToBytes(str: String, utf8: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("string_to_bytes")(str.asInstanceOf[js.Any], utf8.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
