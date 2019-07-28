package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XComponent
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables objects to be inserted into a text and to provide their location in a text once they are inserted into it. */
trait XTextContent extends XComponent {
  /** @returns the text range to which the content is attached.  Note: The anchor of the actual implementation for text tables does not have a position in the t */
  val Anchor: XTextRange
  /**
    * is called when this object gets embedded in a text.
    *
    * This acts like a multi-phase construction, thus the object may be invalid until it is attached to a text position. Usually this method is called from
    * within {@link XText.insertTextContent()} .
    *
    * Both text objects and text content objects may only be connected to each other if they are created by the same component. When implementing new
    * components, this behavior is deprecated.
    */
  def attach(xTextRange: XTextRange): Unit
  /** @returns the text range to which the content is attached.  Note: The anchor of the actual implementation for text tables does not have a position in the t */
  def getAnchor(): XTextRange
}

object XTextContent {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextContent = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XTextContent]
  }
}

