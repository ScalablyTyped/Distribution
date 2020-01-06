package typings.awsDashSdk.clientsAppsyncMod

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
  def apply(lambdaConflictHandlerArn: String = null): LambdaConflictHandlerConfig = {
    val __obj = js.Dynamic.literal()
    if (lambdaConflictHandlerArn != null) __obj.updateDynamic("lambdaConflictHandlerArn")(lambdaConflictHandlerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaConflictHandlerConfig]
  }
}

