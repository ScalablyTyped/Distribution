package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveEventObject extends StObject {
  
  val FileName: String
  
  /* private */ @JSName("InfoPath.SaveEventObject_typekey")
  var InfoPathDotSaveEventObject_typekey: SaveEventObject
  
  var IsCancelled: Boolean
  
  val IsSaveAs: Boolean
  
  def PerformSaveOperation(): Boolean
  
  var ReturnStatus: Boolean
  
  val XDocument: _XDocument
}
object SaveEventObject {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: SaveEventObject] (val x: Self) extends AnyVal {
    
    inline def setFileName(value: String): Self = StObject.set(x, "FileName", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotSaveEventObject_typekey(value: SaveEventObject): Self = StObject.set(x, "InfoPath.SaveEventObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsCancelled(value: Boolean): Self = StObject.set(x, "IsCancelled", value.asInstanceOf[js.Any])
    
    inline def setIsSaveAs(value: Boolean): Self = StObject.set(x, "IsSaveAs", value.asInstanceOf[js.Any])
    
    inline def setPerformSaveOperation(value: () => Boolean): Self = StObject.set(x, "PerformSaveOperation", js.Any.fromFunction0(value))
    
    inline def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
