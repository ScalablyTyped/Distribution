package typings.activexDashLibreoffice.comNs.sunNs.starNs.embedNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows to set a password for an object. */
trait XEncryptionProtectedSource extends XInterface {
  /**
    * removes encryption from the object.
    * @throws com::sun::star::io::IOException in case encryption could not be removed
    */
  def removeEncryption(): Unit
  /**
    * sets a password for the object.
    * @param sPassword the new password
    * @throws com::sun::star::io::IOException in case password could not be set
    */
  def setEncryptionPassword(sPassword: String): Unit
}

object XEncryptionProtectedSource {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEncryption: () => Unit,
    setEncryptionPassword: String => Unit
  ): XEncryptionProtectedSource = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEncryption = js.Any.fromFunction0(removeEncryption), setEncryptionPassword = js.Any.fromFunction1(setEncryptionPassword))
  
    __obj.asInstanceOf[XEncryptionProtectedSource]
  }
}

