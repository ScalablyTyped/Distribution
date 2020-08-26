package typings.activexLibreoffice.com_.sun.star.svg

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.xml.sax.XDocumentHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
@js.native
trait XSVGPrinter extends XInterface {
  def endJob(): Unit = js.native
  def printPage(aPrintPage: SeqEquiv[Double]): Unit = js.native
  def startJob(
    aHandler: XDocumentHandler,
    aJobSetup: SeqEquiv[Double],
    aJobName: String,
    nCopies: Double,
    bCollate: Boolean
  ): Boolean = js.native
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
  @scala.inline
  implicit class XSVGPrinterOps[Self <: XSVGPrinter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndJob(value: () => Unit): Self = this.set("endJob", js.Any.fromFunction0(value))
    @scala.inline
    def setPrintPage(value: SeqEquiv[Double] => Unit): Self = this.set("printPage", js.Any.fromFunction1(value))
    @scala.inline
    def setStartJob(value: (XDocumentHandler, SeqEquiv[Double], String, Double, Boolean) => Boolean): Self = this.set("startJob", js.Any.fromFunction5(value))
  }
  
}

