package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFunctionName extends js.Object {
  var FunctionName: String
  var UserParameters: String
}

object AnonFunctionName {
  @scala.inline
  def apply(FunctionName: String, UserParameters: String): AnonFunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFunctionName]
  }
}

