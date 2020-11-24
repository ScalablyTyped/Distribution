package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocContextChangeEventObject extends js.Object {
  
  val Context: IXMLDOMNode = js.native
  
  @JSName("InfoPath.DocContextChangeEventObject_typekey")
  var InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject = js.native
  
  val IsUndoRedo: Boolean = js.native
  
  val Type: String = js.native
  
  val XDocument: _XDocument = js.native
}
object DocContextChangeEventObject {
  
  @scala.inline
  def apply(
    Context: IXMLDOMNode,
    InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject,
    IsUndoRedo: Boolean,
    Type: String,
    XDocument: _XDocument
  ): DocContextChangeEventObject = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], IsUndoRedo = IsUndoRedo.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocContextChangeEventObject_typekey")(InfoPathDotDocContextChangeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocContextChangeEventObject]
  }
  
  @scala.inline
  implicit class DocContextChangeEventObjectOps[Self <: DocContextChangeEventObject] (val x: Self) extends AnyVal {
    
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
    def setContext(value: IXMLDOMNode): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotDocContextChangeEventObject_typekey(value: DocContextChangeEventObject): Self = this.set("InfoPath.DocContextChangeEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUndoRedo(value: Boolean): Self = this.set("IsUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
}
