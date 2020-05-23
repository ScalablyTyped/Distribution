package typings.activexLibreoffice.com_.sun.star.svg

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSVGPrinter extends XInterface {
  def endJob(): Unit
  def printPage(aPrintPage: SeqEquiv[Double]): Unit
  def startJob(
    aHandler: XDocumentHandler,
    aJobSetup: SeqEquiv[Double],
    aJobName: String,
    nCopies: Double,
    bCollate: Boolean
  ): Boolean
}

object XSVGPrinter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    endJob: () => Unit,
    printPage: SeqEquiv[Double] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    startJob: (XDocumentHandler, SeqEquiv[Double], String, Double, Boolean) => Boolean
  ): XSVGPrinter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), endJob = js.Any.fromFunction0(endJob), printPage = js.Any.fromFunction1(printPage), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), startJob = js.Any.fromFunction5(startJob))
    __obj.asInstanceOf[XSVGPrinter]
  }
}

