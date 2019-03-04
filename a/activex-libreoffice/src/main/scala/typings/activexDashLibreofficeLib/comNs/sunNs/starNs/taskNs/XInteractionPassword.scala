package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

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
  var Password: java.lang.String
  /**
    * Get result password from the continuation.
    * @returns the stored password.
    */
  def getPassword(): java.lang.String
  /**
    * Store result password to the continuation.
    * @param aPasswd the result password.
    */
  def setPassword(aPasswd: java.lang.String): scala.Unit
}

object XInteractionPassword {
  @scala.inline
  def apply(
    Password: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getPassword: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    select: js.Function0[scala.Unit],
    setPassword: js.Function1[java.lang.String, scala.Unit]
  ): XInteractionPassword = {
    val __obj = js.Dynamic.literal(Password = Password, acquire = acquire, getPassword = getPassword, queryInterface = queryInterface, release = release, select = select, setPassword = setPassword)
  
    __obj.asInstanceOf[XInteractionPassword]
  }
}

