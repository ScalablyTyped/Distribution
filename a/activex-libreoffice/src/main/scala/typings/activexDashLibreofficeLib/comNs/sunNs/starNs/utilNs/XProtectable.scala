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
    acquire: js.Function0[scala.Unit],
    isProtected: js.Function0[scala.Boolean],
    protect: js.Function1[java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    unprotect: js.Function1[java.lang.String, scala.Unit]
  ): XProtectable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("isProtected")(isProtected)
    __obj.updateDynamic("protect")(protect)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("unprotect")(unprotect)
    __obj.asInstanceOf[XProtectable]
  }
}

