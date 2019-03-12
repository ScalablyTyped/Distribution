package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** merges the functions of {@link XTextAppend} , {@link XTextContentAppend} and {@link XTextConvert} . */
trait XTextAppendAndConvert
  extends XTextAppend
     with XTextContentAppend
     with XTextConvert

object XTextAppendAndConvert {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: () => scala.Unit,
    appendTextContent: (XTextContent, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XTextRange,
    appendTextPortion: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XTextRange,
    convertToTable: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.sequence[XTextRange]]
    ], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues]
    ], activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues], activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XTextTable,
    convertToTextFrame: (XTextRange, XTextRange, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues) => XTextContent,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    finishParagraph: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues => XTextRange,
    finishParagraphInsert: (activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XTextRange) => XTextRange,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    insertTextContent: (XTextRange, XTextContent, scala.Boolean) => scala.Unit,
    insertTextContentWithProperties: (XTextContent, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XTextRange) => XTextRange,
    insertTextPortion: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XTextRange) => XTextRange,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTextContent: XTextContent => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XTextAppendAndConvert = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), appendTextContent = js.Any.fromFunction2(appendTextContent), appendTextPortion = js.Any.fromFunction2(appendTextPortion), convertToTable = js.Any.fromFunction4(convertToTable), convertToTextFrame = js.Any.fromFunction3(convertToTextFrame), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), finishParagraph = js.Any.fromFunction1(finishParagraph), finishParagraphInsert = js.Any.fromFunction2(finishParagraphInsert), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), insertTextContentWithProperties = js.Any.fromFunction3(insertTextContentWithProperties), insertTextPortion = js.Any.fromFunction3(insertTextPortion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XTextAppendAndConvert]
  }
}

