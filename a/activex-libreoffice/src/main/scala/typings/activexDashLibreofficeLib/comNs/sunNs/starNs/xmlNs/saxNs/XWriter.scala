package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.saxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style {@link Writer} service to implement.
  * @since LibreOffice 4.0
  */
trait XWriter
  extends XExtendedDocumentHandler
     with activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XActiveDataSource

object XWriter {
  @scala.inline
  def apply(
    OutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    acquire: () => scala.Unit,
    allowLineBreak: () => scala.Unit,
    characters: java.lang.String => scala.Unit,
    comment: java.lang.String => scala.Unit,
    endCDATA: () => scala.Unit,
    endDocument: () => scala.Unit,
    endElement: java.lang.String => scala.Unit,
    getOutputStream: () => activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream,
    ignorableWhitespace: java.lang.String => scala.Unit,
    processingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setDocumentLocator: XLocator => scala.Unit,
    setOutputStream: activexDashLibreofficeLib.comNs.sunNs.starNs.ioNs.XOutputStream => scala.Unit,
    startCDATA: () => scala.Unit,
    startDocument: () => scala.Unit,
    startElement: (java.lang.String, XAttributeList) => scala.Unit,
    unknown: java.lang.String => scala.Unit
  ): XWriter = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream, acquire = js.Any.fromFunction0(acquire), allowLineBreak = js.Any.fromFunction0(allowLineBreak), characters = js.Any.fromFunction1(characters), comment = js.Any.fromFunction1(comment), endCDATA = js.Any.fromFunction0(endCDATA), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), getOutputStream = js.Any.fromFunction0(getOutputStream), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setOutputStream = js.Any.fromFunction1(setOutputStream), startCDATA = js.Any.fromFunction0(startCDATA), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement), unknown = js.Any.fromFunction1(unknown))
  
    __obj.asInstanceOf[XWriter]
  }
}

