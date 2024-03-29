package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Extension of {@link XLibraryContainer} to provide password functionality. This interface should be implemented together with {@link
  * XLibraryContainer2}
  */
trait XLibraryContainerPassword
  extends StObject
     with XInterface {
  
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
  def changeLibraryPassword(Name: String, OldPassword: String, NewPassword: String): Unit
  
  /**
    * Returns true if the accessed library item is protected by a password.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    */
  def isLibraryPasswordProtected(Name: String): Boolean
  
  /**
    * Returns true if the accessed library item is protected by a password (see isLibraryPasswordProtected) and the password was already verified with
    * verifyLibraryPassword or if an initial password was set with changeLibraryPassword.
    *
    * If a library with the this name doesn't exist a {@link com.sun.star.container.NoSuchElementException} is thrown.
    *
    * If the library exists but isn't password protected a {@link com.sun.star.lang.IllegalArgumentException} is thrown.
    */
  def isLibraryPasswordVerified(Name: String): Boolean
  
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
  def verifyLibraryPassword(Name: String, Password: String): Boolean
}
object XLibraryContainerPassword {
  
  inline def apply(
    acquire: () => Unit,
    changeLibraryPassword: (String, String, String) => Unit,
    isLibraryPasswordProtected: String => Boolean,
    isLibraryPasswordVerified: String => Boolean,
    queryInterface: `type` => Any,
    release: () => Unit,
    verifyLibraryPassword: (String, String) => Boolean
  ): XLibraryContainerPassword = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), changeLibraryPassword = js.Any.fromFunction3(changeLibraryPassword), isLibraryPasswordProtected = js.Any.fromFunction1(isLibraryPasswordProtected), isLibraryPasswordVerified = js.Any.fromFunction1(isLibraryPasswordVerified), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), verifyLibraryPassword = js.Any.fromFunction2(verifyLibraryPassword))
    __obj.asInstanceOf[XLibraryContainerPassword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XLibraryContainerPassword] (val x: Self) extends AnyVal {
    
    inline def setChangeLibraryPassword(value: (String, String, String) => Unit): Self = StObject.set(x, "changeLibraryPassword", js.Any.fromFunction3(value))
    
    inline def setIsLibraryPasswordProtected(value: String => Boolean): Self = StObject.set(x, "isLibraryPasswordProtected", js.Any.fromFunction1(value))
    
    inline def setIsLibraryPasswordVerified(value: String => Boolean): Self = StObject.set(x, "isLibraryPasswordVerified", js.Any.fromFunction1(value))
    
    inline def setVerifyLibraryPassword(value: (String, String) => Boolean): Self = StObject.set(x, "verifyLibraryPassword", js.Any.fromFunction2(value))
  }
}
