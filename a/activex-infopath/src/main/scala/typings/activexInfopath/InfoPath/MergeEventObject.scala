package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergeEventObject extends StObject {
  
  val Count: Double
  
  val DOM: IXMLDOMDocument
  
  /* private */ @JSName("InfoPath.MergeEventObject_typekey")
  var InfoPathDotMergeEventObject_typekey: MergeEventObject
  
  var ReturnStatus: Boolean
  
  var RollBack: Boolean
  
  val XDocument: _XDocument
  
  val index: Double
}
object MergeEventObject {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: MergeEventObject] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setInfoPathDotMergeEventObject_typekey(value: MergeEventObject): Self = StObject.set(x, "InfoPath.MergeEventObject_typekey", value.asInstanceOf[js.Any])
    
    inline def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    inline def setRollBack(value: Boolean): Self = StObject.set(x, "RollBack", value.asInstanceOf[js.Any])
    
    inline def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
