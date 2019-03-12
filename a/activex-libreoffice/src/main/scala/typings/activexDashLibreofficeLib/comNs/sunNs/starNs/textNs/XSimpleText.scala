package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the main interface for a distinct text unit, i.e. the main text of a document, the text for headers and footers or for single cells of a table.
  * @see XText
  */
trait XSimpleText extends XTextRange {
  /**
    * @returns a new instance of a {@link TextCursor} service which can be used to travel in the given text context.
    * @see com.sun.star.text.TextCursor
    */
  def createTextCursor(): XTextCursor
  /**
    * @param aTextPosition specifies the start position for the new {@link TextCursor} .
    * @returns a new instance of a {@link TextCursor} which is located at the specified {@link TextRange} to travel in the given text context.  The initial posi
    * @see com.sun.star.text.TextCursor
    */
  def createTextCursorByRange(aTextPosition: XTextRange): XTextCursor
  /**
    * inserts a control character (like a paragraph break or a hard space) into the text.
    * @see com.sun.star.text.ControlCharacter
    */
  def insertControlCharacter(xRange: XTextRange, nControlCharacter: scala.Double, bAbsorb: scala.Boolean): scala.Unit
  /**
    * inserts a string of characters into the text.
    *
    * The string may contain the following white spaces:
    *
    * blanktabcr (which will insert a paragraph break)lf (which will insert a line break)
    * @param xRange specifies the position of insertion. For example, {@link XSimpleText.createTextCursor()} can be used to get an {@link XTextRange} for this
    * @param aString specifies the string to insert.
    * @param bAbsorb specifies whether the text spanned by **xRange** will be replaced. If `TRUE` then the content of **xRange** will be replaced by **aString
    */
  def insertString(xRange: XTextRange, aString: java.lang.String, bAbsorb: scala.Boolean): scala.Unit
}

object XSimpleText {
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
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): XSimpleText = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), getEnd = js.Any.fromFunction0(getEnd), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[XSimpleText]
  }
}

