package typings.activexLibreoffice.com_.sun.star.xml.csax

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A compressed XDocumentHandler interface.
  *
  * All methods in this interface have the same function with methods in the XDocumentHandler interface.
  *
  * Because there is no interface parameter in these methods, so using this interface to transfer SAX event is thought to have better performance than
  * using the XDocumentHandler interface, in case of when UNO C++/Java bridge is involved.
  */
@js.native
trait XCompressedDocumentHandler extends XInterface {
  def compressedCharacters(aChars: String): Unit = js.native
  def compressedEndDocument(): Unit = js.native
  def compressedEndElement(aName: String): Unit = js.native
  def compressedIgnorableWhitespace(aWhitespaces: String): Unit = js.native
  def compressedProcessingInstruction(aTarget: String, aData: String): Unit = js.native
  def compressedSetDocumentLocator(columnNumber: Double, lineNumber: Double, publicId: String, systemId: String): Unit = js.native
  def compressedStartDocument(): Unit = js.native
  def compressedStartElement(aName: String, aAttributes: SeqEquiv[XMLAttribute]): Unit = js.native
}

object XCompressedDocumentHandler {
  @scala.inline
  def apply(
    acquire: () => Unit,
    compressedCharacters: String => Unit,
    compressedEndDocument: () => Unit,
    compressedEndElement: String => Unit,
    compressedIgnorableWhitespace: String => Unit,
    compressedProcessingInstruction: (String, String) => Unit,
    compressedSetDocumentLocator: (Double, Double, String, String) => Unit,
    compressedStartDocument: () => Unit,
    compressedStartElement: (String, SeqEquiv[XMLAttribute]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCompressedDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compressedCharacters = js.Any.fromFunction1(compressedCharacters), compressedEndDocument = js.Any.fromFunction0(compressedEndDocument), compressedEndElement = js.Any.fromFunction1(compressedEndElement), compressedIgnorableWhitespace = js.Any.fromFunction1(compressedIgnorableWhitespace), compressedProcessingInstruction = js.Any.fromFunction2(compressedProcessingInstruction), compressedSetDocumentLocator = js.Any.fromFunction4(compressedSetDocumentLocator), compressedStartDocument = js.Any.fromFunction0(compressedStartDocument), compressedStartElement = js.Any.fromFunction2(compressedStartElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCompressedDocumentHandler]
  }
  @scala.inline
  implicit class XCompressedDocumentHandlerOps[Self <: XCompressedDocumentHandler] (val x: Self) extends AnyVal {
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
    def setCompressedCharacters(value: String => Unit): Self = this.set("compressedCharacters", js.Any.fromFunction1(value))
    @scala.inline
    def setCompressedEndDocument(value: () => Unit): Self = this.set("compressedEndDocument", js.Any.fromFunction0(value))
    @scala.inline
    def setCompressedEndElement(value: String => Unit): Self = this.set("compressedEndElement", js.Any.fromFunction1(value))
    @scala.inline
    def setCompressedIgnorableWhitespace(value: String => Unit): Self = this.set("compressedIgnorableWhitespace", js.Any.fromFunction1(value))
    @scala.inline
    def setCompressedProcessingInstruction(value: (String, String) => Unit): Self = this.set("compressedProcessingInstruction", js.Any.fromFunction2(value))
    @scala.inline
    def setCompressedSetDocumentLocator(value: (Double, Double, String, String) => Unit): Self = this.set("compressedSetDocumentLocator", js.Any.fromFunction4(value))
    @scala.inline
    def setCompressedStartDocument(value: () => Unit): Self = this.set("compressedStartDocument", js.Any.fromFunction0(value))
    @scala.inline
    def setCompressedStartElement(value: (String, SeqEquiv[XMLAttribute]) => Unit): Self = this.set("compressedStartElement", js.Any.fromFunction2(value))
  }
  
}

