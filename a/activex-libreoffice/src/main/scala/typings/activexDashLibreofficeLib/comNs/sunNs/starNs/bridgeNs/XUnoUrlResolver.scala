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

