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
    acquire: () => scala.Unit,
    decrypt: (XXMLEncryptionTemplate, XXMLSecurityContext) => XXMLEncryptionTemplate,
    encrypt: (XXMLEncryptionTemplate, XSecurityEnvironment) => XXMLEncryptionTemplate,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XXMLEncryption = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XXMLEncryption]
  }
}

