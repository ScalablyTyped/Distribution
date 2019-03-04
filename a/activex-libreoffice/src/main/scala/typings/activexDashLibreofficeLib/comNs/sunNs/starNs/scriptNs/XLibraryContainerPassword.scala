package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Extension of {@link XLibraryContainer} to provide password functionality. This interface should be implemented together with {@link
  * XLibraryContainer2}
  */
trait XLibraryContainerPassword
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Changes the library's password.
    *
    * If the library wasn't password protected before: The OldPassword parameter has to be an empty string. Afterwards calls to isLibraryPasswordProtected
    * and isLibraryPasswordVerified for this library will return true.
    *
    * If the library already was password protected: The OldPassword parameter has to be set to the previous defined password. If then the NewPassword
    * parameter is an empty string the library password protection will be disabled afterwards (afterwards calls to isLibraryPasswordProtected for this
    * library will return false). If the NewPassword parameter is not an empty string it will accepted as the new password for the library.
    *
    * If a library with the this name doesn't exist but isn't {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists and is password protected and a wrong OldPassword is passed to the method a {@link com.sun.star.lang.IllegalArgumentException}
    * is thrown.
    *
    * If the library exists and isn't password protected and the OldPassword isn't an empty string or the library is read only a {@link
    * com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def changeLibraryPassword(Name: java.lang.String, OldPassword: java.lang.String, NewPassword: java.lang.String): scala.Unit
  /**
    * Returns true if the accessed library item is protected by a password.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def isLibraryPasswordProtected(Name: java.lang.String): scala.Boolean
  /**
    * Returns true if the accessed library item is protected by a password (see isLibraryPasswordProtected) and the password was already verified with
    * verifyLibraryPassword or if an initial password was set with changeLibraryPassword.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists but isn't password protected a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def isLibraryPasswordVerified(Name: java.lang.String): scala.Boolean
  /**
    * Verifies the library's password. If the correct password was passed, the method returns true and further calls to isLibraryPasswordVerified will also
    * return true.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists but isn't password protected a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    *
    * If the library password is already verified a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def verifyLibraryPassword(Name: java.lang.String, Password: java.lang.String): scala.Boolean
}

object XLibraryContainerPassword {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    changeLibraryPassword: js.Function3[java.lang.String, java.lang.String, java.lang.String, scala.Unit],
    isLibraryPasswordProtected: js.Function1[java.lang.String, scala.Boolean],
    isLibraryPasswordVerified: js.Function1[java.lang.String, scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    verifyLibraryPassword: js.Function2[java.lang.String, java.lang.String, scala.Boolean]
  ): XLibraryContainerPassword = {
    val __obj = js.Dynamic.literal(acquire = acquire, changeLibraryPassword = changeLibraryPassword, isLibraryPasswordProtected = isLibraryPasswordProtected, isLibraryPasswordVerified = isLibraryPasswordVerified, queryInterface = queryInterface, release = release, verifyLibraryPassword = verifyLibraryPassword)
  
    __obj.asInstanceOf[XLibraryContainerPassword]
  }
}

