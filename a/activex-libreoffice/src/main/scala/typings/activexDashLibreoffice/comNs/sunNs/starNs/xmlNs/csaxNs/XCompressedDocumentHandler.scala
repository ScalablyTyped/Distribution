package typings.activexDashLibreoffice.comNs.sunNs.starNs.xmlNs.csaxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
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
trait XCompressedDocumentHandler extends XInterface {
  def compressedCharacters(aChars: String): Unit
  def compressedEndDocument(): Unit
  def compressedEndElement(aName: String): Unit
  def compressedIgnorableWhitespace(aWhitespaces: String): Unit
  def compressedProcessingInstruction(aTarget: String, aData: String): Unit
  def compressedSetDocumentLocator(columnNumber: Double, lineNumber: Double, publicId: String, systemId: String): Unit
  def compressedStartDocument(): Unit
  def compressedStartElement(aName: String, aAttributes: SeqEquiv[XMLAttribute]): Unit
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
}

