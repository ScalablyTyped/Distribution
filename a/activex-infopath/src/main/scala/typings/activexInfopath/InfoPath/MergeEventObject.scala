package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeEventObject extends js.Object {
  
  val Count: Double = js.native
  
  val DOM: IXMLDOMDocument = js.native
  
  @JSName("InfoPath.MergeEventObject_typekey")
  var InfoPathDotMergeEventObject_typekey: MergeEventObject = js.native
  
  var ReturnStatus: Boolean = js.native
  
  var RollBack: Boolean = js.native
  
  val XDocument: _XDocument = js.native
  
  val index: Double = js.native
}
object MergeEventObject {
  
  @scala.inline
  def apply(
    Count: Double,
    DOM: IXMLDOMDocument,
    InfoPathDotMergeEventObject_typekey: MergeEventObject,
    ReturnStatus: Boolean,
    RollBack: Boolean,
    XDocument: _XDocument,
    index: Double
  ): MergeEventObject = {
    val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], DOM = DOM.asInstanceOf[js.Any], ReturnStatus = ReturnStatus.asInstanceOf[js.Any], RollBack = RollBack.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.MergeEventObject_typekey")(InfoPathDotMergeEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeEventObject]
  }
  
  @scala.inline
  implicit class MergeEventObjectOps[Self <: MergeEventObject] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = this.set("DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotMergeEventObject_typekey(value: MergeEventObject): Self = this.set("InfoPath.MergeEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = this.set("ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollBack(value: Boolean): Self = this.set("RollBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
  }
}
