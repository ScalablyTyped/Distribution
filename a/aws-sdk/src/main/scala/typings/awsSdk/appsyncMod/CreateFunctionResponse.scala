package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateFunctionResponse extends js.Object {
  /**
    * The Function object.
    */
  var functionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
}

object CreateFunctionResponse {
  @scala.inline
  def apply(): CreateFunctionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFunctionResponse]
  }
  @scala.inline
  implicit class CreateFunctionResponseOps[Self <: CreateFunctionResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFunctionConfiguration(value: FunctionConfiguration): Self = this.set("functionConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFunctionConfiguration: Self = this.set("functionConfiguration", js.undefined)
  }
  
}

