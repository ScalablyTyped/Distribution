package typings.adone.adoneNs.cryptoNs.secp256k1Ns

import typings.adone.adoneNs.cryptoNs.secp256k1Ns.INs.SignOptions
import typings.adone.adoneNs.cryptoNs.secp256k1Ns.INs.SignResult
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.secp256k1")
@js.native
object ^ extends js.Object {
  /**
    * Computes an EC Diffie-Hellman secret and applied sha256 to compressed public key
    */
  def ecdh(publicKey: Buffer, privateKey: Buffer): Buffer = js.native
  /**
    * Computes an EC Diffie-Hellman secret and return public key as result
    */
  def ecdhUnsafe(publicKey: Buffer, privateKey: Buffer): Buffer = js.native
  def ecdhUnsafe(publicKey: Buffer, privateKey: Buffer, compressed: Boolean): Buffer = js.native
  /**
    * Exports a privateKey in DER format
    */
  def privateKeyExport(privateKey: Buffer): Buffer = js.native
  def privateKeyExport(privateKey: Buffer, compressed: Boolean): Buffer = js.native
  /**
    * Imports a privateKey in DER format
    */
  def privateKeyImport(privateKey: Buffer): Buffer = js.native
  /**
    * Computes the inverse of a privateKey (modulo the order of the curve's base point)
    */
  def privateKeyModInverse(privateKey: Buffer): Buffer = js.native
  /**
    * Negates a privateKey by subtracting it from the order of the curve's base point
    */
  def privateKeyNegate(privateKey: Buffer): Buffer = js.native
  /**
    * Tweaks a privateKey by adding tweak to it
    */
  def privateKeyTweakAdd(privateKey: Buffer, tweak: Buffer): Buffer = js.native
  /**
    * Tweaks a privateKey by multiplying it by a tweak
    */
  def privateKeyTweakMul(privateKey: Buffer, tweak: Buffer): Buffer = js.native
  /**
    * Verifies an ECDSA privateKey
    */
  def privateKeyVerify(privateKey: Buffer): Boolean = js.native
  /**
    * Adds a given publicKeys together
    */
  def publicKeyCombine(publicKeys: js.Array[Buffer]): Buffer = js.native
  def publicKeyCombine(publicKeys: js.Array[Buffer], compressed: Boolean): Buffer = js.native
  /**
    * Converts a publicKey to compressed or uncompressed form
    */
  def publicKeyConvert(publicKey: Buffer): Buffer = js.native
  def publicKeyConvert(publicKey: Buffer, compressed: Boolean): Buffer = js.native
  /**
    * Computes the public key for a privateKey
    */
  def publicKeyCreate(privateKey: Buffer): Buffer = js.native
  def publicKeyCreate(privateKey: Buffer, compressed: Boolean): Buffer = js.native
  /**
    * Tweaks a publicKey by adding tweak times the generator to it
    */
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def publicKeyTweakAdd(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
  /**
    * Tweaks a publicKey by multiplying it by a tweak value
    */
  def publicKeyTweakMul(publicKey: Buffer, tweak: Buffer): Buffer = js.native
  def publicKeyTweakMul(publicKey: Buffer, tweak: Buffer, compressed: Boolean): Buffer = js.native
  /**
    * Verifies an ECDSA publicKey
    */
  def publicKeyVerify(publicKey: Buffer): Boolean = js.native
  /**
    * Recovers an ECDSA public key from a signature
    */
  def recover(message: Buffer, signature: Buffer, recovery: Double): Buffer = js.native
  def recover(message: Buffer, signature: Buffer, recovery: Double, compressed: Boolean): Buffer = js.native
  /**
    * Creates an ECDSA signature. Always return low-S signature.
    */
  def sign(message: Buffer, privateKey: Buffer): SignResult = js.native
  def sign(message: Buffer, privateKey: Buffer, options: SignOptions): SignResult = js.native
  /**
    * Serializes an ECDSA signature in DER format
    */
  def signatureExport(signature: Buffer): Buffer = js.native
  /**
    * Parse a DER ECDSA signature (follow by BIP66)
    */
  def signatureImport(signature: Buffer): Buffer = js.native
  /**
    * Same as signatureImport but not follow by BIP66
    */
  def signatureImportLax(signature: Buffer): Buffer = js.native
  /**
    * Converts a signature to a normalized lower-S form
    */
  def signatureNormalize(signature: Buffer): Buffer = js.native
  /**
    * Verifies an ECDSA signature
    *
    * Note: return false for high signatures!
    */
  def verify(message: Buffer, signature: Buffer, publicKey: Buffer): Boolean = js.native
}

