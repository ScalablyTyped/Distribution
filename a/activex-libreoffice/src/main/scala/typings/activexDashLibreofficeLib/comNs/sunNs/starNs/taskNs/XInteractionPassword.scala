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

