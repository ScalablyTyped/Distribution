package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocContextChangeEventObject extends StObject {
  
  val Context: IXMLDOMNode
  
  /* private */ @JSName("InfoPath.DocContextChangeEventObject_typekey")
  var InfoPathDotDocContextChangeEventObject_typekey: DocContextChangeEventObject
  
  val IsUndoRedo: Boolean
  
  val Type: String
  
  val XDocument: _XDocument
}
object DocContextChangeEventObject {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DocContextChangeEventObject] (val x: Self) extends AnyVal {
    
    inline def setContext(value: IXMLDOMNode): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotDocContextChangeEventObject_typekey(value: DocContextChangeEventObject): Self = StObject.set(x, "InfoPath.DocContextChangeEventObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setIsUndoRedo(value: Boolean): Self = StObject.set(x, "IsUndoRedo", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
