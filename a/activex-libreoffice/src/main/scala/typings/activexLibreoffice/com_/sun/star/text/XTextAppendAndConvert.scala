package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.PropertyValues
import typings.activexLibreoffice.sequence
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** merges the functions of {@link XTextAppend} , {@link XTextContentAppend} and {@link XTextConvert} . */
trait XTextAppendAndConvert
  extends StObject
     with XTextAppend
     with XTextContentAppend
     with XTextConvert
object XTextAppendAndConvert {
  
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    appendTextContent: (XTextContent, PropertyValues) => XTextRange,
    appendTextPortion: (String, PropertyValues) => XTextRange,
    convertToTable: (SeqEquiv[SeqEquiv[sequence[XTextRange]]], SeqEquiv[SeqEquiv[PropertyValues]], SeqEquiv[PropertyValues], PropertyValues) => XTextTable,
    convertToTextFrame: (XTextRange, XTextRange, PropertyValues) => XTextContent,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    finishParagraph: PropertyValues => XTextRange,
    finishParagraphInsert: (PropertyValues, XTextRange) => XTextRange,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    insertTextContentWithProperties: (XTextContent, PropertyValues, XTextRange) => XTextRange,
    insertTextPortion: (String, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContent: XTextContent => Unit,
    setString: String => Unit
  ): XTextAppendAndConvert = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), appendTextContent = js.Any.fromFunction2(appendTextContent), appendTextPortion = js.Any.fromFunction2(appendTextPortion), convertToTable = js.Any.fromFunction4(convertToTable), convertToTextFrame = js.Any.fromFunction3(convertToTextFrame), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), finishParagraph = js.Any.fromFunction1(finishParagraph), finishParagraphInsert = js.Any.fromFunction2(finishParagraphInsert), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), insertTextContentWithProperties = js.Any.fromFunction3(insertTextContentWithProperties), insertTextPortion = js.Any.fromFunction3(insertTextPortion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[XTextAppendAndConvert]
  }
}
