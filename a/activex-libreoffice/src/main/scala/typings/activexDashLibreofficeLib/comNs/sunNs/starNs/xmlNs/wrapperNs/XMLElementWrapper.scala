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
    acquire: () => scala.Unit,
    getSomething: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Double,
    initialize: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XMLElementWrapper = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getSomething = js.Any.fromFunction1(getSomething), initialize = js.Any.fromFunction1(initialize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XMLElementWrapper]
  }
}

