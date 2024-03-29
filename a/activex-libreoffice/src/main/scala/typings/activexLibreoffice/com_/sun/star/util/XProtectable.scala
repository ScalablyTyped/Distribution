package typings.activexLibreoffice.com_.sun.star.util

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to protect objects from modifications. */
trait XProtectable
  extends StObject
     with XInterface {
  
  /** @returns the current state of protection. */
  def isProtected(): Boolean
  
  /**
    * activates the protection.
    * @param aPassword a string to specify new password.
    */
  def protect(aPassword: String): Unit
  
  /**
    * removes the protection.
    * @param aPassword a string to match with the current password.
    * @throws com::sun::star::lang::IllegalArgumentException if invalid password is specified.
    */
  def unprotect(aPassword: String): Unit
}
object XProtectable {
  
  inline def apply(
    acquire: () => Unit,
    isProtected: () => Boolean,
    protect: String => Unit,
    queryInterface: `type` => Any,
    release: () => Unit,
    unprotect: String => Unit
  ): XProtectable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isProtected = js.Any.fromFunction0(isProtected), protect = js.Any.fromFunction1(protect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unprotect = js.Any.fromFunction1(unprotect))
    __obj.asInstanceOf[XProtectable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XProtectable] (val x: Self) extends AnyVal {
    
    inline def setIsProtected(value: () => Boolean): Self = StObject.set(x, "isProtected", js.Any.fromFunction0(value))
    
    inline def setProtect(value: String => Unit): Self = StObject.set(x, "protect", js.Any.fromFunction1(value))
    
    inline def setUnprotect(value: String => Unit): Self = StObject.set(x, "unprotect", js.Any.fromFunction1(value))
  }
}
