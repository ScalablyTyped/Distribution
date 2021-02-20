package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** makes it possible to access the footnotes within the context (e.g. document). */
@js.native
trait XFootnotesSupplier extends XInterface {
  
  /** @returns the footnotes settings of the document. */
  val FootnoteSettings: XPropertySet = js.native
  
  /** returns a collection of footnotes. */
  val Footnotes: XIndexAccess = js.native
  
  /** @returns the footnotes settings of the document. */
  def getFootnoteSettings(): XPropertySet = js.native
  
  /** returns a collection of footnotes. */
  def getFootnotes(): XIndexAccess = js.native
}
object XFootnotesSupplier {
  
  @scala.inline
  def apply(
    FootnoteSettings: XPropertySet,
    Footnotes: XIndexAccess,
    acquire: () => Unit,
    getFootnoteSettings: () => XPropertySet,
    getFootnotes: () => XIndexAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XFootnotesSupplier = {
    val __obj = js.Dynamic.literal(FootnoteSettings = FootnoteSettings.asInstanceOf[js.Any], Footnotes = Footnotes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getFootnoteSettings = js.Any.fromFunction0(getFootnoteSettings), getFootnotes = js.Any.fromFunction0(getFootnotes), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XFootnotesSupplier]
  }
  
  @scala.inline
  implicit class XFootnotesSupplierMutableBuilder[Self <: XFootnotesSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFootnoteSettings(value: XPropertySet): Self = StObject.set(x, "FootnoteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotes(value: XIndexAccess): Self = StObject.set(x, "Footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFootnoteSettings(value: () => XPropertySet): Self = StObject.set(x, "getFootnoteSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFootnotes(value: () => XIndexAccess): Self = StObject.set(x, "getFootnotes", js.Any.fromFunction0(value))
  }
}
