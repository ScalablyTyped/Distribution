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
    acquire: js.Function0[scala.Unit],
    getCipherContext: js.Function5[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Boolean, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XCipherContext
    ],
    getDigestContext: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      XDigestContext
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XNSSInitializer = {
    val __obj = js.Dynamic.literal(acquire = acquire, getCipherContext = getCipherContext, getDigestContext = getDigestContext, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XNSSInitializer]
  }
}

