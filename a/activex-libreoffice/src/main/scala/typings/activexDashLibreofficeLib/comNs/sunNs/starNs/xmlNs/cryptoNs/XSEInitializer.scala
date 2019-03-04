package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Interface to manipulate Security Environment */
trait XSEInitializer
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * Creates a security context.
    * @param aString reserved for internal use.
    * @returns the security context created
    */
  def createSecurityContext(aString: java.lang.String): XXMLSecurityContext
  /**
    * Frees a security context.
    * @param securityContext the security context to be freed
    */
  def freeSecurityContext(securityContext: XXMLSecurityContext): scala.Unit
}

object XSEInitializer {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createSecurityContext: js.Function1[java.lang.String, XXMLSecurityContext],
    freeSecurityContext: js.Function1[XXMLSecurityContext, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSEInitializer = {
    val __obj = js.Dynamic.literal(acquire = acquire, createSecurityContext = createSecurityContext, freeSecurityContext = freeSecurityContext, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XSEInitializer]
  }
}

