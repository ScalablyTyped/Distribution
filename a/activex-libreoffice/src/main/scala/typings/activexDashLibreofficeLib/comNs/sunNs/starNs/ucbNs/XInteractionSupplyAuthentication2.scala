package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An interaction continuation handing back some authentication data.
  *
  * This continuation is typically used in conjunction with {@link AuthenticationRequest} .
  * @since OOo 3.2
  */
trait XInteractionSupplyAuthentication2 extends XInteractionSupplyAuthentication {
  /**
    * Specifies if "system credentials" can be obtained and used by the issuer of the authentication request.
    * @param Default Returns the default behavior for system credentials handling (to be initially displayed to the user).
    * @returns `TRUE` if the issuer is able to obtain and use system credentials. `FALSE` otherwise.
    */
  def canUseSystemCredentials(Default: js.Array[scala.Boolean]): scala.Boolean
  /**
    * Set a new "use system credentials" value to hand back.
    * @param UseSystemCredentials `TRUE` means the request issuer shall obtain and use system credentials.
    */
  def setUseSystemCredentials(UseSystemCredentials: scala.Boolean): scala.Unit
}

object XInteractionSupplyAuthentication2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    canSetAccount: js.Function0[scala.Boolean],
    canSetPassword: js.Function0[scala.Boolean],
    canSetRealm: js.Function0[scala.Boolean],
    canSetUserName: js.Function0[scala.Boolean],
    canUseSystemCredentials: js.Function1[js.Array[scala.Boolean], scala.Boolean],
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
    setUseSystemCredentials: js.Function1[scala.Boolean, scala.Unit],
    setUserName: js.Function1[java.lang.String, scala.Unit]
  ): XInteractionSupplyAuthentication2 = {
    val __obj = js.Dynamic.literal(acquire = acquire, canSetAccount = canSetAccount, canSetPassword = canSetPassword, canSetRealm = canSetRealm, canSetUserName = canSetUserName, canUseSystemCredentials = canUseSystemCredentials, getRememberAccountModes = getRememberAccountModes, getRememberPasswordModes = getRememberPasswordModes, queryInterface = queryInterface, release = release, select = select, setAccount = setAccount, setPassword = setPassword, setRealm = setRealm, setRememberAccount = setRememberAccount, setRememberPassword = setRememberPassword, setUseSystemCredentials = setUseSystemCredentials, setUserName = setUserName)
  
    __obj.asInstanceOf[XInteractionSupplyAuthentication2]
  }
}

