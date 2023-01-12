package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocReturnEventObject extends StObject {
  
  /* private */ @JSName("InfoPath.DocReturnEventObject_typekey")
  var InfoPathDotDocReturnEventObject_typekey: DocReturnEventObject
  
  var ReturnStatus: Boolean
  
  val XDocument: _XDocument
}
object DocReturnEventObject {
  
  inline def apply(
    InfoPathDotDocReturnEventObject_typekey: DocReturnEventObject,
    ReturnStatus: Boolean,
    XDocument: _XDocument
  ): DocReturnEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocReturnEventObject_typekey")(InfoPathDotDocReturnEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocReturnEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocReturnEventObject] (val x: Self) extends AnyVal {
    
    inline def setInfoPathDotDocReturnEventObject_typekey(value: DocReturnEventObject): Self = StObject.set(x, "InfoPath.DocReturnEventObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
