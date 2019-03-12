package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to change the master password, or let it be requested and checked. */
trait XMasterPasswordHandling2 extends XMasterPasswordHandling {
  /** allows to detect whether the default master password is used */
  def isDefaultMasterPasswordUsed(): scala.Boolean
  /**
    * allows to let the default password be used
    *
    * Please use this method with care. Using of default master password let the passwords be stored non-encrypted. If a master password is predefined in
    * the algorithm it is no more an encryption, it is just an encoding.
    */
  def useDefaultMasterPassword(xHandler: XInteractionHandler): scala.Boolean
}

object XMasterPasswordHandling2 {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    allowPersistentStoring: scala.Boolean => scala.Boolean,
    authorizateWithMasterPassword: XInteractionHandler => scala.Boolean,
    changeMasterPassword: XInteractionHandler => scala.Boolean,
    hasMasterPassword: () => scala.Boolean,
    isDefaultMasterPasswordUsed: () => scala.Boolean,
    isPersistentStoringAllowed: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeMasterPassword: () => scala.Unit,
    useDefaultMasterPassword: XInteractionHandler => scala.Boolean
  ): XMasterPasswordHandling2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), hasMasterPassword = js.Any.fromFunction0(hasMasterPassword), isDefaultMasterPasswordUsed = js.Any.fromFunction0(isDefaultMasterPasswordUsed), isPersistentStoringAllowed = js.Any.fromFunction0(isPersistentStoringAllowed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMasterPassword = js.Any.fromFunction0(removeMasterPassword), useDefaultMasterPassword = js.Any.fromFunction1(useDefaultMasterPassword))
  
    __obj.asInstanceOf[XMasterPasswordHandling2]
  }
}

