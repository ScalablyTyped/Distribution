package typings.appletvjs.AppleTVJS

import typings.std.Document
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuBarDocument extends js.Object {
  
  /**
    * Retrieves the document associated with the specified menu item.
    * */
  def getDocument(menuItem: Element): Document = js.native
  
  /**
    * Associates a document with a menu item.
    * */
  def setDocument(document: Document, menuItem: Element): Unit = js.native
  
  /**
    * Sets the focus in a menu bar to the specified menu item.
    * */
  def setSelectedItem(menuItem: Element): Unit = js.native
}
object MenuBarDocument {
  
  @scala.inline
  def apply(
    getDocument: Element => Document,
    setDocument: (Document, Element) => Unit,
    setSelectedItem: Element => Unit
  ): MenuBarDocument = {
    val __obj = js.Dynamic.literal(getDocument = js.Any.fromFunction1(getDocument), setDocument = js.Any.fromFunction2(setDocument), setSelectedItem = js.Any.fromFunction1(setSelectedItem))
    __obj.asInstanceOf[MenuBarDocument]
  }
  
  @scala.inline
  implicit class MenuBarDocumentOps[Self <: MenuBarDocument] (val x: Self) extends AnyVal {
    
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
    def setGetDocument(value: Element => Document): Self = this.set("getDocument", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDocument(value: (Document, Element) => Unit): Self = this.set("setDocument", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetSelectedItem(value: Element => Unit): Self = this.set("setSelectedItem", js.Any.fromFunction1(value))
  }
}
