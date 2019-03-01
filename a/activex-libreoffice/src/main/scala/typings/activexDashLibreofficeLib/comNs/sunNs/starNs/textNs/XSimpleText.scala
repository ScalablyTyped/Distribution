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
    acquire: js.Function0[scala.Unit],
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XSimpleText = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createTextCursor")(createTextCursor)
    __obj.updateDynamic("createTextCursorByRange")(createTextCursorByRange)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("insertControlCharacter")(insertControlCharacter)
    __obj.updateDynamic("insertString")(insertString)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setString")(setString)
    __obj.asInstanceOf[XSimpleText]
  }
}

