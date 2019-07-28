package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
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
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getText: () => XText,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextFrame = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, Text = Text, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getText = js.Any.fromFunction0(getText), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XTextFrame]
  }
}

