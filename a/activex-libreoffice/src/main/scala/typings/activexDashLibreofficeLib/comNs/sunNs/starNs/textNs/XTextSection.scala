package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
trait XTextSection extends XTextContent {
  /** @returns all text sections that are children of this text section (recursive). */
  val ChildSections: activexDashInteropLib.SafeArray[XTextSection]
  /** If the object is a child section, then this method returns the parent text section. */
  val ParentSection: XTextSection
  /** @returns all text sections that are children of this text section (recursive). */
  def getChildSections(): activexDashInteropLib.SafeArray[XTextSection]
  /** If the object is a child section, then this method returns the parent text section. */
  def getParentSection(): XTextSection
}

object XTextSection {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    ChildSections: activexDashInteropLib.SafeArray[XTextSection],
    ParentSection: XTextSection,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    attach: js.Function1[XTextRange, scala.Unit],
    dispose: js.Function0[scala.Unit],
    getAnchor: js.Function0[XTextRange],
    getChildSections: js.Function0[activexDashInteropLib.SafeArray[XTextSection]],
    getParentSection: js.Function0[XTextSection],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XTextSection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Anchor")(Anchor)
    __obj.updateDynamic("ChildSections")(ChildSections)
    __obj.updateDynamic("ParentSection")(ParentSection)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addEventListener")(addEventListener)
    __obj.updateDynamic("attach")(attach)
    __obj.updateDynamic("dispose")(dispose)
    __obj.updateDynamic("getAnchor")(getAnchor)
    __obj.updateDynamic("getChildSections")(getChildSections)
    __obj.updateDynamic("getParentSection")(getParentSection)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeEventListener")(removeEventListener)
    __obj.asInstanceOf[XTextSection]
  }
}

