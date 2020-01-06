package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaInvokeOperation extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the AWS Lambda function that the specified job will invoke for each object in the manifest.
    */
  var FunctionArn: js.UndefOr[NonEmptyMaxLength1024String] = js.native
}

object LambdaInvokeOperation {
  @scala.inline
  def apply(FunctionArn: NonEmptyMaxLength1024String = null): LambdaInvokeOperation = {
    val __obj = js.Dynamic.literal()
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaInvokeOperation]
  }
}

