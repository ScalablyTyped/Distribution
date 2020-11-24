package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTCDefaultDispatch extends js.Object {
  
  def CreateEventObject(): IHTMLEventObj = js.native
  
  @JSName("MSHTML.HTCDefaultDispatch_typekey")
  var MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch = js.native
  
  val defaults: js.Any = js.native
  
  val document: js.Any = js.native
  
  val element: IHTMLElement = js.native
}
object HTCDefaultDispatch {
  
  @scala.inline
  def apply(
    CreateEventObject: () => IHTMLEventObj,
    MSHTMLDotHTCDefaultDispatch_typekey: HTCDefaultDispatch,
    defaults: js.Any,
    document: js.Any,
    element: IHTMLElement
  ): HTCDefaultDispatch = {
    val __obj = js.Dynamic.literal(CreateEventObject = js.Any.fromFunction0(CreateEventObject), defaults = defaults.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTCDefaultDispatch_typekey")(MSHTMLDotHTCDefaultDispatch_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTCDefaultDispatch]
  }
  
  @scala.inline
  implicit class HTCDefaultDispatchOps[Self <: HTCDefaultDispatch] (val x: Self) extends AnyVal {
    
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
    def setCreateEventObject(value: () => IHTMLEventObj): Self = this.set("CreateEventObject", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMSHTMLDotHTCDefaultDispatch_typekey(value: HTCDefaultDispatch): Self = this.set("MSHTML.HTCDefaultDispatch_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaults(value: js.Any): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocument(value: js.Any): Self = this.set("document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IHTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
  }
}
