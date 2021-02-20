package typings.activexInfopath.InfoPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignEventObject extends StObject {
  
  @JSName("InfoPath.SignEventObject_typekey")
  var InfoPathDotSignEventObject_typekey: SignEventObject = js.native
  
  var ReturnStatus: Boolean = js.native
  
  val SignedDataBlock: SignedDataBlockObject = js.native
  
  val XDocument: _XDocument = js.native
}
object SignEventObject {
  
  @scala.inline
  def apply(
    InfoPathDotSignEventObject_typekey: SignEventObject,
    ReturnStatus: Boolean,
    SignedDataBlock: SignedDataBlockObject,
    XDocument: _XDocument
  ): SignEventObject = {
    val __obj = js.Dynamic.literal(ReturnStatus = ReturnStatus.asInstanceOf[js.Any], SignedDataBlock = SignedDataBlock.asInstanceOf[js.Any], XDocument = XDocument.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.SignEventObject_typekey")(InfoPathDotSignEventObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignEventObject]
  }
  
  @scala.inline
  implicit class SignEventObjectMutableBuilder[Self <: SignEventObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfoPathDotSignEventObject_typekey(value: SignEventObject): Self = StObject.set(x, "InfoPath.SignEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = StObject.set(x, "ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedDataBlock(value: SignedDataBlockObject): Self = StObject.set(x, "SignedDataBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = StObject.set(x, "XDocument", value.asInstanceOf[js.Any])
  }
}
