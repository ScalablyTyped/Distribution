package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This interface allows to set a password for an object.
  * @since OOo 3.4
  */
trait XEncryptionProtectedSource2 extends XEncryptionProtectedSource {
  /**
    * determine if an encryption data is set for this object.
    * @returns true if some encryption data was set, false otherwise
    */
  def hasEncryptionData(): Boolean
  /**
    * sets an encryption data for the object.
    * @param aEncryptionData the new encryption data
    * @throws com::sun::star::io::IOException in case the data could not be set
    */
  def setEncryptionData(aEncryptionData: SeqEquiv[NamedValue]): Unit
}

object XEncryptionProtectedSource2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    hasEncryptionData: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionData: SeqEquiv[NamedValue] => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedSource2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), hasEncryptionData = js.Any.fromFunction0(hasEncryptionData), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionData = js.Any.fromFunction1(setEncryptionData), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
  
    __obj.asInstanceOf[XEncryptionProtectedSource2]
  }
}

