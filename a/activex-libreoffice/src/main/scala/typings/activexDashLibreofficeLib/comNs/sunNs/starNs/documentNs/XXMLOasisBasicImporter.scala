package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.1 */
trait XXMLOasisBasicImporter
  extends XImporter
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler

object XXMLOasisBasicImporter {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    endDocument: () => scala.Unit,
    endElement: java.lang.String => scala.Unit,
    ignorableWhitespace: java.lang.String => scala.Unit,
    processingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDocumentLocator: activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator => scala.Unit,
    setTargetDocument: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent => scala.Unit,
    startDocument: () => scala.Unit,
    startElement: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList) => scala.Unit
  ): XXMLOasisBasicImporter = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setTargetDocument = js.Any.fromFunction1(setTargetDocument), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
  
    __obj.asInstanceOf[XXMLOasisBasicImporter]
  }
}

