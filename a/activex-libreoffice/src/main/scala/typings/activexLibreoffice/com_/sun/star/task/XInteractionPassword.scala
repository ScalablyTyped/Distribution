package typings.activexLibreoffice.com_.sun.star.task

import typings.activexLibreoffice.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A continuation to get a password from interaction helper.
  * @since OOo 1.1.2
  */
trait XInteractionPassword
  extends StObject
     with XInteractionContinuation {
  
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  var Password: String
  
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  def getPassword(): String
  
  /**
    * Store result password to the continuation.
    * @param aPasswd the result password.
    */
  def setPassword(aPasswd: String): Unit
}
object XInteractionPassword {
  
  inline def apply(
    Password: String,
    acquire: () => Unit,
    getPassword: () => String,
    queryInterface: `type` => Any,
    release: () => Unit,
    select: () => Unit,
    setPassword: String => Unit
  ): XInteractionPassword = {
    val __obj = js.Dynamic.literal(Password = Password.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setPassword = js.Any.fromFunction1(setPassword))
    __obj.asInstanceOf[XInteractionPassword]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XInteractionPassword] (val x: Self) extends AnyVal {
    
    inline def setGetPassword(value: () => String): Self = StObject.set(x, "getPassword", js.Any.fromFunction0(value))
    
    inline def setPassword(value: String): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setSetPassword(value: String => Unit): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
  }
}
