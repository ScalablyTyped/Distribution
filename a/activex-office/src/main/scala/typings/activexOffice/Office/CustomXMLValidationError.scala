package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomXMLValidationError extends js.Object {
  val Application: js.Any
  val Creator: Double
  val ErrorCode: Double
  val Name: String
  val Node: CustomXMLNode
  @JSName("Office.CustomXMLValidationError_typekey")
  var OfficeDotCustomXMLValidationError_typekey: CustomXMLValidationError
  val Parent: js.Any
  val Text: String
  val Type: MsoCustomXMLValidationErrorType
  def Delete(): Unit
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
}

