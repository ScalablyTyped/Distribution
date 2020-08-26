package typings.awsLambda.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionName extends js.Object {
  var FunctionName: String = js.native
  var UserParameters: String = js.native
}

object FunctionName {
  @scala.inline
  def apply(FunctionName: String, UserParameters: String): FunctionName = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName.asInstanceOf[js.Any], UserParameters = UserParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionName]
  }
  @scala.inline
  implicit class FunctionNameOps[Self <: FunctionName] (val x: Self) extends AnyVal {
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
    def setFunctionName(value: String): Self = this.set("FunctionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserParameters(value: String): Self = this.set("UserParameters", value.asInstanceOf[js.Any])
  }
  
}

