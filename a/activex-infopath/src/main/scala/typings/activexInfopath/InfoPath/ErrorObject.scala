package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ErrorObject extends js.Object {
  
  val ConditionName: js.Any = js.native
  
  var DetailedErrorMessage: String = js.native
  
  var ErrorCode: Double = js.native
  
  @JSName("InfoPath.ErrorObject_typekey")
  var InfoPathDotErrorObject_typekey: ErrorObject = js.native
  
  val Node: IXMLDOMNode = js.native
  
  var ShortErrorMessage: String = js.native
  
  val Type: String = js.native
}
object ErrorObject {
  
  @scala.inline
  def apply(
    ConditionName: js.Any,
    DetailedErrorMessage: String,
    ErrorCode: Double,
    InfoPathDotErrorObject_typekey: ErrorObject,
    Node: IXMLDOMNode,
    ShortErrorMessage: String,
    Type: String
  ): ErrorObject = {
    val __obj = js.Dynamic.literal(ConditionName = ConditionName.asInstanceOf[js.Any], DetailedErrorMessage = DetailedErrorMessage.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], ShortErrorMessage = ShortErrorMessage.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.ErrorObject_typekey")(InfoPathDotErrorObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorObject]
  }
  
  @scala.inline
  implicit class ErrorObjectOps[Self <: ErrorObject] (val x: Self) extends AnyVal {
    
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
    def setConditionName(value: js.Any): Self = this.set("ConditionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedErrorMessage(value: String): Self = this.set("DetailedErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoPathDotErrorObject_typekey(value: ErrorObject): Self = this.set("InfoPath.ErrorObject_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: IXMLDOMNode): Self = this.set("Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortErrorMessage(value: String): Self = this.set("ShortErrorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
