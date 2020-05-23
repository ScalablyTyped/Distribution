package typings.activexInfopath.InfoPath

import typings.activexMsxml2.MSXML2.IXMLDOMNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorObject extends js.Object {
  val ConditionName: js.Any
  var DetailedErrorMessage: String
  var ErrorCode: Double
  @JSName("InfoPath.ErrorObject_typekey")
  var InfoPathDotErrorObject_typekey: ErrorObject
  val Node: IXMLDOMNode
  var ShortErrorMessage: String
  val Type: String
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
}

