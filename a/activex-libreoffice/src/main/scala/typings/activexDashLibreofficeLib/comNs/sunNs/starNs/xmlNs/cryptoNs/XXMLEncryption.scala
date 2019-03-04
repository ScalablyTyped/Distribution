package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface of XML encryption
  *
  * This interface represents a XML encryptor or decryptor.
  *
  * The encryptor or decryptor concrete a key by retrieve security context and encryption template.
  *
  * In some cases, the encryptor or decryptor can determine and locate the EncryptedKey from the encryption template by dereference the RetrievalMethod
  * inside EncryptedData.
  *
  * In some cases, the EncryptedKey need to be clearly pointed out by the encryption template.
  */
trait XXMLEncryption
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Perform decryption in the environment of encryption template and context. */
  def decrypt(aTemplate: XXMLEncryptionTemplate, aContext: XXMLSecurityContext): XXMLEncryptionTemplate
  /** Perform encryption in the environment of encryption template and context. */
  def encrypt(aTemplate: XXMLEncryptionTemplate, aEnvironment: XSecurityEnvironment): XXMLEncryptionTemplate
}

object XXMLEncryption {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    decrypt: js.Function2[XXMLEncryptionTemplate, XXMLSecurityContext, XXMLEncryptionTemplate],
    encrypt: js.Function2[XXMLEncryptionTemplate, XSecurityEnvironment, XXMLEncryptionTemplate],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XXMLEncryption = {
    val __obj = js.Dynamic.literal(acquire = acquire, decrypt = decrypt, encrypt = encrypt, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XXMLEncryption]
  }
}

