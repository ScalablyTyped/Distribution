package typings.activexInfopath.InfoPath

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParameterObject extends js.Object {
  @JSName("InfoPath.InputParameterObject_typekey")
  var InfoPathDotInputParameterObject_typekey: InputParameterObject
  val Name: String
  val Value: String
}

object InputParameterObject {
  @scala.inline
  def apply(InfoPathDotInputParameterObject_typekey: InputParameterObject, Name: String, Value: String): InputParameterObject = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("InfoPath.InputParameterObject_typekey")(InfoPathDotInputParameterObject_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParameterObject]
  }
}

