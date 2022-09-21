package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provide special data of a {@link TextSection} .
  * @see TextSection
  */
trait XTextSection
  extends StObject
     with XTextContent {
  
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
  
  inline def apply(
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
    queryInterface: `type` => Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): XTextSection = {
    val __obj = js.Dynamic.literal(Anchor = Anchor.asInstanceOf[js.Any], ChildSections = ChildSections.asInstanceOf[js.Any], ParentSection = ParentSection.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), attach = js.Any.fromFunction1(attach), dispose = js.Any.fromFunction0(dispose), getAnchor = js.Any.fromFunction0(getAnchor), getChildSections = js.Any.fromFunction0(getChildSections), getParentSection = js.Any.fromFunction0(getParentSection), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[XTextSection]
  }
  
  extension [Self <: XTextSection](x: Self) {
    
    inline def setChildSections(value: SafeArray[XTextSection]): Self = StObject.set(x, "ChildSections", value.asInstanceOf[js.Any])
    
    inline def setGetChildSections(value: () => SafeArray[XTextSection]): Self = StObject.set(x, "getChildSections", js.Any.fromFunction0(value))
    
    inline def setGetParentSection(value: () => XTextSection): Self = StObject.set(x, "getParentSection", js.Any.fromFunction0(value))
    
    inline def setParentSection(value: XTextSection): Self = StObject.set(x, "ParentSection", value.asInstanceOf[js.Any])
  }
}
