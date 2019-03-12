package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to protect objects from modifications. */
trait XProtectable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** @returns the current state of protection. */
  def isProtected(): scala.Boolean
  /**
    * activates the protection.
    * @param aPassword a string to specify new password.
    */
  def protect(aPassword: java.lang.String): scala.Unit
  /**
    * removes the protection.
    * @param aPassword a string to match with the current password.
    * @throws com::sun::star::lang::IllegalArgumentException if invalid password is specified.
    */
  def unprotect(aPassword: java.lang.String): scala.Unit
}

object XProtectable {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    isProtected: () => scala.Boolean,
    protect: java.lang.String => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    unprotect: java.lang.String => scala.Unit
  ): XProtectable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isProtected = js.Any.fromFunction0(isProtected), protect = js.Any.fromFunction1(protect), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), unprotect = js.Any.fromFunction1(unprotect))
  
    __obj.asInstanceOf[XProtectable]
  }
}

