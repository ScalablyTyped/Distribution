package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    appendTextPortion: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange
    ],
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    finishParagraph: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, XTextRange],
    finishParagraphInsert: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    getEnd: js.Function0[XTextRange],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    insertTextContent: js.Function3[XTextRange, XTextContent, scala.Boolean, scala.Unit],
    insertTextPortion: js.Function3[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValues, 
      XTextRange, 
      XTextRange
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTextContent: js.Function1[XTextContent, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): XTextAppend = {
    val __obj = js.Dynamic.literal(End = End, Start = Start, String = String, acquire = acquire, appendTextPortion = appendTextPortion, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, finishParagraph = finishParagraph, finishParagraphInsert = finishParagraphInsert, getEnd = getEnd, getStart = getStart, getString = getString, getText = getText, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, insertTextPortion = insertTextPortion, queryInterface = queryInterface, release = release, removeTextContent = removeTextContent, setString = setString)
  
    __obj.asInstanceOf[XTextAppend]
  }
}

