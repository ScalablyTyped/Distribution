package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
trait XEncryptionProtectedStorage extends XEncryptionProtectedSource2 {
  /** allows to get the encryption algorithms of the object. */
  var EncryptionAlgorithms: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /** allows to get the encryption algorithms of the object. */
  def getEncryptionAlgorithms(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
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
  def setEncryptionAlgorithms(
    aAlgorithms: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
}

