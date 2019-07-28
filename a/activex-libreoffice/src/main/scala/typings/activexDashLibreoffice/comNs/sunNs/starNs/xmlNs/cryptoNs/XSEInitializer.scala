package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to manipulate Security Environment */
trait XSEInitializer extends XInterface {
  /**
    * Creates a security context.
    * @param aString reserved for internal use.
    * @returns the security context created
    */
  def createSecurityContext(aString: String): XXMLSecurityContext
  /**
    * Frees a security context.
    * @param securityContext the security context to be freed
    */
  def freeSecurityContext(securityContext: XXMLSecurityContext): Unit
}

object XSEInitializer {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createSecurityContext: String => XXMLSecurityContext,
    freeSecurityContext: XXMLSecurityContext => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSEInitializer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createSecurityContext = js.Any.fromFunction1(createSecurityContext), freeSecurityContext = js.Any.fromFunction1(freeSecurityContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSEInitializer]
  }
}

