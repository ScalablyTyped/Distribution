package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLValidationError extends js.Object {
  
  val Application: js.Any = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  val ErrorCode: Double = js.native
  
  val Name: String = js.native
  
  val Node: CustomXMLNode = js.native
  
  @JSName("Office.CustomXMLValidationError_typekey")
  var OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError = js.native
  
  val Parent: js.Any = js.native
  
  val Text: String = js.native
  
  val Type: MsoCustomXMLValidationErrorType = js.native
}
object CustomXMLValidationError {
  
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    ErrorCode: Double,
    Name: String,
    Node: CustomXMLNode,
    OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError,
    Parent: js.Any,
    Text: String,
    Type: MsoCustomXMLValidationErrorType
  ): CustomXMLValidationError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ErrorCode = ErrorCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomXMLValidationError_typekey")(OfficeDotCustomXMLValidationError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLValidationError]
  }
  
  @scala.inline
  implicit class CustomXMLValidationErrorOps[Self <: CustomXMLValidationError] (val x: Self) extends AnyVal {
    
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCode(value: Double): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: CustomXMLNode): Self = this.set("Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomXMLValidationError_typekey(value: CustomXMLValidationError): Self = this.set("Office.CustomXMLValidationError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoCustomXMLValidationErrorType): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
}
