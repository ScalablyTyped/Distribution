package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
@js.native
trait XTextSection extends XTextContent {
  /** @returns all text sections that are children of this text section (recursive). */
  val ChildSections: SafeArray[XTextSection] = js.native
  /** If the object is a child section, then this method returns the parent text section. */
  val ParentSection: XTextSection = js.native
  /** @returns all text sections that are children of this text section (recursive). */
  def getChildSections(): SafeArray[XTextSection] = js.native
  /** If the object is a child section, then this method returns the parent text section. */
  def getParentSection(): XTextSection = js.native
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
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], ChildSections = ChildSections.asInstanceOf[js.Any], ParentSection = ParentSection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getChildSections = js.Any.fromFunction0(getChildSections), getParentSection = js.Any.fromFunction0(getParentSection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextSection]
  }
  @scala.inline
  implicit class XTextSectionOps[Self <: XTextSection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChildSections(value: SafeArray[XTextSection]): Self = this.set("ChildSections", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentSection(value: XTextSection): Self = this.set("ParentSection", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetChildSections(value: () => SafeArray[XTextSection]): Self = this.set("getChildSections", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentSection(value: () => XTextSection): Self = this.set("getParentSection", js.Any.fromFunction0(value))
  }
  
}

