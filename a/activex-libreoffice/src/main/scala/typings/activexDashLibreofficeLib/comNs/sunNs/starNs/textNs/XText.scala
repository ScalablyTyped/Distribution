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
    acquire: js.Function0[scala.Unit],
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    insertTextContent: js.Function3[XTextRange, XTextContent, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTextContent: js.Function1[XTextContent, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XText = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, queryInterface = queryInterface, release = release, removeTextContent = removeTextContent, setString = setString)
  
    __obj.asInstanceOf[XText]
  }
}

