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

