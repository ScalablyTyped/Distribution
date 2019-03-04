package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.inputNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service helps parsing files by providing a SAX document handler interface for a SAX parsers. You have to instantiate this service passing an
  * {@link XRoot} instance.
  */
trait SaxDocumentHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XInitialization

object SaxDocumentHandler {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    characters: js.Function1[java.lang.String, scala.Unit],
    endDocument: js.Function0[scala.Unit],
    endElement: js.Function1[java.lang.String, scala.Unit],
    ignorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    initialize: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[_], scala.Unit],
    processingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDocumentLocator: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XLocator, scala.Unit],
    startDocument: js.Function0[scala.Unit],
    startElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList, 
      scala.Unit
    ]
  ): SaxDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = acquire, characters = characters, endDocument = endDocument, endElement = endElement, ignorableWhitespace = ignorableWhitespace, initialize = initialize, processingInstruction = processingInstruction, queryInterface = queryInterface, release = release, setDocumentLocator = setDocumentLocator, startDocument = startDocument, startElement = startElement)
  
    __obj.asInstanceOf[SaxDocumentHandler]
  }
}

