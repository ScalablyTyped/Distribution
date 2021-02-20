package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMDocument
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergeEventObject extends StObject {
  
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
  implicit class MergeEventObjectMutableBuilder[Self <: MergeEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDOM(value: IXMLDOMDocument): Self = StObject.set(x, "DOM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotMergeEventObject_typekey(value: MergeEventObject): Self = StObject.set(x, "InfoPath.MergeEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollBack(value: Boolean): Self = StObject.set(x, "RollBack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
