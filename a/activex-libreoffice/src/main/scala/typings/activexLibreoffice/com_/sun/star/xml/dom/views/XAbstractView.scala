package typings.activexLibreoffice.com_.sun.star.xml.dom.views

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XAbstractView extends XInterface {
  
  val Document: XDocumentView = js.native
  
  def getDocument(): XDocumentView = js.native
}
object XAbstractView {
  
  @scala.inline
  def apply(
    Document: XDocumentView,
    acquire: () => Unit,
    getDocument: () => XDocumentView,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAbstractView = {
    val __obj = js.Dynamic.literal(Document = Document.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getDocument = js.Any.fromFunction0(getDocument), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XAbstractView]
  }
  
  @scala.inline
  implicit class XAbstractViewOps[Self <: XAbstractView] (val x: Self) extends AnyVal {
    
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
    def setDocument(value: XDocumentView): Self = this.set("Document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDocument(value: () => XDocumentView): Self = this.set("getDocument", js.Any.fromFunction0(value))
  }
}
