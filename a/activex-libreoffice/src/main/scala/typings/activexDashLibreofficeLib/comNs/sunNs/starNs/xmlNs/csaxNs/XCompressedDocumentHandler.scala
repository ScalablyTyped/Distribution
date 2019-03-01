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
    acquire: js.Function0[scala.Unit],
    compressedCharacters: js.Function1[java.lang.String, scala.Unit],
    compressedEndDocument: js.Function0[scala.Unit],
    compressedEndElement: js.Function1[java.lang.String, scala.Unit],
    compressedIgnorableWhitespace: js.Function1[java.lang.String, scala.Unit],
    compressedProcessingInstruction: js.Function2[java.lang.String, java.lang.String, scala.Unit],
    compressedSetDocumentLocator: js.Function4[scala.Double, scala.Double, java.lang.String, java.lang.String, scala.Unit],
    compressedStartDocument: js.Function0[scala.Unit],
    compressedStartElement: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[XMLAttribute], 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XCompressedDocumentHandler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("compressedCharacters")(compressedCharacters)
    __obj.updateDynamic("compressedEndDocument")(compressedEndDocument)
    __obj.updateDynamic("compressedEndElement")(compressedEndElement)
    __obj.updateDynamic("compressedIgnorableWhitespace")(compressedIgnorableWhitespace)
    __obj.updateDynamic("compressedProcessingInstruction")(compressedProcessingInstruction)
    __obj.updateDynamic("compressedSetDocumentLocator")(compressedSetDocumentLocator)
    __obj.updateDynamic("compressedStartDocument")(compressedStartDocument)
    __obj.updateDynamic("compressedStartElement")(compressedStartElement)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XCompressedDocumentHandler]
  }
}

