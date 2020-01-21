package typings.awsCryptoIe11Detection.msSubtleCryptoMod

import typings.awsCryptoIe11Detection.cryptoOperationMod.CryptoOperation
import typings.awsCryptoIe11Detection.keyMod.Key
import typings.awsCryptoIe11Detection.keyOperationMod.KeyOperation
import typings.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MsSubtleCrypto extends js.Object {
  def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
  def decrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: ArrayBufferView): CryptoOperation = js.native
  def digest(algorithm: Ie11DigestAlgorithm): CryptoOperation = js.native
  def digest(algorithm: Ie11DigestAlgorithm, buffer: ArrayBufferView): CryptoOperation = js.native
  def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key): CryptoOperation = js.native
  def encrypt(algorithm: Ie11EncryptionAlgorithm, key: Key, buffer: ArrayBufferView): CryptoOperation = js.native
  def exportKey(format: String, key: Key): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean): KeyOperation = js.native
  def generateKey(algorithm: Ie11EncryptionAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: Boolean): KeyOperation = js.native
  def generateKey(algorithm: SigningAlgorithm, extractable: Boolean, keyUsages: js.Array[KeyUsage]): KeyOperation = js.native
  def importKey(format: String, keyData: ArrayBufferView, algorithm: js.Any): KeyOperation = js.native
  def importKey(format: String, keyData: ArrayBufferView, algorithm: js.Any, extractable: Boolean): KeyOperation = js.native
  def importKey(
    format: String,
    keyData: ArrayBufferView,
    algorithm: js.Any,
    extractable: Boolean,
    keyUsages: js.Array[KeyUsage]
  ): KeyOperation = js.native
  def sign(algorithm: SigningAlgorithm, key: Key): CryptoOperation = js.native
  def sign(algorithm: SigningAlgorithm, key: Key, buffer: ArrayBufferView): CryptoOperation = js.native
  def verify(algorithm: EncryptionOrVerificationAlgorithm, key: Key, signature: ArrayBufferView): CryptoOperation = js.native
  def verify(
    algorithm: EncryptionOrVerificationAlgorithm,
    key: Key,
    signature: ArrayBufferView,
    buffer: ArrayBufferView
  ): CryptoOperation = js.native
  def verify(algorithm: SigningAlgorithm, key: Key, signature: ArrayBufferView): CryptoOperation = js.native
  def verify(algorithm: SigningAlgorithm, key: Key, signature: ArrayBufferView, buffer: ArrayBufferView): CryptoOperation = js.native
}

