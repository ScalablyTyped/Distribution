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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("End")(End)
    __obj.updateDynamic("Label")(Label)
    __obj.updateDynamic("ReferenceId")(ReferenceId)
    __obj.updateDynamic("Start")(Start)
    __obj.updateDynamic("String")(String)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("createTextCursor")(createTextCursor)
    __obj.updateDynamic("createTextCursorByRange")(createTextCursorByRange)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getEnd")(getEnd)
    __obj.updateDynamic("getLabel")(getLabel)
    __obj.updateDynamic("getStart")(getStart)
    __obj.updateDynamic("getString")(getString)
    __obj.updateDynamic("getText")(getText)
    __obj.updateDynamic("insertControlCharacter")(insertControlCharacter)
    __obj.updateDynamic("insertString")(insertString)
    __obj.updateDynamic("insertTextContent")(insertTextContent)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.updateDynamic("removeTextContent")(removeTextContent)
    __obj.updateDynamic("setLabel")(setLabel)
    __obj.updateDynamic("setString")(setString)
    __obj.asInstanceOf[Footnote]
  }
}

