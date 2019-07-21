package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofcrypto extends js.Object {
  var CertificateCls: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.CertificateCls] = js.native
  @JSName("Certificate")
  val Certificate_Original: Anon_Certificate = js.native
  var Cipher: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.Cipher] = js.native
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  var Decipher: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.Decipher] = js.native
  var DiffieHellman: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.DiffieHellman] = js.native
  var ECDH: TypeofClassECDH = js.native
  var Hash: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.Hash] = js.native
  var Hmac: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.Hmac] = js.native
  var KeyObject: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.KeyObject] = js.native
  var Signer: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.Signer] = js.native
  var Verify: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.cryptoNs.Verify] = js.native
  val constantsNs: TypeofconstantsALPNENABLED = js.native
  /** @deprecated since v10.0.0 */
  val fips: scala.Boolean = js.native
  val generateKeyPairNs: TypeofgenerateKeyPair = js.native
  def Certificate(): nodeLib.cryptoMod.Certificate = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Cipher = js.native
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
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
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.CipherKey): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.CipherKey, iv: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.CipherKey,
    iv: scala.Null,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.cryptoMod.CipherKey): nodeLib.cryptoMod.CipherGCM = js.native
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
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.CipherKey,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
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
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike, iv: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: scala.Null,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: scala.Null,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.DecipherGCM = js.native
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
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.cryptoMod.BinaryLike,
    iv: scala.Null,
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
  def createHash(algorithm: java.lang.String, options: nodeLib.streamMod.TransformOptions): nodeLib.cryptoMod.Hash = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.cryptoMod.BinaryLike): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.cryptoMod.BinaryLike,
    options: nodeLib.streamMod.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
  def createPrivateKey(key: java.lang.String): nodeLib.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createPrivateKey(key: nodeLib.cryptoMod.PrivateKeyInput): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: java.lang.String): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.cryptoMod.KeyObject): nodeLib.cryptoMod.KeyObject = js.native
  def createPublicKey(key: nodeLib.cryptoMod.PublicKeyInput): nodeLib.cryptoMod.KeyObject = js.native
  def createSecretKey(key: nodeLib.Buffer): nodeLib.cryptoMod.KeyObject = js.native
  def createSign(algorithm: java.lang.String): nodeLib.cryptoMod.Signer = js.native
  def createSign(algorithm: java.lang.String, options: nodeLib.streamMod.WritableOptions): nodeLib.cryptoMod.Signer = js.native
  def createVerify(algorithm: java.lang.String): nodeLib.cryptoMod.Verify = js.native
  def createVerify(algorithm: java.lang.String, options: nodeLib.streamMod.WritableOptions): nodeLib.cryptoMod.Verify = js.native
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
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_dsa(`type`: adoneLib.adoneLibStrings.dsa, options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions): nodeLib.cryptoMod.KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_ec(`type`: adoneLib.adoneLibStrings.ec, options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions): nodeLib.cryptoMod.KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPairSync")
  def generateKeyPairSync_rsa(`type`: adoneLib.adoneLibStrings.rsa, options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions): nodeLib.cryptoMod.KeyPairKeyObjectResult = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_dsa(
    `type`: adoneLib.adoneLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ nodeLib.cryptoMod.KeyObject, 
      /* privateKey */ nodeLib.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_ec(
    `type`: adoneLib.adoneLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ nodeLib.cryptoMod.KeyObject, 
      /* privateKey */ nodeLib.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("generateKeyPair")
  def generateKeyPair_rsa(
    `type`: adoneLib.adoneLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions,
    callback: js.Function3[
      /* err */ nodeLib.Error | scala.Null, 
      /* publicKey */ nodeLib.cryptoMod.KeyObject, 
      /* privateKey */ nodeLib.cryptoMod.KeyObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
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
  def randomFill(
    buffer: stdLib.DataView,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.DataView,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.DataView, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Float64Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Float64Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Int8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Int8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint16Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint16Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint32Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint32Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8Array,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8Array, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFill(
    buffer: stdLib.Uint8ClampedArray,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ stdLib.Uint8ClampedArray, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync(buffer: stdLib.DataView): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.DataView, offset: scala.Double): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.DataView, offset: scala.Double, size: scala.Double): stdLib.DataView = js.native
  def randomFillSync(buffer: stdLib.Float32Array): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float32Array, offset: scala.Double): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float32Array, offset: scala.Double, size: scala.Double): stdLib.Float32Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array, offset: scala.Double): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Float64Array, offset: scala.Double, size: scala.Double): stdLib.Float64Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array, offset: scala.Double): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int16Array, offset: scala.Double, size: scala.Double): stdLib.Int16Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array, offset: scala.Double): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int32Array, offset: scala.Double, size: scala.Double): stdLib.Int32Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array, offset: scala.Double): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Int8Array, offset: scala.Double, size: scala.Double): stdLib.Int8Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array, offset: scala.Double): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint16Array, offset: scala.Double, size: scala.Double): stdLib.Uint16Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array, offset: scala.Double): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint32Array, offset: scala.Double, size: scala.Double): stdLib.Uint32Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8Array, offset: scala.Double, size: scala.Double): stdLib.Uint8Array = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray): stdLib.Uint8ClampedArray = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray, offset: scala.Double): stdLib.Uint8ClampedArray = js.native
  def randomFillSync(buffer: stdLib.Uint8ClampedArray, offset: scala.Double, size: scala.Double): stdLib.Uint8ClampedArray = js.native
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
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike
  ): nodeLib.Buffer = js.native
  def sign(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.SignPrivateKeyInput
  ): nodeLib.Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPrivateKey()`][].
    */
  def sign(algorithm: java.lang.String, data: nodeLib.cryptoMod.Binary, key: nodeLib.cryptoMod.KeyLike): nodeLib.Buffer = js.native
  def sign(
    algorithm: java.lang.String,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.SignPrivateKeyInput
  ): nodeLib.Buffer = js.native
  def sign(algorithm: scala.Null, data: nodeLib.cryptoMod.Binary, key: nodeLib.cryptoMod.KeyLike): nodeLib.Buffer = js.native
  def sign(algorithm: scala.Null, data: nodeLib.cryptoMod.Binary, key: nodeLib.cryptoMod.SignPrivateKeyInput): nodeLib.Buffer = js.native
  def timingSafeEqual(a: nodeLib.cryptoMod.Binary, b: nodeLib.cryptoMod.Binary): scala.Boolean = js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: js.UndefOr[scala.Nothing],
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.VerifyKeyWithOptions,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  /**
    * Calculates and returns the signature for `data` using the given private key and
    * algorithm. If `algorithm` is `null` or `undefined`, then the algorithm is
    * dependent upon the key type (especially Ed25519 and Ed448).
    *
    * If `key` is not a [`KeyObject`][], this function behaves as if `key` had been
    * passed to [`crypto.createPublicKey()`][].
    */
  def verify(
    algorithm: java.lang.String,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: java.lang.String,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.VerifyKeyWithOptions,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: scala.Null,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.KeyLike,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
  def verify(
    algorithm: scala.Null,
    data: nodeLib.cryptoMod.Binary,
    key: nodeLib.cryptoMod.VerifyKeyWithOptions,
    signature: nodeLib.cryptoMod.Binary
  ): nodeLib.Buffer = js.native
}

