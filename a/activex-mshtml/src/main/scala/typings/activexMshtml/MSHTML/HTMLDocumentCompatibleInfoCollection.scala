package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLDocumentCompatibleInfoCollection extends js.Object {
  
  @JSName("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey")
  var MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey: HTMLDocumentCompatibleInfoCollection = js.native
  
  val constructor: js.Any = js.native
}
object HTMLDocumentCompatibleInfoCollection {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey: HTMLDocumentCompatibleInfoCollection,
    constructor: js.Any
  ): HTMLDocumentCompatibleInfoCollection = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey")(MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDocumentCompatibleInfoCollection]
  }
  
  @scala.inline
  implicit class HTMLDocumentCompatibleInfoCollectionOps[Self <: HTMLDocumentCompatibleInfoCollection] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey(value: HTMLDocumentCompatibleInfoCollection): Self = this.set("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConstructor(value: js.Any): Self = this.set("constructor", value.asInstanceOf[js.Any])
  }
}
