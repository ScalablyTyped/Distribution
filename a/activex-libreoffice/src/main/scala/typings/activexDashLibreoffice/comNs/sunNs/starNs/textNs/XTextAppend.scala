package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a meta-interface for manipulating and inserting text. */
trait XTextAppend
  extends XText
     with XParagraphAppend
     with XTextPortionAppend

object XTextAppend {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    appendTextPortion: (String, PropertyValues) => XTextRange,
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
    insertTextPortion: (String, PropertyValues, XTextRange) => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContent: XTextContent => Unit,
    setString: String => Unit
  ): XTextAppend = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), appendTextPortion = js.Any.fromFunction2(appendTextPortion), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), finishParagraph = js.Any.fromFunction1(finishParagraph), finishParagraphInsert = js.Any.fromFunction2(finishParagraphInsert), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), insertTextPortion = js.Any.fromFunction3(insertTextPortion), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XTextAppend]
  }
}

