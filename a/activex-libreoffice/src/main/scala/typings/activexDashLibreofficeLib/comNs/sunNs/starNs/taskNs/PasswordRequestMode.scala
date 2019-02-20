package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PasswordRequestMode extends js.Object

/**
  * the mode in which a password should be asked
  * @see PasswordRequest
  */
@JSGlobal("com.sun.star.task.PasswordRequestMode")
@js.native
object PasswordRequestMode extends js.Object {
  /**
    * Password creation. <P>
    *
    * The password is asked for the first time,
    *
    * so it should be entered twice.
    *
    * </P>
    */
  @js.native
  sealed trait PASSWORD_CREATE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordRequestMode
  
  /**
    * Ask for a password. <P>
    *
    * Just ask for a password.
    *
    * </P>
    */
  @js.native
  sealed trait PASSWORD_ENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordRequestMode
  
  /**
    * Wrong password was entered, ask again. <P>
    *
    * A wrong password was entered, notify user
    *
    * and ask again.
    *
    * </P>
    */
  @js.native
  sealed trait PASSWORD_REENTER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordRequestMode
  
  /* 0 */ val PASSWORD_CREATE: PASSWORD_CREATE with scala.Double = js.native
  /* 1 */ val PASSWORD_ENTER: PASSWORD_ENTER with scala.Double = js.native
  /* 2 */ val PASSWORD_REENTER: PASSWORD_REENTER with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.PasswordRequestMode with scala.Double
  ] = js.native
}

