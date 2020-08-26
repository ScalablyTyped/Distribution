package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This service specifies a footnote or an endnote in a {@link TextDocument} . */
@js.native
trait Footnote
  extends XFootnote
     with XText {
  /**
    * contains an internal identifier for the use as SequenceNumber property in reference fields.
    * @see com.sun.star.text.textfield.GetReference.
    */
  var ReferenceId: Double = js.native
}

object Footnote {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    End: XTextRange,
    Label: String,
    ReferenceId: Double,
    Start: XTextRange,
    String: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    createTextCursor: () => XTextCursor,
    createTextCursorByRange: XTextRange => XTextCursor,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getEnd: () => XTextRange,
    getLabel: () => String,
    getStart: () => XTextRange,
    getString: () => String,
    getText: () => XText,
    insertControlCharacter: (XTextRange, Double, Boolean) => Unit,
    insertString: (XTextRange, String, Boolean) => Unit,
    insertTextContent: (XTextRange, XTextContent, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    removeTextContent: XTextContent => Unit,
    setLabel: String => Unit,
    setString: String => Unit
  ): Footnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], End = End.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], ReferenceId = ReferenceId.asInstanceOf[js.Any], Start = Start.asInstanceOf[js.Any], String = String.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), createTextCursor = js.Any.fromFunction0(createTextCursor), createTextCursorByRange = js.Any.fromFunction1(createTextCursorByRange), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getEnd = js.Any.fromFunction0(getEnd), getLabel = js.Any.fromFunction0(getLabel), getStart = js.Any.fromFunction0(getStart), getString = js.Any.fromFunction0(getString), getText = js.Any.fromFunction0(getText), insertControlCharacter = js.Any.fromFunction3(insertControlCharacter), insertString = js.Any.fromFunction3(insertString), insertTextContent = js.Any.fromFunction3(insertTextContent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), removeTextContent = js.Any.fromFunction1(removeTextContent), setLabel = js.Any.fromFunction1(setLabel), setString = js.Any.fromFunction1(setString))
    __obj.asInstanceOf[Footnote]
  }
  @scala.inline
  implicit class FootnoteOps[Self <: Footnote] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setReferenceId(value: Double): Self = this.set("ReferenceId", value.asInstanceOf[js.Any])
  }
  
}

