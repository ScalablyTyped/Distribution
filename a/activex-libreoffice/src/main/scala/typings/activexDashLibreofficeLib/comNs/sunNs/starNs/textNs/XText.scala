package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** extends a {@link XSimpleText} by the capability of inserting XTextContents. */
trait XText extends XSimpleText {
  /**
    * inserts a content, such as a text table, text frame or text field.
    *
    * Which contents are accepted is implementation-specific. Some implementations may only accept contents which were created by the factory that supplied
    * the same text or the document which contains the text.
    * @param xRange specifies the position of insertion.
    * @param xContent the text content to be inserted.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **xConten
    */
  def insertTextContent(xRange: XTextRange, xContent: XTextContent, bAbsorb: scala.Boolean): scala.Unit
  /**
    * removes the specified content from the text object.
    * @param xContent the content that is to be removed.
    */
  def removeTextContent(xContent: XTextContent): scala.Unit
}

object XText {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: () => scala.Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    getEnd: () => XTextRange,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    insertTextContent: (XTextRange, XTextContent, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeTextContent: XTextContent => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XText = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeTextContent = js.Any.fromFunction1(removeTextContent), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XText]
  }
}

