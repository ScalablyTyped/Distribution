package typings
package awsDashSdkLib.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaAction extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the AWS Lambda function. An example of an AWS Lambda function ARN is arn:aws:lambda:us-west-2:account-id:function:MyFunction. For more information about AWS Lambda, see the AWS Lambda Developer Guide.
    */
  var FunctionArn: AmazonResourceName
  /**
    * The invocation type of the AWS Lambda function. An invocation type of RequestResponse means that the execution of the function will immediately result in a response, and a value of Event means that the function will be invoked asynchronously. The default value is Event. For information about AWS Lambda invocation types, see the AWS Lambda Developer Guide.  There is a 30-second timeout on RequestResponse invocations. You should use Event invocation in most cases. Use RequestResponse only when you want to make a mail flow decision, such as whether to stop the receipt rule or the receipt rule set. 
    */
  var InvocationType: js.UndefOr[InvocationType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the Lambda action is taken. An example of an Amazon SNS topic ARN is arn:aws:sns:us-west-2:123456789012:MyTopic. For more information about Amazon SNS topics, see the Amazon SNS Developer Guide.
    */
  var TopicArn: js.UndefOr[AmazonResourceName] = js.undefined
}

object LambdaAction {
  @scala.inline
  def apply(
    FunctionArn: AmazonResourceName,
    InvocationType: InvocationType = null,
    TopicArn: AmazonResourceName = null
  ): LambdaAction = {
    val __obj = js.Dynamic.literal(FunctionArn = FunctionArn)
    if (InvocationType != null) __obj.updateDynamic("InvocationType")(InvocationType.asInstanceOf[js.Any])
    if (TopicArn != null) __obj.updateDynamic("TopicArn")(TopicArn)
    __obj.asInstanceOf[LambdaAction]
  }
}

