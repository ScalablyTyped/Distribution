package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPermissionRequest extends js.Object {
  /**
    * The action that the principal can use on the function. For example, lambda:InvokeFunction or lambda:GetFunction.
    */
  var Action: awsDashSdkLib.clientsLambdaMod.Action
  /**
    * For Alexa Smart Home functions, a token that must be supplied by the invoker.
    */
  var EventSourceToken: js.UndefOr[EventSourceToken] = js.undefined
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: awsDashSdkLib.clientsLambdaMod.FunctionName
  /**
    * The AWS service or account that invokes the function. If you specify a service, use SourceArn or SourceAccount to limit who can invoke the function through that service.
    */
  var Principal: awsDashSdkLib.clientsLambdaMod.Principal
  /**
    * Specify a version or alias to add permissions to a published version of the function.
    */
  var Qualifier: js.UndefOr[Qualifier] = js.undefined
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * For AWS services, the ID of the account that owns the resource. Use this instead of SourceArn to grant permission to resources that are owned by another account (for example, all of an account's Amazon S3 buckets). Or use it together with SourceArn to ensure that the resource is owned by the specified account. For example, an Amazon S3 bucket could be deleted by its owner and recreated by another account.
    */
  var SourceAccount: js.UndefOr[SourceOwner] = js.undefined
  /**
    * For AWS services, the ARN of the AWS resource that invokes the function. For example, an Amazon S3 bucket or Amazon SNS topic.
    */
  var SourceArn: js.UndefOr[Arn] = js.undefined
  /**
    * A statement identifier that differentiates the statement from others in the same policy.
    */
  var StatementId: awsDashSdkLib.clientsLambdaMod.StatementId
}

object AddPermissionRequest {
  @scala.inline
  def apply(
    Action: Action,
    FunctionName: FunctionName,
    Principal: Principal,
    StatementId: StatementId,
    EventSourceToken: EventSourceToken = null,
    Qualifier: Qualifier = null,
    RevisionId: String = null,
    SourceAccount: SourceOwner = null,
    SourceArn: Arn = null
  ): AddPermissionRequest = {
    val __obj = js.Dynamic.literal(Action = Action, FunctionName = FunctionName, Principal = Principal, StatementId = StatementId)
    if (EventSourceToken != null) __obj.updateDynamic("EventSourceToken")(EventSourceToken)
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (SourceAccount != null) __obj.updateDynamic("SourceAccount")(SourceAccount)
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn)
    __obj.asInstanceOf[AddPermissionRequest]
  }
}

