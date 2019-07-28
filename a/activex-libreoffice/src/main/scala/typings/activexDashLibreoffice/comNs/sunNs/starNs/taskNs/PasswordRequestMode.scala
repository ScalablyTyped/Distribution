package typings.activexDashLibreoffice.comNs.sunNs.starNs.taskNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * the mode in which a password should be asked
  * @see PasswordRequest
  */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
*/
trait PasswordRequestMode extends js.Object

object PasswordRequestMode {
  /**
    * Password creation. <P>
    *
    * The password is asked for the first time,
    *
    * so it should be entered twice.
    *
    * </P>
    */
  @scala.inline
  def PASSWORD_CREATE: `0` = this.cast(0)
  /**
    * Ask for a password. <P>
    *
    * Just ask for a password.
    *
    * </P>
    */
  @scala.inline
  def PASSWORD_ENTER: `1` = this.cast(1)
  /**
    * Wrong password was entered, ask again. <P>
    *
    * A wrong password was entered, notify user
    *
    * and ask again.
    *
    * </P>
    */
  @scala.inline
  def PASSWORD_REENTER: `2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

