package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

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
  var Label: java.lang.String
  /**
    * @returns the label of the footnote.
    * @see XFootnote.setLabel
    */
  def getLabel(): java.lang.String
  /** sets the label of the footnote. */
  def setLabel(aLabel: java.lang.String): scala.Unit
}

object XFootnote {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    Label: java.lang.String,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    getLabel: () => java.lang.String,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    setLabel: java.lang.String => scala.Unit
  ): XFootnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, Label = Label, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getLabel = js.Any.fromFunction0(getLabel), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener), setLabel = js.Any.fromFunction1(setLabel))
  
    __obj.asInstanceOf[XFootnote]
  }
}

