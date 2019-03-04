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
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator, scala.Unit],
    setTargetDocument: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList, 
      scala.Unit
    ]
  ): XXMLOasisBasicImporter = {
    val __obj = js.Dynamic.literal(acquire = acquire, characters = characters, endDocument = endDocument, endElement = endElement, ignorableWhitespace = ignorableWhitespace, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, setDocumentLocator = setDocumentLocator, setTargetDocument = setTargetDocument, startDocument = startDocument, startElement = startElement)
  
    __obj.asInstanceOf[XXMLOasisBasicImporter]
  }
}

