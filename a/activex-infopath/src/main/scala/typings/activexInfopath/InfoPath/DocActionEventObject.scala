package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocActionEventObject extends StObject {
  
  /* private */ @JSName("InfoPath.DocActionEventObject_typekey")
  var InfoPathDotDocActionEventObject_typekey: DocActionEventObject
  
  var ReturnStatus: Boolean
  
  val Source: IXMLDOMNode
  
  val XDocument: _XDocument
}
object DocActionEventObject {
  
  inline def apply(
    InfoPathDotDocActionEventObject_typekey: DocActionEventObject,
    ReturnStatus: Boolean,
    Source: IXMLDOMNode,
    XDocument: _XDocument
  ): DocActionEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocActionEventObject_typekey")(InfoPathDotDocActionEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocActionEventObject]
  }
  
  extension [Self <: DocActionEventObject](x: Self) {
    
    inline def setInfoPathDotDocActionEventObject_typekey(value: DocActionEventObject): Self = StObject.set(x, "InfoPath.DocActionEventObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IXMLDOMNode): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
