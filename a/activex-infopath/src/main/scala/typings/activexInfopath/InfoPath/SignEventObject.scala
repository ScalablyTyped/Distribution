package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignEventObject extends js.Object {
  
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
  implicit class SignEventObjectOps[Self <: SignEventObject] (val x: Self) extends AnyVal {
    
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
    def setInfoPathDotSignEventObject_typekey(value: SignEventObject): Self = this.set("InfoPath.SignEventObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnStatus(value: Boolean): Self = this.set("ReturnStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedDataBlock(value: SignedDataBlockObject): Self = this.set("SignedDataBlock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXDocument(value: _XDocument): Self = this.set("XDocument", value.asInstanceOf[js.Any])
  }
}
