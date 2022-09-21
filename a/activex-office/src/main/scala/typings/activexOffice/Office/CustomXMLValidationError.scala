package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomXMLValidationError extends StObject {
  
  val Application: Any
  
  val Creator: Double
  
  def Delete(): Unit
  
  val ErrorCode: Double
  
  val Name: String
  
  val Node: CustomXMLNode
  
  /* private */ @JSName("Office.CustomXMLValidationError_typekey")
  var OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError
  
  val Parent: Any
  
  val Text: String
  
  val Type: MsoCustomXMLValidationErrorType
}
object CustomXMLValidationError {
  
  inline def apply(
    Application: Any,
    Creator: Double,
    Delete: () => Unit,
    ErrorCode: Double,
    Name: String,
    Node: CustomXMLNode,
    OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError,
    Parent: Any,
    Text: String,
    Type: MsoCustomXMLValidationErrorType
  ): CustomXMLValidationError = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ErrorCode = ErrorCode.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.CustomXMLValidationError_typekey")(OfficeDotCustomXMLValidationError_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomXMLValidationError]
  }
  
  extension [Self <: CustomXMLValidationError](x: Self) {
    
    inline def setApplication(value: Any): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: () => Unit): Self = StObject.set(x, "Delete", js.Any.fromFunction0(value))
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNode(value: CustomXMLNode): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    inline def setOfficeDotCustomXMLValidationError_typekey(value: CustomXMLValidationError): Self = StObject.set(x, "Office.CustomXMLValidationError_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    inline def setType(value: MsoCustomXMLValidationErrorType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
