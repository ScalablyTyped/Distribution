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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("canSetAccount")(canSetAccount)
    __obj.updateDynamic("canSetPassword")(canSetPassword)
    __obj.updateDynamic("canSetRealm")(canSetRealm)
    __obj.updateDynamic("canSetUserName")(canSetUserName)
    __obj.updateDynamic("canUseSystemCredentials")(canUseSystemCredentials)
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
    __obj.updateDynamic("setUseSystemCredentials")(setUseSystemCredentials)
    __obj.updateDynamic("setUserName")(setUserName)
    __obj.asInstanceOf[XInteractionSupplyAuthentication2]
  }
}

