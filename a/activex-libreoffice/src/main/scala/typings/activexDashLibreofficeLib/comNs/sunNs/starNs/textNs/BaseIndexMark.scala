package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is a {@link TextRange} which is explicitly marked as an index entry. This is the base service of index marks for {@link DocumentIndex} , {@link
  * ContentIndex} , and {@link UserIndex} .
  */
trait BaseIndexMark extends TextContent {
  /**
    * the string that will be inserted into the corresponding index. If AlternativeText is empty then the string that is marked by the {@link TextRange} is
    * inserted into the index.
    */
  var AlternativeText: java.lang.String
}

object BaseIndexMark {
  @scala.inline
  def apply(
    AlternativeText: java.lang.String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: stdLib.SafeArray[TextContentAnchorType],
    TextWrap: WrapTextMode,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    attach: XTextRange => scala.Unit,
    dispose: () => scala.Unit,
    getAnchor: () => XTextRange,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): BaseIndexMark = {
    val __obj = js.Dynamic.literal(AlternativeText = AlternativeText, Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, TextWrap = TextWrap, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[BaseIndexMark]
  }
}

