package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a footnote or an endnote in a {@link TextDocument} . */
trait Footnote
  extends XFootnote
     with XText {
  /**
    * contains an internal identifier for the use as SequenceNumber property in reference fields.
    * @see com.sun.star.text.textfield.GetReference.
    */
  var ReferenceId: scala.Double
}

object Footnote {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    End: XTextRange,
    Label: java.lang.String,
    ReferenceId: scala.Double,
    Start: XTextRange,
    String: java.lang.String,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    createTextCursor: js.Function0[XTextCursor],
    createTextCursorByRange: js.Function1[XTextRange, XTextCursor],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getEnd: js.Function0[XTextRange],
    getLabel: js.Function0[java.lang.String],
    getStart: js.Function0[XTextRange],
    getString: js.Function0[java.lang.String],
    getText: js.Function0[XText],
    insertControlCharacter: js.Function3[XTextRange, scala.Double, scala.Boolean, scala.Unit],
    insertString: js.Function3[XTextRange, java.lang.String, scala.Boolean, scala.Unit],
    insertTextContent: js.Function3[XTextRange, XTextContent, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    removeTextContent: js.Function1[XTextContent, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit],
    setString: js.Function1[java.lang.String, scala.Unit]
  ): Footnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, End = End, Label = Label, ReferenceId = ReferenceId, Start = Start, String = String, acquire = acquire, addEventListener = addEventListener, attach = attach, createTextCursor = createTextCursor, createTextCursorByRange = createTextCursorByRange, dispose = dispose, getAnchor = getAnchor, getEnd = getEnd, getLabel = getLabel, getStart = getStart, getString = getString, getText = getText, insertControlCharacter = insertControlCharacter, insertString = insertString, insertTextContent = insertTextContent, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, removeTextContent = removeTextContent, setLabel = setLabel, setString = setString)
  
    __obj.asInstanceOf[Footnote]
  }
}

