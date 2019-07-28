package typings.awsDashSdk.clientsIoteventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaAction extends js.Object {
  /**
    * The ARN of the Lambda function which is executed.
    */
  var functionArn: AmazonResourceName
}

object LambdaAction {
  @scala.inline
  def apply(functionArn: AmazonResourceName): LambdaAction = {
    val __obj = js.Dynamic.literal(functionArn = functionArn)
  
    __obj.asInstanceOf[LambdaAction]
  }
}

