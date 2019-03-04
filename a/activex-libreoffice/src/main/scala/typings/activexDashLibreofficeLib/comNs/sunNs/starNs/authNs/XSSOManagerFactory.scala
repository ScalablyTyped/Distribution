package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory for creating an SSO Manager supporting the user's configured security mechanism
  * @since OOo 1.1.2
  */
trait XSSOManagerFactory
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * provides a {@link XSSOManager} to be used in subsequent security context creation.
    * @returns the relevant {@link XSSOManager} instance
    */
  val SSOManager: XSSOManager
  /**
    * provides a {@link XSSOManager} to be used in subsequent security context creation.
    * @returns the relevant {@link XSSOManager} instance
    */
  def getSSOManager(): XSSOManager
}

object XSSOManagerFactory {
  @scala.inline
  def apply(
    SSOManager: XSSOManager,
    acquire: js.Function0[scala.Unit],
    getSSOManager: js.Function0[XSSOManager],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSSOManagerFactory = {
    val __obj = js.Dynamic.literal(SSOManager = SSOManager, acquire = acquire, getSSOManager = getSSOManager, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSSOManagerFactory]
  }
}

