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
    acquire: () => scala.Unit,
    endJob: () => scala.Unit,
    printPage: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    startJob: (activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], java.lang.String, scala.Double, scala.Boolean) => scala.Boolean
  ): XSVGPrinter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endJob = js.Any.fromFunction0(endJob), printPage = js.Any.fromFunction1(printPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startJob = js.Any.fromFunction5(startJob))
  
    __obj.asInstanceOf[XSVGPrinter]
  }
}

