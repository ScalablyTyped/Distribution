package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.0 */
trait XNSSInitializer
  extends XDigestContextSupplier
     with XCipherContextSupplier

object XNSSInitializer {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    getCipherContext: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Boolean, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => XCipherContext,
    getDigestContext: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => XDigestContext,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XNSSInitializer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCipherContext = js.Any.fromFunction5(getCipherContext), getDigestContext = js.Any.fromFunction2(getDigestContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNSSInitializer]
  }
}

