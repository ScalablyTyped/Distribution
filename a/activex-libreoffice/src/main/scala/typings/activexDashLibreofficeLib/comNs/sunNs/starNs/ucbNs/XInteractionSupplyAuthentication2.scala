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
    acquire: () => scala.Unit,
    canSetAccount: () => scala.Boolean,
    canSetPassword: () => scala.Boolean,
    canSetRealm: () => scala.Boolean,
    canSetUserName: () => scala.Boolean,
    canUseSystemCredentials: js.Array[scala.Boolean] => scala.Boolean,
    getRememberAccountModes: js.Array[RememberAuthentication] => stdLib.SafeArray[RememberAuthentication],
    getRememberPasswordModes: js.Array[RememberAuthentication] => stdLib.SafeArray[RememberAuthentication],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    select: () => scala.Unit,
    setAccount: java.lang.String => scala.Unit,
    setPassword: java.lang.String => scala.Unit,
    setRealm: java.lang.String => scala.Unit,
    setRememberAccount: RememberAuthentication => scala.Unit,
    setRememberPassword: RememberAuthentication => scala.Unit,
    setUseSystemCredentials: scala.Boolean => scala.Unit,
    setUserName: java.lang.String => scala.Unit
  ): XInteractionSupplyAuthentication2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canSetAccount = js.Any.fromFunction0(canSetAccount), canSetPassword = js.Any.fromFunction0(canSetPassword), canSetRealm = js.Any.fromFunction0(canSetRealm), canSetUserName = js.Any.fromFunction0(canSetUserName), canUseSystemCredentials = js.Any.fromFunction1(canUseSystemCredentials), getRememberAccountModes = js.Any.fromFunction1(getRememberAccountModes), getRememberPasswordModes = js.Any.fromFunction1(getRememberPasswordModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setAccount = js.Any.fromFunction1(setAccount), setPassword = js.Any.fromFunction1(setPassword), setRealm = js.Any.fromFunction1(setRealm), setRememberAccount = js.Any.fromFunction1(setRememberAccount), setRememberPassword = js.Any.fromFunction1(setRememberPassword), setUseSystemCredentials = js.Any.fromFunction1(setUseSystemCredentials), setUserName = js.Any.fromFunction1(setUserName))
  
    __obj.asInstanceOf[XInteractionSupplyAuthentication2]
  }
}

