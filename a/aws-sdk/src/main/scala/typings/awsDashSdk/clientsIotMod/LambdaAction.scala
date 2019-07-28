package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: FunctionArn
}

object LambdaAction {
  @scala.inline
  def apply(functionArn: FunctionArn): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn)
  
    __obj.asInstanceOf[LambdaAction]
  }
}

