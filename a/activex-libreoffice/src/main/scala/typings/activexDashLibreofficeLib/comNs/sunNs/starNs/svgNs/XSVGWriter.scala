package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.svgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSVGWriter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def write(
    aHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    aMtf: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]
  ): scala.Unit
}

object XSVGWriter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    write: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      scala.Unit
    ]
  ): XSVGWriter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("write")(write)
    __obj.asInstanceOf[XSVGWriter]
  }
}

