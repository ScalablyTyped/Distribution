package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionName extends js.Object {
  var FunctionName: String
  var UserParameters: String
}

object Anon_FunctionName {
  @scala.inline
  def apply(FunctionName: String, UserParameters: String): Anon_FunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_FunctionName]
  }
}

