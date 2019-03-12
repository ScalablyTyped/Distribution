package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.csaxNs

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
trait XCompressedDocumentHandler
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def compressedCharacters(aChars: java.lang.String): scala.Unit
  def compressedEndDocument(): scala.Unit
  def compressedEndElement(aName: java.lang.String): scala.Unit
  def compressedIgnorableWhitespace(aWhitespaces: java.lang.String): scala.Unit
  def compressedProcessingInstruction(aTarget: java.lang.String, aData: java.lang.String): scala.Unit
  def compressedSetDocumentLocator(
    columnNumber: scala.Double,
    lineNumber: scala.Double,
    publicId: java.lang.String,
    systemId: java.lang.String
  ): scala.Unit
  def compressedStartDocument(): scala.Unit
  def compressedStartElement(
    aName: java.lang.String,
    aAttributes: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XMLAttribute]
  ): scala.Unit
}

object XCompressedDocumentHandler {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    compressedCharacters: java.lang.String => scala.Unit,
    compressedEndDocument: () => scala.Unit,
    compressedEndElement: java.lang.String => scala.Unit,
    compressedIgnorableWhitespace: java.lang.String => scala.Unit,
    compressedProcessingInstruction: (java.lang.String, java.lang.String) => scala.Unit,
    compressedSetDocumentLocator: (scala.Double, scala.Double, java.lang.String, java.lang.String) => scala.Unit,
    compressedStartDocument: () => scala.Unit,
    compressedStartElement: (java.lang.String, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XMLAttribute]) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XCompressedDocumentHandler = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), compressedCharacters = js.Any.fromFunction1(compressedCharacters), compressedEndDocument = js.Any.fromFunction0(compressedEndDocument), compressedEndElement = js.Any.fromFunction1(compressedEndElement), compressedIgnorableWhitespace = js.Any.fromFunction1(compressedIgnorableWhitespace), compressedProcessingInstruction = js.Any.fromFunction2(compressedProcessingInstruction), compressedSetDocumentLocator = js.Any.fromFunction4(compressedSetDocumentLocator), compressedStartDocument = js.Any.fromFunction0(compressedStartDocument), compressedStartElement = js.Any.fromFunction2(compressedStartElement), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCompressedDocumentHandler]
  }
}

