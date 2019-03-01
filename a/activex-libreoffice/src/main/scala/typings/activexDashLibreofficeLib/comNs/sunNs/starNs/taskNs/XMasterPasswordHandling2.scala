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
    acquire: js.Function0[scala.Unit],
    allowPersistentStoring: js.Function1[scala.Boolean, scala.Boolean],
    authorizateWithMasterPassword: js.Function1[XInteractionHandler, scala.Boolean],
    changeMasterPassword: js.Function1[XInteractionHandler, scala.Boolean],
    hasMasterPassword: js.Function0[scala.Boolean],
    isDefaultMasterPasswordUsed: js.Function0[scala.Boolean],
    isPersistentStoringAllowed: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeMasterPassword: js.Function0[scala.Unit],
    useDefaultMasterPassword: js.Function1[XInteractionHandler, scala.Boolean]
  ): XMasterPasswordHandling2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("allowPersistentStoring")(allowPersistentStoring)
    __obj.updateDynamic("authorizateWithMasterPassword")(authorizateWithMasterPassword)
    __obj.updateDynamic("changeMasterPassword")(changeMasterPassword)
    __obj.updateDynamic("hasMasterPassword")(hasMasterPassword)
    __obj.updateDynamic("isDefaultMasterPasswordUsed")(isDefaultMasterPasswordUsed)
    __obj.updateDynamic("isPersistentStoringAllowed")(isPersistentStoringAllowed)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeMasterPassword")(removeMasterPassword)
    __obj.updateDynamic("useDefaultMasterPassword")(useDefaultMasterPassword)
    __obj.asInstanceOf[XMasterPasswordHandling2]
  }
}

