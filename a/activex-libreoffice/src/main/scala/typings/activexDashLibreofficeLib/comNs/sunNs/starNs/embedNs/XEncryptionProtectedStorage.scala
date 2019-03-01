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

object XEncryptionProtectedStorage {
  @scala.inline
  def apply(
    EncryptionAlgorithms: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    acquire: js.Function0[scala.Unit],
    getEncryptionAlgorithms: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
    ],
    hasEncryptionData: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEncryption: js.Function0[scala.Unit],
    setEncryptionAlgorithms: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    setEncryptionData: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    setEncryptionPassword: js.Function1[java.lang.String, scala.Unit]
  ): XEncryptionProtectedStorage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EncryptionAlgorithms")(EncryptionAlgorithms)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getEncryptionAlgorithms")(getEncryptionAlgorithms)
    __obj.updateDynamic("hasEncryptionData")(hasEncryptionData)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEncryption")(removeEncryption)
    __obj.updateDynamic("setEncryptionAlgorithms")(setEncryptionAlgorithms)
    __obj.updateDynamic("setEncryptionData")(setEncryptionData)
    __obj.updateDynamic("setEncryptionPassword")(setEncryptionPassword)
    __obj.asInstanceOf[XEncryptionProtectedStorage]
  }
}

