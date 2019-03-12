package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.bridgeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** allows to resolve an object using the uno-url. */
trait XUnoUrlResolver
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * resolves an object using the given uno-url.
    * @param sUnoUrl the uno-url. The uno-url is specified [here]{@link url="http://udk.openoffice.org/common/man/spec/uno-url.html"} .
    * @returns the resolved object, in general a proxy for a remote object. You can use it the same way as you use local references.
    */
  def resolve(sUnoUrl: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
}

object XUnoUrlResolver {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    resolve: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): XUnoUrlResolver = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[XUnoUrlResolver]
  }
}

