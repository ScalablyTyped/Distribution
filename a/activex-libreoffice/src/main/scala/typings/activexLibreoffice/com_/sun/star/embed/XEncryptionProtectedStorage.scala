package typings.activexLibreoffice.com_.sun.star.embed

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
trait XEncryptionProtectedStorage extends XEncryptionProtectedSource2 {
  /** allows to get the encryption algorithms of the object. */
  var EncryptionAlgorithms: SafeArray[NamedValue]
  /** allows to get the encryption algorithms of the object. */
  def getEncryptionAlgorithms(): SafeArray[NamedValue]
  /**
    * allows to set the encryption algorithms for the object.
    *
    * The algorithms will of course be used only for streams that have been marked to be encrypted. If no stream in the storage is marked to be encrypted,
    * the algorithms-related information may have no effect to the result package.
    *
    * The following values could be part of the provided sequence:
    *
    * **StartKeyGenerationAlgorithm **: specifies the algorithm that was used to generate the EncryptionKey from the original password; in case the contents
    * should be decrypted, the algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the
    * error; it should take values from {@link com.sun.star.xml} :crypto::DigestID.
    *
    * **EncryptionAlgorithm **: specifies the algorithm that should be used to encrypt/decrypt the contents; in case the contents should be decrypted, the
    * algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the error; it should take values
    * from {@link com.sun.star.xml} :crypto::CipherID.
    *
    * **ChecksumAlgorithm **: specifies the algorithm that was used to generate the checksum of the encrypted data; in case the contents should be
    * decrypted, the algorithm might be already known by the object; if a different one is set an exception should be thrown to indicate the error; it
    * should take values from {@link com.sun.star.xml} :crypto::DigestID.
    */
  def setEncryptionAlgorithms(aAlgorithms: SeqEquiv[NamedValue]): Unit
}

object XEncryptionProtectedStorage {
  @scala.inline
  def apply(
    EncryptionAlgorithms: SafeArray[NamedValue],
    acquire: () => Unit,
    getEncryptionAlgorithms: () => SafeArray[NamedValue],
    hasEncryptionData: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionAlgorithms: SeqEquiv[NamedValue] => Unit,
    setEncryptionData: SeqEquiv[NamedValue] => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedStorage = {
    val __obj = js.Dynamic.literal(EncryptionAlgorithms = EncryptionAlgorithms.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEncryptionAlgorithms = js.Any.fromFunction0(getEncryptionAlgorithms), hasEncryptionData = js.Any.fromFunction0(hasEncryptionData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionAlgorithms = js.Any.fromFunction1(setEncryptionAlgorithms), setEncryptionData = js.Any.fromFunction1(setEncryptionData), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
    __obj.asInstanceOf[XEncryptionProtectedStorage]
  }
}

