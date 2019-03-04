package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to a text block in a group of an {@link AutoTextContainer} .
  * @see com.sun.star.text.AutoTextContainer
  * @see com.sun.star.text.AutoTextGroup
  */
trait AutoTextEntry
  extends XText
     with XAutoTextEntry

object AutoTextEntry {
  @scala.inline
  def apply(
    End: XTextRange,
    Start: XTextRange,
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    applyTo: js.Function1[XTextRange, scala.Unit],
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
  ): AutoTextEntry = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, applyTo = applyTo, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, queryInterface = queryInterface, release = release, removeTextContent = removeTextContent, setString = setString)
  
    __obj.asInstanceOf[AutoTextEntry]
  }
}

