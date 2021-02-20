package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomXMLValidationError extends StObject {
  
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
  implicit class CustomXMLValidationErrorMutableBuilder[Self <: CustomXMLValidationError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: js.Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: CustomXMLNode): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOfficeDotCustomXMLValidationError_typekey(value: CustomXMLValidationError): Self = StObject.set(x, "Office.CustomXMLValidationError_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: MsoCustomXMLValidationErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
