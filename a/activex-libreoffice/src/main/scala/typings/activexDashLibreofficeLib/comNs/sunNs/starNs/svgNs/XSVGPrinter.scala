package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.svgNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSVGPrinter
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def endJob(): scala.Unit
  def printPage(aPrintPage: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  def startJob(
    aHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler,
    aJobSetup: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double],
    aJobName: java.lang.String,
    nCopies: scala.Double,
    bCollate: scala.Boolean
  ): scala.Boolean
}

object XSVGPrinter {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    endJob: js.Function0[scala.Unit],
    printPage: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    startJob: js.Function5[
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], 
      java.lang.String, 
      scala.Double, 
      scala.Boolean, 
      scala.Boolean
    ]
  ): XSVGPrinter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("endJob")(endJob)
    __obj.updateDynamic("printPage")(printPage)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("startJob")(startJob)
    __obj.asInstanceOf[XSVGPrinter]
  }
}

