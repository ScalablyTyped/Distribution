package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is a {@link TextRange} which is explicitly marked as an index entry for a {@link DocumentIndex} . */
trait DocumentIndexMark extends BaseIndexMark {
  /** determines if this entry is a main entry. In a document index this entry will be emphasized by assigning a character style to it. */
  var IsMainEntry: scala.Boolean
  /** contains the primary key of the index entry. It is used to build a hierarchical document index. */
  var PrimaryKey: java.lang.String
  /** contains the secondary key of the index entry. It is used to build a hierarchical document index. */
  var SecondaryKey: java.lang.String
}

object DocumentIndexMark {
  @scala.inline
  def apply(
    AlternativeText: java.lang.String,
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    IsMainEntry: scala.Boolean,
    PrimaryKey: java.lang.String,
    SecondaryKey: java.lang.String,
    TextWrap: WrapTextMode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): DocumentIndexMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AlternativeText")(AlternativeText)
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("AnchorType")(AnchorType)
    __obj.updateDynamic("AnchorTypes")(AnchorTypes)
    __obj.updateDynamic("IsMainEntry")(IsMainEntry)
    __obj.updateDynamic("PrimaryKey")(PrimaryKey)
    __obj.updateDynamic("SecondaryKey")(SecondaryKey)
    __obj.updateDynamic("TextWrap")(TextWrap)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[DocumentIndexMark]
  }
}

