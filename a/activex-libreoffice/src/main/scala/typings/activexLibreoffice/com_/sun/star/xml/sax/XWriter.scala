package typings.activexLibreoffice.com_.sun.star.xml.sax

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.io.XActiveDataSource
import typings.activexLibreoffice.com_.sun.star.io.XOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides a unified interface for the new-style {@link Writer} service to implement.
  * @since LibreOffice 4.0
  */
trait XWriter
  extends XExtendedDocumentHandler
     with XActiveDataSource

object XWriter {
  @scala.inline
  def apply(
    OutputStream: XOutputStream,
    acquire: () => Unit,
    allowLineBreak: () => Unit,
    characters: String => Unit,
    comment: String => Unit,
    endCDATA: () => Unit,
    endDocument: () => Unit,
    endElement: String => Unit,
    getOutputStream: () => XOutputStream,
    ignorableWhitespace: String => Unit,
    processingInstruction: (String, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setDocumentLocator: XLocator => Unit,
    setOutputStream: XOutputStream => Unit,
    startCDATA: () => Unit,
    startDocument: () => Unit,
    startElement: (String, XAttributeList) => Unit,
    unknown: String => Unit
  ): XWriter = {
    val __obj = js.Dynamic.literal(OutputStream = OutputStream.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), allowLineBreak = js.Any.fromFunction0(allowLineBreak), characters = js.Any.fromFunction1(characters), comment = js.Any.fromFunction1(comment), endCDATA = js.Any.fromFunction0(endCDATA), endDocument = js.Any.fromFunction0(endDocument), endElement = js.Any.fromFunction1(endElement), getOutputStream = js.Any.fromFunction0(getOutputStream), ignorableWhitespace = js.Any.fromFunction1(ignorableWhitespace), processingInstruction = js.Any.fromFunction2(processingInstruction), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setDocumentLocator = js.Any.fromFunction1(setDocumentLocator), setOutputStream = js.Any.fromFunction1(setOutputStream), startCDATA = js.Any.fromFunction0(startCDATA), startDocument = js.Any.fromFunction0(startDocument), startElement = js.Any.fromFunction2(startElement), unknown = js.Any.fromFunction1(unknown))
    __obj.asInstanceOf[XWriter]
  }
}

