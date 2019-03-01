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
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    resolve: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface]
  ): XUnoUrlResolver = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("resolve")(resolve)
    __obj.asInstanceOf[XUnoUrlResolver]
  }
}

