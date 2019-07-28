package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import typings.activexDashLibreoffice.`type`
import typings.std.SafeArray
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
  def canUseSystemCredentials(Default: js.Array[Boolean]): Boolean
  /**
    * Set a new "use system credentials" value to hand back.
    * @param UseSystemCredentials `TRUE` means the request issuer shall obtain and use system credentials.
    */
  def setUseSystemCredentials(UseSystemCredentials: Boolean): Unit
}

object XInteractionSupplyAuthentication2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    canSetAccount: () => Boolean,
    canSetPassword: () => Boolean,
    canSetRealm: () => Boolean,
    canSetUserName: () => Boolean,
    canUseSystemCredentials: js.Array[Boolean] => Boolean,
    getRememberAccountModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    getRememberPasswordModes: js.Array[RememberAuthentication] => SafeArray[RememberAuthentication],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    select: () => Unit,
    setAccount: String => Unit,
    setPassword: String => Unit,
    setRealm: String => Unit,
    setRememberAccount: RememberAuthentication => Unit,
    setRememberPassword: RememberAuthentication => Unit,
    setUseSystemCredentials: Boolean => Unit,
    setUserName: String => Unit
  ): XInteractionSupplyAuthentication2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), canSetAccount = js.Any.fromFunction0(canSetAccount), canSetPassword = js.Any.fromFunction0(canSetPassword), canSetRealm = js.Any.fromFunction0(canSetRealm), canSetUserName = js.Any.fromFunction0(canSetUserName), canUseSystemCredentials = js.Any.fromFunction1(canUseSystemCredentials), getRememberAccountModes = js.Any.fromFunction1(getRememberAccountModes), getRememberPasswordModes = js.Any.fromFunction1(getRememberPasswordModes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), select = js.Any.fromFunction0(select), setAccount = js.Any.fromFunction1(setAccount), setPassword = js.Any.fromFunction1(setPassword), setRealm = js.Any.fromFunction1(setRealm), setRememberAccount = js.Any.fromFunction1(setRememberAccount), setRememberPassword = js.Any.fromFunction1(setRememberPassword), setUseSystemCredentials = js.Any.fromFunction1(setUseSystemCredentials), setUserName = js.Any.fromFunction1(setUserName))
  
    __obj.asInstanceOf[XInteractionSupplyAuthentication2]
  }
}

