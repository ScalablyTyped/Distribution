package typings.activexDashLibreoffice.comNs.sunNs.starNs.svgNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @deprecated Deprecated */
trait XSVGWriter extends XInterface {
  def write(aHandler: XDocumentHandler, aMtf: SeqEquiv[Double]): Unit
}

object XSVGWriter {
  @scala.inline
  def apply(
    acquire: () => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    write: (XDocumentHandler, SeqEquiv[Double]) => Unit
  ): XSVGWriter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), write = js.Any.fromFunction2(write))
  
    __obj.asInstanceOf[XSVGWriter]
  }
}

