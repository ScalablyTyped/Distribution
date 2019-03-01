package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back some authentication data.
  *
  * This continuation is typically used in conjunction with {@link AuthenticationRequest} .
  */
trait XInteractionSupplyAuthentication
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  /** Specifies if an "account" value can be handed back. */
  def canSetAccount(): scala.Boolean
  /** Specifies if a "password" value can be handed back. */
  def canSetPassword(): scala.Boolean
  /** Specifies if a new "realm" value can be handed back. */
  def canSetRealm(): scala.Boolean
  /** Specifies if a "user name" value can be handed back. */
  def canSetUserName(): scala.Boolean
  /**
    * Specifies the available modes of how long to remember the account.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberAccountModes(Default: js.Array[RememberAuthentication]): activexDashInteropLib.SafeArray[RememberAuthentication]
  /**
    * Specifies the available modes of how long to remember the password.
    * @param Default Returns the default mode (to be initially displayed to the user).
    * @returns A sequence of available modes to hand back. Each individual mode should appear at most once in the sequence. If the sequence is empty, a new mode
    */
  def getRememberPasswordModes(Default: js.Array[RememberAuthentication]): activexDashInteropLib.SafeArray[RememberAuthentication]
  /**
    * Set a new "account" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetAccount()} returned `TRUE` .
    */
  def setAccount(Account: java.lang.String): scala.Unit
  /**
    * Set a new "password" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetPassword()} returned `TRUE` .
    */
  def setPassword(Password: java.lang.String): scala.Unit
  /**
    * Set a new "realm" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetRealm()} returned `TRUE` .
    */
  def setRealm(Realm: java.lang.String): scala.Unit
  /**
    * Set a new mode of how long to remember the account.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setAccount()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberAccountModes()} .
    */
  def setRememberAccount(Remember: RememberAuthentication): scala.Unit
  /**
    * Set a new mode of how long to remember the password.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.setPassword()} is also called.
    * @param Remember The mode to hand back, should be contained in the sequence returned by {@link XInteractionSupplyAuthentication.getRememberPasswordModes()} .
    */
  def setRememberPassword(Remember: RememberAuthentication): scala.Unit
  /**
    * Set a new "user name" value to hand back.
    *
    * This method should be called before {@link com.sun.star.task.XInteractionContinuation.select()} , and should only be called if {@link
    * XInteractionSupplyAuthentication.canSetUserName()} returned `TRUE` .
    */
  def setUserName(UserName: java.lang.String): scala.Unit
}

object XInteractionSupplyAuthentication {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    canSetAccount: js.Function0[scala.Boolean],
    canSetPassword: js.Function0[scala.Boolean],
    canSetRealm: js.Function0[scala.Boolean],
    canSetUserName: js.Function0[scala.Boolean],
    getRememberAccountModes: js.Function1[
      js.Array[RememberAuthentication], 
      activexDashInteropLib.SafeArray[RememberAuthentication]
    ],
    getRememberPasswordModes: js.Function1[
      js.Array[RememberAuthentication], 
      activexDashInteropLib.SafeArray[RememberAuthentication]
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    select: js.Function0[scala.Unit],
    setAccount: js.Function1[java.lang.String, scala.Unit],
    setPassword: js.Function1[java.lang.String, scala.Unit],
    setRealm: js.Function1[java.lang.String, scala.Unit],
    setRememberAccount: js.Function1[RememberAuthentication, scala.Unit],
    setRememberPassword: js.Function1[RememberAuthentication, scala.Unit],
    setUserName: js.Function1[java.lang.String, scala.Unit]
  ): XInteractionSupplyAuthentication = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("canSetAccount")(canSetAccount)
    __obj.updateDynamic("canSetPassword")(canSetPassword)
    __obj.updateDynamic("canSetRealm")(canSetRealm)
    __obj.updateDynamic("canSetUserName")(canSetUserName)
    __obj.updateDynamic("getRememberAccountModes")(getRememberAccountModes)
    __obj.updateDynamic("getRememberPasswordModes")(getRememberPasswordModes)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("setAccount")(setAccount)
    __obj.updateDynamic("setPassword")(setPassword)
    __obj.updateDynamic("setRealm")(setRealm)
    __obj.updateDynamic("setRememberAccount")(setRememberAccount)
    __obj.updateDynamic("setRememberPassword")(setRememberPassword)
    __obj.updateDynamic("setUserName")(setUserName)
    __obj.asInstanceOf[XInteractionSupplyAuthentication]
  }
}

