package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.embedNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface allows to set a password for an object. */
trait XEncryptionProtectedSource
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * removes encryption from the object.
    * @throws com::sun::star::io::IOException in case encryption could not be removed
    */
  def removeEncryption(): scala.Unit
  /**
    * sets a password for the object.
    * @param sPassword the new password
    * @throws com::sun::star::io::IOException in case password could not be set
    */
  def setEncryptionPassword(sPassword: java.lang.String): scala.Unit
}

object XEncryptionProtectedSource {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEncryption: js.Function0[scala.Unit],
    setEncryptionPassword: js.Function1[java.lang.String, scala.Unit]
  ): XEncryptionProtectedSource = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryInterface = queryInterface, release = release, removeEncryption = removeEncryption, setEncryptionPassword = setEncryptionPassword)
  
    __obj.asInstanceOf[XEncryptionProtectedSource]
  }
}

