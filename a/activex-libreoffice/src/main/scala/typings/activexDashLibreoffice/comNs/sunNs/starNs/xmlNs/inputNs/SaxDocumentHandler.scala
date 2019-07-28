package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.inputNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XInitialization
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XAttributeList
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XDocumentHandler
import typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.saxNs.XLocator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service helps parsing files by providing a SAX document handler interface for a SAX parsers. You have to instantiate this service passing an
  * {@link XRoot} instance.
  */
trait SaxDocumentHandler
  extends XDocumentHandler
     with XInitialization

object SaxDocumentHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    characters: String => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    ignorableWhitespace: String => Unit,
    initialize: SeqEquiv[_] => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit
  ): SaxDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), characters = js.Any.fromFunction1(characters), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), initialize = js.Any.fromFunction1(initialize), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement))
  
    __obj.asInstanceOf[SaxDocumentHandler]
  }
}

