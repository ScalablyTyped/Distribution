package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A bookmark is a {@link TextContent} , which is like a jump target or a label. */
trait Bookmark
  extends TextContent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNamed

object Bookmark {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    AnchorType: TextContentAnchorType,
    AnchorTypes: activexDashInteropLib.SafeArray[TextContentAnchorType],
    Name: java.lang.String,
    TextWrap: WrapTextMode,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getName: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    setName: js.Function1[java.lang.String, scala.Unit]
  ): Bookmark = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, AnchorType = AnchorType, AnchorTypes = AnchorTypes, Name = Name, TextWrap = TextWrap, acquire = acquire, addEventListener = addEventListener, attach = attach, dispose = dispose, getAnchor = getAnchor, getName = getName, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener, setName = setName)
  
    __obj.asInstanceOf[Bookmark]
  }
}

