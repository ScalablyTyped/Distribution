package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link UserIndex} . */
trait UserIndexMark extends BaseIndexMark {
  /** contains the name of the user index it belongs to. */
  var UserIndexName: String
}

object UserIndexMark {
  @scala.inline
  def apply(
    AlternativeText: String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: SafeArray[TextContentAnchorType],
    TextWrap: WrapTextMode,
    UserIndexName: String,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): UserIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText, Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, TextWrap = TextWrap, UserIndexName = UserIndexName, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[UserIndexMark]
  }
}

