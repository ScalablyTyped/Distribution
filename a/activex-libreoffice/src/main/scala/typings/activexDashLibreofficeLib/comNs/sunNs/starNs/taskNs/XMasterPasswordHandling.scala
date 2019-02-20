package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to change the master password, or let it be requested and checked. */
trait XMasterPasswordHandling
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * allows to specify whether persistent storing of passwords is allowed
    *
    * After the storing is forbidden the master password and all the stored passwords are removed.
    */
  def allowPersistentStoring(bAllow: scala.Boolean): scala.Boolean
  /**
    * allows to check the user authorization.
    *
    * This call let the master password be requested from user using the provided interaction handler.
    *
    * The call will use the standard interaction handler service {@link InteractionHandler} if no handler is provided.
    */
  def authorizateWithMasterPassword(xHandler: XInteractionHandler): scala.Boolean
  /**
    * allows to change the master password.
    *
    * If there is still no master password, the user will be asked to provide the new one.
    *
    * The call will use the standard interaction handler service {@link InteractionHandler} if no handler is provided.
    */
  def changeMasterPassword(xHandler: XInteractionHandler): scala.Boolean
  /** allows to detect whether there is already a master password */
  def hasMasterPassword(): scala.Boolean
  /** allows to detect whether persistent storing of passwords is allowed */
  def isPersistentStoringAllowed(): scala.Boolean
  /** let the master password and all the related stored passwords be removed. */
  def removeMasterPassword(): scala.Unit
}

