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
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getLabel: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setLabel: js.Function1[java.lang.String, scala.Unit]
  ): XFootnote = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, Label = Label, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getLabel = getLabel, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setLabel = setLabel)
  
    __obj.asInstanceOf[XFootnote]
  }
}

