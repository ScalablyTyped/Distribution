package typings.activexLibreoffice.com_.sun.star.auth

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Factory for creating an SSO Manager supporting the user's configured security mechanism
  * @since OOo 1.1.2
  */
trait XSSOManagerFactory extends XInterface {
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
    acquire: () => Unit,
    getSSOManager: () => XSSOManager,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSSOManagerFactory = {
    val __obj = js.Dynamic.literal(SSOManager = SSOManager.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getSSOManager = js.Any.fromFunction0(getSSOManager), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSSOManagerFactory]
  }
}

