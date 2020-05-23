package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionName extends js.Object {
  var FunctionName: String
  var UserParameters: String
}

object FunctionName {
  @scala.inline
  def apply(FunctionName: String, UserParameters: String): FunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionName]
  }
}

