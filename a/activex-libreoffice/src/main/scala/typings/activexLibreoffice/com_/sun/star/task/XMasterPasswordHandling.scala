package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to change the master password, or let it be requested and checked. */
@js.native
trait XMasterPasswordHandling extends XInterface {
  
  /**
    * allows to specify whether persistent storing of passwords is allowed
    *
    * After the storing is forbidden the master password and all the stored passwords are removed.
    */
  def allowPersistentStoring(bAllow: Boolean): Boolean = js.native
  
  /**
    * allows to check the user authorization.
    *
    * This call let the master password be requested from user using the provided interaction handler.
    *
    * The call will use the standard interaction handler service {@link InteractionHandler} if no handler is provided.
    */
  def authorizateWithMasterPassword(xHandler: XInteractionHandler): Boolean = js.native
  
  /**
    * allows to change the master password.
    *
    * If there is still no master password, the user will be asked to provide the new one.
    *
    * The call will use the standard interaction handler service {@link InteractionHandler} if no handler is provided.
    */
  def changeMasterPassword(xHandler: XInteractionHandler): Boolean = js.native
  
  /** allows to detect whether there is already a master password */
  def hasMasterPassword(): Boolean = js.native
  
  /** allows to detect whether persistent storing of passwords is allowed */
  def isPersistentStoringAllowed(): Boolean = js.native
  
  /** let the master password and all the related stored passwords be removed. */
  def removeMasterPassword(): Unit = js.native
}
object XMasterPasswordHandling {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    allowPersistentStoring: Boolean => Boolean,
    authorizateWithMasterPassword: XInteractionHandler => Boolean,
    changeMasterPassword: XInteractionHandler => Boolean,
    hasMasterPassword: () => Boolean,
    isPersistentStoringAllowed: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeMasterPassword: () => Unit
  ): XMasterPasswordHandling = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), allowPersistentStoring = js.Any.fromFunction1(allowPersistentStoring), authorizateWithMasterPassword = js.Any.fromFunction1(authorizateWithMasterPassword), changeMasterPassword = js.Any.fromFunction1(changeMasterPassword), hasMasterPassword = js.Any.fromFunction0(hasMasterPassword), isPersistentStoringAllowed = js.Any.fromFunction0(isPersistentStoringAllowed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeMasterPassword = js.Any.fromFunction0(removeMasterPassword))
    __obj.asInstanceOf[XMasterPasswordHandling]
  }
  
  @scala.inline
  implicit class XMasterPasswordHandlingMutableBuilder[Self <: XMasterPasswordHandling] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowPersistentStoring(value: Boolean => Boolean): Self = StObject.set(x, "allowPersistentStoring", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAuthorizateWithMasterPassword(value: XInteractionHandler => Boolean): Self = StObject.set(x, "authorizateWithMasterPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChangeMasterPassword(value: XInteractionHandler => Boolean): Self = StObject.set(x, "changeMasterPassword", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHasMasterPassword(value: () => Boolean): Self = StObject.set(x, "hasMasterPassword", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPersistentStoringAllowed(value: () => Boolean): Self = StObject.set(x, "isPersistentStoringAllowed", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveMasterPassword(value: () => Unit): Self = StObject.set(x, "removeMasterPassword", js.Any.fromFunction0(value))
  }
}
