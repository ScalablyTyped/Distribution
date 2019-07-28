package typings.awsDashSdk.clientsSesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptAction extends js.Object {
  /**
    * Adds a header to the received email.
    */
  var AddHeaderAction: js.UndefOr[typings.awsDashSdk.clientsSesMod.AddHeaderAction] = js.undefined
  /**
    * Rejects the received email by returning a bounce response to the sender and, optionally, publishes a notification to Amazon Simple Notification Service (Amazon SNS).
    */
  var BounceAction: js.UndefOr[typings.awsDashSdk.clientsSesMod.BounceAction] = js.undefined
  /**
    * Calls an AWS Lambda function, and optionally, publishes a notification to Amazon SNS.
    */
  var LambdaAction: js.UndefOr[typings.awsDashSdk.clientsSesMod.LambdaAction] = js.undefined
  /**
    * Saves the received message to an Amazon Simple Storage Service (Amazon S3) bucket and, optionally, publishes a notification to Amazon SNS.
    */
  var S3Action: js.UndefOr[typings.awsDashSdk.clientsSesMod.S3Action] = js.undefined
  /**
    * Publishes the email content within a notification to Amazon SNS.
    */
  var SNSAction: js.UndefOr[typings.awsDashSdk.clientsSesMod.SNSAction] = js.undefined
  /**
    * Terminates the evaluation of the receipt rule set and optionally publishes a notification to Amazon SNS.
    */
  var StopAction: js.UndefOr[typings.awsDashSdk.clientsSesMod.StopAction] = js.undefined
  /**
    * Calls Amazon WorkMail and, optionally, publishes a notification to Amazon Amazon SNS.
    */
  var WorkmailAction: js.UndefOr[typings.awsDashSdk.clientsSesMod.WorkmailAction] = js.undefined
}

object ReceiptAction {
  @scala.inline
  def apply(
    AddHeaderAction: AddHeaderAction = null,
    BounceAction: BounceAction = null,
    LambdaAction: LambdaAction = null,
    S3Action: S3Action = null,
    SNSAction: SNSAction = null,
    StopAction: StopAction = null,
    WorkmailAction: WorkmailAction = null
  ): ReceiptAction = {
    val __obj = js.Dynamic.literal()
    if (AddHeaderAction != null) __obj.updateDynamic("AddHeaderAction")(AddHeaderAction)
    if (BounceAction != null) __obj.updateDynamic("BounceAction")(BounceAction)
    if (LambdaAction != null) __obj.updateDynamic("LambdaAction")(LambdaAction)
    if (S3Action != null) __obj.updateDynamic("S3Action")(S3Action)
    if (SNSAction != null) __obj.updateDynamic("SNSAction")(SNSAction)
    if (StopAction != null) __obj.updateDynamic("StopAction")(StopAction)
    if (WorkmailAction != null) __obj.updateDynamic("WorkmailAction")(WorkmailAction)
    __obj.asInstanceOf[ReceiptAction]
  }
}

