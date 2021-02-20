package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to protect objects from modifications. */
@js.native
trait XProtectable extends XInterface {
  
  /** @returns the current state of protection. */
  def isProtected(): Boolean = js.native
  
  /**
    * activates the protection.
    * @param aPassword a string to specify new password.
    */
  def protect(aPassword: String): Unit = js.native
  
  /**
    * removes the protection.
    * @param aPassword a string to match with the current password.
    * @throws com::sun::star::lang::IllegalArgumentException if invalid password is specified.
    */
  def unprotect(aPassword: String): Unit = js.native
}
object XProtectable {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    isProtected: () => Boolean,
    protect: String => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    unprotect: String => Unit
  ): XProtectable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isProtected = js.Any.fromFunction0(isProtected), protect = js.Any.fromFunction1(protect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unprotect = js.Any.fromFunction1(unprotect))
    __obj.asInstanceOf[XProtectable]
  }
  
  @scala.inline
  implicit class XProtectableMutableBuilder[Self <: XProtectable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsProtected(value: () => Boolean): Self = StObject.set(x, "isProtected", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProtect(value: String => Unit): Self = StObject.set(x, "protect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setUnprotect(value: String => Unit): Self = StObject.set(x, "unprotect", js.Any.fromFunction1(value))
  }
}
