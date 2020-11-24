package typings.activexLibreoffice.com_.sun.star.xml.crypto

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XXMLEncryption extends XInterface {
  
  /** Perform decryption in the environment of encryption template and context. */
  def decrypt(aTemplate: XXMLEncryptionTemplate, aContext: XXMLSecurityContext): XXMLEncryptionTemplate = js.native
  
  /** Perform encryption in the environment of encryption template and context. */
  def encrypt(aTemplate: XXMLEncryptionTemplate, aEnvironment: XSecurityEnvironment): XXMLEncryptionTemplate = js.native
}
object XXMLEncryption {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    decrypt: (XXMLEncryptionTemplate, XXMLSecurityContext) => XXMLEncryptionTemplate,
    encrypt: (XXMLEncryptionTemplate, XSecurityEnvironment) => XXMLEncryptionTemplate,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XXMLEncryption = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), decrypt = js.Any.fromFunction2(decrypt), encrypt = js.Any.fromFunction2(encrypt), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XXMLEncryption]
  }
  
  @scala.inline
  implicit class XXMLEncryptionOps[Self <: XXMLEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecrypt(value: (XXMLEncryptionTemplate, XXMLSecurityContext) => XXMLEncryptionTemplate): Self = this.set("decrypt", js.Any.fromFunction2(value))
    
    @scala.inline
    def setEncrypt(value: (XXMLEncryptionTemplate, XSecurityEnvironment) => XXMLEncryptionTemplate): Self = this.set("encrypt", js.Any.fromFunction2(value))
  }
}
