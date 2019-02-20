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

