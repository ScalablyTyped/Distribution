package typings.activexLibreoffice.com_.sun.star.text

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
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
  implicit class XFootnotesSupplierOps[Self <: XFootnotesSupplier] (val x: Self) extends AnyVal {
    
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
    def setFootnoteSettings(value: XPropertySet): Self = this.set("FootnoteSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFootnotes(value: XIndexAccess): Self = this.set("Footnotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetFootnoteSettings(value: () => XPropertySet): Self = this.set("getFootnoteSettings", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFootnotes(value: () => XIndexAccess): Self = this.set("getFootnotes", js.Any.fromFunction0(value))
  }
}
