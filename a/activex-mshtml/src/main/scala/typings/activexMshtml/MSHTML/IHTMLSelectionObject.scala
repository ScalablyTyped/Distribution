package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLSelectionObject extends js.Object {
  
  @JSName("MSHTML.IHTMLSelectionObject_typekey")
  var MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject = js.native
  
  def clear(): Unit = js.native
  
  def createRange(): js.Any = js.native
  
  def empty(): Unit = js.native
  
  val `type`: String = js.native
}
object IHTMLSelectionObject {
  
  @scala.inline
  def apply(
    MSHTMLDotIHTMLSelectionObject_typekey: IHTMLSelectionObject,
    clear: () => Unit,
    createRange: () => js.Any,
    empty: () => Unit,
    `type`: String
  ): IHTMLSelectionObject = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), createRange = js.Any.fromFunction0(createRange), empty = js.Any.fromFunction0(empty))
    __obj.updateDynamic("MSHTML.IHTMLSelectionObject_typekey")(MSHTMLDotIHTMLSelectionObject_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLSelectionObject]
  }
  
  @scala.inline
  implicit class IHTMLSelectionObjectOps[Self <: IHTMLSelectionObject] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLSelectionObject_typekey(value: IHTMLSelectionObject): Self = this.set("MSHTML.IHTMLSelectionObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClear(value: () => Unit): Self = this.set("clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCreateRange(value: () => js.Any): Self = this.set("createRange", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEmpty(value: () => Unit): Self = this.set("empty", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
