package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the {@link Text} of a {@link TextFrame} .
  * @see TextFrame
  */
trait XTextFrame extends XTextContent {
  /** @returns the text within this frame. The returned interface belongs to an object which implements the service {@link Text} . */
  val Text: XText
  /** @returns the text within this frame. The returned interface belongs to an object which implements the service {@link Text} . */
  def getText(): XText
}

object XTextFrame {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    Text: XText,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getText: js.Function0[XText],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XTextFrame = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, Text = Text, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getText = getText, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XTextFrame]
  }
}

