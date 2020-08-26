package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a text block in a group of an {@link AutoTextContainer} .
  * @see com.sun.star.text.AutoTextContainer
  * @see com.sun.star.text.AutoTextGroup
  */
@js.native
trait AutoTextEntry
  extends XText
     with XAutoTextEntry

object AutoTextEntry {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    applyTo: XTextRange => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeTextContent: XTextContent => Unit,
    setString: String => Unit
  ): AutoTextEntry = {
    val __obj = js.Dynamic.literal(End = End.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), applyTo = js.Any.fromFunction1(applyTo), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[AutoTextEntry]
  }
}

