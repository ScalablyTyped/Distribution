package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "crypto")
@js.native
object cryptoNs extends js.Object {
  @js.native
  class ECDH ()
    extends nodeLib.cryptoMod.ECDH
  
  val Certificate: nodeLib.Anon_Certificate = js.native
  /** @deprecated since v10.0.0 */
  val DEFAULT_ENCODING: java.lang.String = js.native
  /** @deprecated since v10.0.0 */
  val fips: scala.Boolean = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: java.lang.String): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.Buffer): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: java.lang.String, password: stdLib.DataView): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: java.lang.String,
    password: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: java.lang.String): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.Buffer): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: stdLib.DataView): nodeLib.cryptoMod.CipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createCipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: java.lang.String): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.Buffer): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: java.lang.String, iv: stdLib.DataView): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: java.lang.String): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.Buffer): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: stdLib.DataView): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: java.lang.String): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: java.lang.String): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.Buffer): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: stdLib.DataView): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Cipher = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.CipherCCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: java.lang.String, iv: java.lang.String): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: java.lang.String, iv: nodeLib.Buffer): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: java.lang.String, iv: stdLib.DataView): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: java.lang.String): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: java.lang.String): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: stdLib.DataView): nodeLib.cryptoMod.CipherGCM = js.native
  def createCipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.CipherGCM = js.native
  def createCredentials(details: nodeLib.cryptoMod.CredentialDetails): nodeLib.cryptoMod.Credentials = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: java.lang.String): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.Buffer): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: java.lang.String, password: stdLib.DataView): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: java.lang.String,
    password: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    password: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: java.lang.String): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.Buffer): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(algorithm: nodeLib.cryptoMod.CipherGCMTypes, password: stdLib.DataView): nodeLib.cryptoMod.DecipherGCM = js.native
  /** @deprecated since v10.0.0 use createCipheriv() */
  def createDecipher(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    password: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: java.lang.String): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.Buffer): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: java.lang.String, iv: stdLib.DataView): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: java.lang.String): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.Buffer): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.Buffer, iv: stdLib.DataView): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: java.lang.String): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: java.lang.String): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.Buffer): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(algorithm: java.lang.String, key: stdLib.DataView, iv: stdLib.DataView): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Decipher = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherCCMTypes,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherCCMOptions
  ): nodeLib.cryptoMod.DecipherCCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: java.lang.String, iv: java.lang.String): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: java.lang.String, iv: nodeLib.Buffer): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: java.lang.String, iv: stdLib.DataView): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: java.lang.String,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: java.lang.String): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.Buffer): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.Buffer, iv: stdLib.DataView): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.Buffer,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: nodeLib.Buffer): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: nodeLib.NodeJSNs.TypedArray, iv: stdLib.DataView): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: nodeLib.NodeJSNs.TypedArray,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: java.lang.String): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: java.lang.String,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.Buffer): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.Buffer,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(algorithm: nodeLib.cryptoMod.CipherGCMTypes, key: stdLib.DataView, iv: stdLib.DataView): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDecipheriv(
    algorithm: nodeLib.cryptoMod.CipherGCMTypes,
    key: stdLib.DataView,
    iv: stdLib.DataView,
    options: nodeLib.cryptoMod.CipherGCMOptions
  ): nodeLib.cryptoMod.DecipherGCM = js.native
  def createDiffieHellman(prime_length: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.Buffer): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: scala.Double): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime_length: scala.Double, generator: stdLib.DataView): nodeLib.cryptoMod.DiffieHellman = js.native
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
    generator: nodeLib.Buffer
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: nodeLib.NodeJSNs.TypedArray
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: scala.Double
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(
    prime: java.lang.String,
    prime_encoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
    generator: stdLib.DataView
  ): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.Buffer): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.DiffieHellman = js.native
  def createDiffieHellman(prime: stdLib.DataView): nodeLib.cryptoMod.DiffieHellman = js.native
  def createECDH(curve_name: java.lang.String): nodeLib.cryptoMod.ECDH = js.native
  def createHash(algorithm: java.lang.String): nodeLib.cryptoMod.Hash = js.native
  def createHash(algorithm: java.lang.String, options: nodeLib.streamMod.internalNs.TransformOptions): nodeLib.cryptoMod.Hash = js.native
  def createHmac(algorithm: java.lang.String, key: java.lang.String): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: java.lang.String,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.Buffer): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.Buffer,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: nodeLib.NodeJSNs.TypedArray): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: nodeLib.NodeJSNs.TypedArray,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(algorithm: java.lang.String, key: stdLib.DataView): nodeLib.cryptoMod.Hmac = js.native
  def createHmac(
    algorithm: java.lang.String,
    key: stdLib.DataView,
    options: nodeLib.streamMod.internalNs.TransformOptions
  ): nodeLib.cryptoMod.Hmac = js.native
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
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: java.lang.String,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, _]
  ): scala.Unit = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: java.lang.String,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: java.lang.String,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def pbkdf2Sync(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    iterations: scala.Double,
    keylen: scala.Double,
    digest: java.lang.String
  ): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateDecrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def privateEncrypt(private_key: nodeLib.cryptoMod.RsaPrivateKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def pseudoRandomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def pseudoRandomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicDecrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: java.lang.String, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: nodeLib.NodeJSNs.TypedArray): nodeLib.Buffer = js.native
  def publicEncrypt(public_key: nodeLib.cryptoMod.RsaPublicKey, buffer: stdLib.DataView): nodeLib.Buffer = js.native
  def randomBytes(size: scala.Double): nodeLib.Buffer = js.native
  def randomBytes(
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T, callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](
    buffer: T,
    offset: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]
  ): scala.Unit = js.native
  def randomFill[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](
    buffer: T,
    offset: scala.Double,
    size: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* buf */ T, scala.Unit]
  ): scala.Unit = js.native
  def randomFillSync[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T): T = js.native
  def randomFillSync[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T, offset: scala.Double): T = js.native
  def randomFillSync[T /* <: nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView */](buffer: T, offset: scala.Double, size: scala.Double): T = js.native
  def scrypt(
    password: java.lang.String,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: java.lang.String,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: java.lang.String,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    keylen: scala.Double,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scrypt(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions,
    callback: js.Function2[/* err */ nodeLib.Error | scala.Null, /* derivedKey */ nodeLib.Buffer, scala.Unit]
  ): scala.Unit = js.native
  def scryptSync(password: java.lang.String, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: java.lang.String,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: java.lang.String,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: java.lang.String,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: java.lang.String, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: java.lang.String,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.Buffer,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.Buffer,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.Buffer,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.Buffer, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.Buffer,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: nodeLib.NodeJSNs.TypedArray, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: nodeLib.NodeJSNs.TypedArray,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: java.lang.String, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: stdLib.DataView,
    salt: java.lang.String,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: nodeLib.Buffer, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: stdLib.DataView,
    salt: nodeLib.Buffer,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: nodeLib.NodeJSNs.TypedArray, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: stdLib.DataView,
    salt: nodeLib.NodeJSNs.TypedArray,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def scryptSync(password: stdLib.DataView, salt: stdLib.DataView, keylen: scala.Double): nodeLib.Buffer = js.native
  def scryptSync(
    password: stdLib.DataView,
    salt: stdLib.DataView,
    keylen: scala.Double,
    options: nodeLib.cryptoMod.ScryptOptions
  ): nodeLib.Buffer = js.native
  def timingSafeEqual(a: nodeLib.Buffer, b: nodeLib.Buffer): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.Buffer, b: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.Buffer, b: stdLib.DataView): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.NodeJSNs.TypedArray, b: nodeLib.Buffer): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.NodeJSNs.TypedArray, b: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def timingSafeEqual(a: nodeLib.NodeJSNs.TypedArray, b: stdLib.DataView): scala.Boolean = js.native
  def timingSafeEqual(a: stdLib.DataView, b: nodeLib.Buffer): scala.Boolean = js.native
  def timingSafeEqual(a: stdLib.DataView, b: nodeLib.NodeJSNs.TypedArray): scala.Boolean = js.native
  def timingSafeEqual(a: stdLib.DataView, b: stdLib.DataView): scala.Boolean = js.native
  @js.native
  object ECDH extends js.Object {
    def convertKey(
      key: java.lang.String | nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1 | adoneLib.adoneLibStrings.hex | adoneLib.adoneLibStrings.base64,
      format: adoneLib.adoneLibStrings.uncompressed | adoneLib.adoneLibStrings.compressed | adoneLib.adoneLibStrings.hybrid
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(key: java.lang.String, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: java.lang.String,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(key: nodeLib.Buffer, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.Buffer,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(key: nodeLib.NodeJSNs.TypedArray, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: nodeLib.NodeJSNs.TypedArray,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
    ): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(key: stdLib.DataView, curve: java.lang.String): nodeLib.Buffer | java.lang.String = js.native
    def convertKey(
      key: stdLib.DataView,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_base64(
      key: java.lang.String,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_base64(
      key: nodeLib.Buffer,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_base64(
      key: nodeLib.NodeJSNs.TypedArray,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_base64(
      key: stdLib.DataView,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.base64
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_hex(
      key: java.lang.String,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_hex(
      key: nodeLib.Buffer,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_hex(
      key: nodeLib.NodeJSNs.TypedArray,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_hex(
      key: stdLib.DataView,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.hex
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_latin1(
      key: java.lang.String,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_latin1(
      key: nodeLib.Buffer,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_latin1(
      key: nodeLib.NodeJSNs.TypedArray,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1
    ): nodeLib.Buffer | java.lang.String = js.native
    @JSName("convertKey")
    def convertKey_latin1(
      key: stdLib.DataView,
      curve: java.lang.String,
      inputEncoding: nodeLib.cryptoMod.HexBase64Latin1Encoding,
      outputEncoding: adoneLib.adoneLibStrings.latin1
    ): nodeLib.Buffer | java.lang.String = js.native
  }
  
  @JSName("generateKeyPair")
  @js.native
  object generateKeyPairNs extends js.Object {
    def `__promisify__`(
      `type`: adoneLib.adoneLibStrings.dsa,
      options: nodeLib.cryptoMod.DSAKeyPairOptions[
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
        ]
    ): js.Promise[nodeLib.Anon_PublicKey] = js.native
    def `__promisify__`(
      `type`: adoneLib.adoneLibStrings.ec,
      options: nodeLib.cryptoMod.ECKeyPairOptions[
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
        ]
    ): js.Promise[nodeLib.Anon_PublicKey] = js.native
    def `__promisify__`(
      `type`: adoneLib.adoneLibStrings.rsa,
      options: nodeLib.cryptoMod.RSAKeyPairOptions[
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem, 
          adoneLib.adoneLibStrings.der | adoneLib.adoneLibStrings.pem
        ]
    ): js.Promise[nodeLib.Anon_PublicKey] = js.native
  }
  
}

