package typings.awsSdk.appsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaConflictHandlerConfig extends js.Object {
  /**
    * The Arn for the Lambda function to use as the Conflict Handler.
    */
  var lambdaConflictHandlerArn: js.UndefOr[String] = js.native
}

object LambdaConflictHandlerConfig {
  @scala.inline
  def apply(): LambdaConflictHandlerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LambdaConflictHandlerConfig]
  }
  @scala.inline
  implicit class LambdaConflictHandlerConfigOps[Self <: LambdaConflictHandlerConfig] (val x: Self) extends AnyVal {
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
    def setLambdaConflictHandlerArn(value: String): Self = this.set("lambdaConflictHandlerArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLambdaConflictHandlerArn: Self = this.set("lambdaConflictHandlerArn", js.undefined)
  }
  
}

