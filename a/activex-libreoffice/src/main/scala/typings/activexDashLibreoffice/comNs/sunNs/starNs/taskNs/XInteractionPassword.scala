package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A continuation to get a password from interaction helper.
  * @since OOo 1.1.2
  */
trait XInteractionPassword extends XInteractionContinuation {
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
  @scala.inline
  def apply(
    Password: String,
    acquire: () => Unit,
    getPassword: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setPassword: String => Unit
  ): XInteractionPassword = {
    val __obj = js.Dynamic.literal(Password = Password, acquire = js.Any.fromFunction0(acquire), getPassword = js.Any.fromFunction0(getPassword), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setPassword = js.Any.fromFunction1(setPassword))
  
    __obj.asInstanceOf[XInteractionPassword]
  }
}

