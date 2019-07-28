package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link ContentIndex} . */
trait ContentIndexMark extends BaseIndexMark {
  /** contains the level into which the index mark will be inserted into the content index. */
  var Level: Double
}

object ContentIndexMark {
  @scala.inline
  def apply(
    AlternativeText: String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    Level: Double,
    TextWrap: WrapTextMode,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): ContentIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText, Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Level = Level, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[ContentIndexMark]
  }
}

