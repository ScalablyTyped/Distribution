package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.wrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Service of {@link XMLElementWrapper} */
trait XMLElementWrapper
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XUnoTunnel
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object XMLElementWrapper {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getSomething: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Double],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMLElementWrapper = {
    val __obj = js.Dynamic.literal(acquire = acquire, getSomething = getSomething, initialize = initialize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XMLElementWrapper]
  }
}

