package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveEventObject extends js.Object {
  
  val FileName: String = js.native
  
  @JSName("InfoPath.SaveEventObject_typekey")
  var InfoPathDotSaveEventObject_typekey: SaveEventObject = js.native
  
  var IsCancelled: Boolean = js.native
  
  val IsSaveAs: Boolean = js.native
  
  def PerformSaveOperation(): Boolean = js.native
  
  var ReturnStatus: Boolean = js.native
  
  val XDocument: _XDocument = js.native
}
object SaveEventObject {
  
  @scala.inline
  def apply(
    FileName: String,
    InfoPathDotSaveEventObject_typekey: SaveEventObject,
    IsCancelled: Boolean,
    IsSaveAs: Boolean,
    PerformSaveOperation: () => Boolean,
    ReturnStatus: Boolean,
    XDocument: _XDocument
  ): SaveEventObject = {
    val __obj = js.Dynamic.literal(FileName = FileName.asInstanceOf[js.Any], IsCancelled = IsCancelled.asInstanceOf[js.Any], IsSaveAs = IsSaveAs.asInstanceOf[js.Any], PerformSaveOperation = js.Any.fromFunction0(PerformSaveOperation), ReturnStatus = ReturnStatus.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SaveEventObject_typekey")(InfoPathDotSaveEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveEventObject]
  }
  
  @scala.inline
  implicit class SaveEventObjectOps[Self <: SaveEventObject] (val x: Self) extends AnyVal {
    
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
    def setFileName(value: String): Self = this.set("FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSaveEventObject_typekey(value: SaveEventObject): Self = this.set("InfoPath.SaveEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelled(value: Boolean): Self = this.set("IsCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSaveAs(value: Boolean): Self = this.set("IsSaveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformSaveOperation(value: () => Boolean): Self = this.set("PerformSaveOperation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = this.set("ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
}
