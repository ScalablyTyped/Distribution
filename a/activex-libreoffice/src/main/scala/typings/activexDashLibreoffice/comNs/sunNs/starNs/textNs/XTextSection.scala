package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
trait XTextSection extends XTextContent {
  /** @returns all text sections that are children of this text section (recursive). */
  val ChildSections: SafeArray[XTextSection]
  /** If the object is a child section, then this method returns the parent text section. */
  val ParentSection: XTextSection
  /** @returns all text sections that are children of this text section (recursive). */
  def getChildSections(): SafeArray[XTextSection]
  /** If the object is a child section, then this method returns the parent text section. */
  def getParentSection(): XTextSection
}

object XTextSection {
  @scala.inline
  def apply(
    Anchor: XTextRange,
    ChildSections: SafeArray[XTextSection],
    ParentSection: XTextSection,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    attach: XTextRange => Unit,
    dispose: () => Unit,
    getAnchor: () => XTextRange,
    getChildSections: () => SafeArray[XTextSection],
    getParentSection: () => XTextSection,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor, ChildSections = ChildSections, ParentSection = ParentSection, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getChildSections = js.Any.fromFunction0(getChildSections), getParentSection = js.Any.fromFunction0(getParentSection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[XTextSection]
  }
}

