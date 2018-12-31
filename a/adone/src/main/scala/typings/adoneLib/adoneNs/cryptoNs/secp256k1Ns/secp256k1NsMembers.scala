package typings
package adoneLib.adoneNs.cryptoNs.secp256k1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.secp256k1")
@js.native
object secp256k1NsMembers extends js.Object {
  /**
    * Computes an EC Diffie-Hellman secret and applied sha256 to compressed public key
    */
  def ecdh(publicKey: nodeLib.Buffer, privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Computes an EC Diffie-Hellman secret and return public key as result
    */
  def ecdhUnsafe(publicKey: nodeLib.Buffer, privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def ecdhUnsafe(publicKey: nodeLib.Buffer, privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Exports a privateKey in DER format
    */
  def privateKeyExport(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def privateKeyExport(privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Imports a privateKey in DER format
    */
  def privateKeyImport(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Computes the inverse of a privateKey (modulo the order of the curve's base point)
    */
  def privateKeyModInverse(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Negates a privateKey by subtracting it from the order of the curve's base point
    */
  def privateKeyNegate(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Tweaks a privateKey by adding tweak to it
    */
  def privateKeyTweakAdd(privateKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Tweaks a privateKey by multiplying it by a tweak
    */
  def privateKeyTweakMul(privateKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Verifies an ECDSA privateKey
    */
  def privateKeyVerify(privateKey: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * Adds a given publicKeys together
    */
  def publicKeyCombine(publicKeys: js.Array[nodeLib.Buffer]): nodeLib.Buffer = js.native
  def publicKeyCombine(publicKeys: js.Array[nodeLib.Buffer], compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Converts a publicKey to compressed or uncompressed form
    */
  def publicKeyConvert(publicKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyConvert(publicKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Computes the public key for a privateKey
    */
  def publicKeyCreate(privateKey: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyCreate(privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Tweaks a publicKey by adding tweak times the generator to it
    */
  def publicKeyTweakAdd(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyTweakAdd(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Tweaks a publicKey by multiplying it by a tweak value
    */
  def publicKeyTweakMul(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer): nodeLib.Buffer = js.native
  def publicKeyTweakMul(publicKey: nodeLib.Buffer, tweak: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
  /**
    * Verifies an ECDSA publicKey
    */
  def publicKeyVerify(publicKey: nodeLib.Buffer): scala.Boolean = js.native
  /**
    * Recovers an ECDSA public key from a signature
    */
  def recover(message: nodeLib.Buffer, signature: nodeLib.Buffer, recovery: scala.Double): nodeLib.Buffer = js.native
  def recover(
    message: nodeLib.Buffer,
    signature: nodeLib.Buffer,
    recovery: scala.Double,
    compressed: scala.Boolean
  ): nodeLib.Buffer = js.native
  /**
    * Creates an ECDSA signature. Always return low-S signature.
    */
  def sign(message: nodeLib.Buffer, privateKey: nodeLib.Buffer): adoneLib.adoneNs.cryptoNs.secp256k1Ns.INs.SignResult = js.native
  def sign(
    message: nodeLib.Buffer,
    privateKey: nodeLib.Buffer,
    options: adoneLib.adoneNs.cryptoNs.secp256k1Ns.INs.SignOptions
  ): adoneLib.adoneNs.cryptoNs.secp256k1Ns.INs.SignResult = js.native
  /**
    * Serializes an ECDSA signature in DER format
    */
  def signatureExport(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Parse a DER ECDSA signature (follow by BIP66)
    */
  def signatureImport(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Same as signatureImport but not follow by BIP66
    */
  def signatureImportLax(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Converts a signature to a normalized lower-S form
    */
  def signatureNormalize(signature: nodeLib.Buffer): nodeLib.Buffer = js.native
  /**
    * Verifies an ECDSA signature
    *
    * Note: return false for high signatures!
    */
  def verify(message: nodeLib.Buffer, signature: nodeLib.Buffer, publicKey: nodeLib.Buffer): scala.Boolean = js.native
}

