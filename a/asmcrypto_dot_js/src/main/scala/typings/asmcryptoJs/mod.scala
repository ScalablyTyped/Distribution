package typings.asmcryptoJs

import typings.asmcryptoJs.anon.BitLength
import typings.asmcryptoJs.anon.Gcd
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("asmcrypto.js", "AES_CBC")
  @js.native
  class AES_CBC protected ()
    extends typings.asmcryptoJs.cbcMod.AES_CBC {
    def this(key: Uint8Array) = this()
    def this(key: Uint8Array, iv: Uint8Array) = this()
    def this(key: Uint8Array, iv: js.UndefOr[scala.Nothing], padding: Boolean) = this()
    def this(key: Uint8Array, iv: Uint8Array, padding: Boolean) = this()
  }
  /* static members */
  object AES_CBC {
    
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: js.UndefOr[scala.Nothing], iv: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: js.UndefOr[scala.Nothing], iv: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CBC.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean, iv: Uint8Array): Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CCM")
  @js.native
  class AES_CCM protected ()
    extends typings.asmcryptoJs.ccmMod.AES_CCM {
    def this(
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagSize: Double,
      dataLength: Double
    ) = this()
    def this(
      key: Uint8Array,
      nonce: Uint8Array,
      adata: Uint8Array,
      tagSize: js.UndefOr[scala.Nothing],
      dataLength: Double
    ) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double, dataLength: Double) = this()
  }
  /* static members */
  object AES_CCM {
    
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(
      cipher: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.decrypt")
    @js.native
    def decrypt(cipher: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(
      clear: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CCM.encrypt")
    @js.native
    def encrypt(clear: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
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
    
    @JSImport("asmcrypto.js", "AES_CFB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CFB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CFB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_CFB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CMAC")
  @js.native
  class AES_CMAC protected ()
    extends typings.asmcryptoJs.cmacMod.AES_CMAC {
    def this(key: Uint8Array) = this()
  }
  /* static members */
  object AES_CMAC {
    
    @JSImport("asmcrypto.js", "AES_CMAC.bytes")
    @js.native
    def bytes(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_CTR")
  @js.native
  class AES_CTR protected ()
    extends typings.asmcryptoJs.ctrMod.AES_CTR {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
  }
  /* static members */
  object AES_CTR {
    
    @JSImport("asmcrypto.js", "AES_CTR.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_CTR.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
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
    
    @JSImport("asmcrypto.js", "AES_ECB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_ECB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_ECB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_ECB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, padding: Boolean): Uint8Array = js.native
  }
  
  @JSImport("asmcrypto.js", "AES_GCM")
  @js.native
  class AES_GCM protected ()
    extends typings.asmcryptoJs.gcmMod.AES_GCM {
    def this(key: Uint8Array, nonce: Uint8Array) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: js.UndefOr[scala.Nothing], tagSize: Double) = this()
    def this(key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagSize: Double) = this()
  }
  /* static members */
  object AES_GCM {
    
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(
      ciphertext: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.decrypt")
    @js.native
    def decrypt(ciphertext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(
      cleartext: Uint8Array,
      key: Uint8Array,
      nonce: Uint8Array,
      adata: js.UndefOr[scala.Nothing],
      tagsize: Double
    ): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_GCM.encrypt")
    @js.native
    def encrypt(cleartext: Uint8Array, key: Uint8Array, nonce: Uint8Array, adata: Uint8Array, tagsize: Double): Uint8Array = js.native
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
    
    @JSImport("asmcrypto.js", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_OFB.decrypt")
    @js.native
    def decrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
    
    @JSImport("asmcrypto.js", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array): Uint8Array = js.native
    @JSImport("asmcrypto.js", "AES_OFB.encrypt")
    @js.native
    def encrypt(data: Uint8Array, key: Uint8Array, iv: Uint8Array): Uint8Array = js.native
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
    @scala.inline
    def ONE_=(x: typings.asmcryptoJs.bignumMod.BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ONE")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.ZERO")
    @js.native
    def ZERO: typings.asmcryptoJs.bignumMod.BigNumber = js.native
    @scala.inline
    def ZERO_=(x: typings.asmcryptoJs.bignumMod.BigNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.extGCD")
    @js.native
    def extGCD: js.Function2[/* a */ this.type, /* b */ this.type, Gcd] = js.native
    @JSImport("asmcrypto.js", "BigNumber.extGCD")
    @js.native
    def extGCD(a: this.type, b: this.type): Gcd = js.native
    @scala.inline
    def extGCD_=(x: js.Function2[/* a */ this.type, /* b */ this.type, Gcd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extGCD")(x.asInstanceOf[js.Any])
    
    @JSImport("asmcrypto.js", "BigNumber.fromArrayBuffer")
    @js.native
    def fromArrayBuffer(buffer: ArrayBuffer): typings.asmcryptoJs.bignumMod.BigNumber = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.fromConfig")
    @js.native
    def fromConfig(obj: BitLength): typings.asmcryptoJs.bignumMod.BigNumber = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.fromNumber")
    @js.native
    def fromNumber(num: Double): typings.asmcryptoJs.bignumMod.BigNumber = js.native
    
    @JSImport("asmcrypto.js", "BigNumber.fromString")
    @js.native
    def fromString(str: String): typings.asmcryptoJs.bignumMod.BigNumber = js.native
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
    
    @JSImport("asmcrypto.js", "Modulus._Montgomery_reduce")
    @js.native
    def _Montgomery_reduce(a: typings.asmcryptoJs.bignumMod.BigNumber, n: typings.asmcryptoJs.bignumMod.Modulus): typings.asmcryptoJs.bignumMod.BigNumber = js.native
  }
  
  @JSImport("asmcrypto.js", "Pbkdf2HmacSha1")
  @js.native
  def Pbkdf2HmacSha1(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "Pbkdf2HmacSha256")
  @js.native
  def Pbkdf2HmacSha256(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "Pbkdf2HmacSha512")
  @js.native
  def Pbkdf2HmacSha512(password: Uint8Array, salt: Uint8Array, count: Double, length: Double): Uint8Array = js.native
  
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
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
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
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
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
    @scala.inline
    def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("asmcrypto.js", "base64_to_bytes")
  @js.native
  def base64ToBytes(str: String): Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "bytes_to_base64")
  @js.native
  def bytesToBase64(arr: Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js", "bytes_to_hex")
  @js.native
  def bytesToHex(arr: Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js", "bytes_to_string")
  @js.native
  def bytesToString(bytes: Uint8Array): String = js.native
  @JSImport("asmcrypto.js", "bytes_to_string")
  @js.native
  def bytesToString(bytes: Uint8Array, utf8: Boolean): String = js.native
  
  @JSImport("asmcrypto.js", "hex_to_bytes")
  @js.native
  def hexToBytes(str: String): Uint8Array = js.native
  
  @JSImport("asmcrypto.js", "string_to_bytes")
  @js.native
  def stringToBytes(str: String): Uint8Array = js.native
  @JSImport("asmcrypto.js", "string_to_bytes")
  @js.native
  def stringToBytes(str: String, utf8: Boolean): Uint8Array = js.native
}
