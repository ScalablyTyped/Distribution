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
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    getEnd: () => XTextRange,
    getLabel: () => java.lang.String,
    getStart: () => XTextRange,
    getString: () => java.lang.String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, scala.Double, scala.Boolean) => scala.Unit,
    insertString: (XTextRange, java.lang.String, scala.Boolean) => scala.Unit,
    insertTextContent: (XTextRange, XTextContent, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeTextContent: XTextContent => scala.Unit,
    setLabel: java.lang.String => scala.Unit,
    setString: java.lang.String => scala.Unit
  ): Footnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, End = End, Label = Label, ReferenceId = ReferenceId, Start = Start, String = String, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getEnd = js.Any.fromFunction0(getEnd), getLabel = js.Any.fromFunction0(getLabel), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeTextContent = js.Any.fromFunction1(removeTextContent), setLabel = js.Any.fromFunction1(setLabel), setString = js.Any.fromFunction1(setString))
  
    __obj.asInstanceOf[Footnote]
  }
}

