package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.cryptoNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
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
    acquire: () => Unit,
    getCipherContext: (Double, SeqEquiv[Double], SeqEquiv[Double], Boolean, SeqEquiv[NamedValue]) => XCipherContext,
    getDigestContext: (Double, SeqEquiv[NamedValue]) => XDigestContext,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XNSSInitializer = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getCipherContext = js.Any.fromFunction5(getCipherContext), getDigestContext = js.Any.fromFunction2(getDigestContext), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XNSSInitializer]
  }
}

