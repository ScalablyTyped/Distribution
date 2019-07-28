package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a footnote within a {@link Text} .
  * @see Footnote
  */
trait XFootnote extends XTextContent {
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  var Label: String
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  def getLabel(): String
  /** sets the label of the footnote. */
  def setLabel(aLabel: String): Unit
}

object XFootnote {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    Label: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getLabel: () => String,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit,
    setLabel: String => Unit
  ): XFootnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, Label = Label, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getLabel = js.Any.fromFunction0(getLabel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[XFootnote]
  }
}

