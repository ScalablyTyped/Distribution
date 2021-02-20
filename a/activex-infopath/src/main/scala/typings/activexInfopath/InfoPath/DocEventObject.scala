package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocEventObject extends StObject {
  
  @JSName("InfoPath.DocEventObject_typekey")
  var InfoPathDotDocEventObject_typekey: DocEventObject = js.native
  
  val XDocument: _XDocument = js.native
}
object DocEventObject {
  
  @scala.inline
  def apply(InfoPathDotDocEventObject_typekey: DocEventObject, XDocument: _XDocument): DocEventObject = {
    val __obj = js.Dynamic.literal(XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.DocEventObject_typekey")(InfoPathDotDocEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocEventObject]
  }
  
  @scala.inline
  implicit class DocEventObjectMutableBuilder[Self <: DocEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotDocEventObject_typekey(value: DocEventObject): Self = StObject.set(x, "InfoPath.DocEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
