package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SaveEventObject extends StObject {
  
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
  implicit class SaveEventObjectMutableBuilder[Self <: SaveEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotSaveEventObject_typekey(value: SaveEventObject): Self = StObject.set(x, "InfoPath.SaveEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsCancelled(value: Boolean): Self = StObject.set(x, "IsCancelled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSaveAs(value: Boolean): Self = StObject.set(x, "IsSaveAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPerformSaveOperation(value: () => Boolean): Self = StObject.set(x, "PerformSaveOperation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
