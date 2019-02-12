package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_A extends js.Object {
  @JSName("Certificate")
  val Certificate_Original: nodeLib.Anon_Certificate = js.native
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  var ECDH: Anon_Base64 = js.native
  /** @deprecated since v10.0.0 */
  val fips: scala.Boolean = js.native
  val generateKeyPairNs: Anon_Der = js.native
  def Certificate(): nodeLib.cryptoMod.Certificate = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Cipher = js.native
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.CipherKey, iv: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike, iv: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDiffieHellman(prime_length: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.cryptoMod.Binary): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: java.lang.String, prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: java.lang.String,
    generator_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: nodeLib.cryptoMod.Binary
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: scala.Double
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.cryptoMod.Binary): nodeLib.cryptoMod.DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): nodeLib.cryptoMod.ECDH = js.native
  def createHash(algorithm: java.lang.String): nodeLib.cryptoMod.Hash = js.native
  def createHash(algorithm: java.lang.String, options: nodeLib.streamMod.internalNs.TransformOptions): nodeLib.cryptoMod.Hash = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
  def createPrivateKey(key: java.lang.String): nodeLib.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: nodeLib.cryptoMod.PrivateKeyInput): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: java.lang.String): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.cryptoMod.PublicKeyInput): nodeLib.cryptoMod.KeyObject = js.native
  def createSecretKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createSign(algorithm: java.lang.String): nodeLib.cryptoMod.Signer = js.native
  def createSign(algorithm: java.lang.String, options: nodeLib.streamMod.internalNs.WritableOptions): nodeLib.cryptoMod.Signer = js.native
  def createVerify(algorith: java.lang.String): nodeLib.cryptoMod.Verify = js.native
  def createVerify(algorith: java.lang.String, options: nodeLib.streamMod.internalNs.WritableOptions): nodeLib.cryptoMod.Verify = js.native
  def generateKeyPair(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPair(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ],
    callback: js.Function3[
      nodeLib.Error | scala.Null, 
      (/* publicKey */ nodeLib.Buffer) | (/* publicKey */ java.lang.String), 
      (/* privateKey */ nodeLib.Buffer) | (/* privateKey */ java.lang.String), 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def generateKeyPairSync(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): nodeLib.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): nodeLib.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def generateKeyPairSync(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
      adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
    ]
  ): nodeLib.cryptoMod.KeyPairSyncResult[java.lang.String, java.lang.String] = js.native
  def getCiphers(): js.Array[java.lang.String] = js.native
  def getCurves(): js.Array[java.lang.String] = js.native
  def getDiffieHellman(group_name: java.lang.String): nodeLib.cryptoMod.DiffieHellman = js.native
  def getHashes(): js.Array[java.lang.String] = js.native
  def pbkdf2(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.KeyLike, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.cryptoMod.Binary): nodeLib.Buffer = js.native
  def randomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.cryptoMod.Binary */](buffer: T, callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.cryptoMod.Binary */](
    buffer: T,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]
  ): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.cryptoMod.Binary */](
    buffer: T,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync[T /* <: nodeLib.cryptoMod.Binary */](buffer: T): T = js.native
  def randomFillSync[T /* <: nodeLib.cryptoMod.Binary */](buffer: T, offset: scala.Double): T = js.native
  def randomFillSync[T /* <: nodeLib.cryptoMod.Binary */](buffer: T, offset: scala.Double, size: scala.Double): T = js.native
  def scrypt(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scryptSync(password: nodeLib.cryptoMod.BinaryLike, salt: nodeLib.cryptoMod.BinaryLike, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.cryptoMod.BinaryLike,
    salt: nodeLib.cryptoMod.BinaryLike,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def timingSafeEqual(a: nodeLib.cryptoMod.Binary, b: nodeLib.cryptoMod.Binary): scala.Boolean = js.native
}

