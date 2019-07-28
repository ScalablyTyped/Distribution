package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemovePermissionRequest extends js.Object {
  /**
    * The name of the Lambda function, version, or alias.  Name formats     Function name - my-function (name-only), my-function:v1 (with alias).    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   You can append a version number or alias to any of the formats. The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsDashSdk.clientsLambdaMod.FunctionName
  /**
    * Specify a version or alias to remove permissions from a published version of the function.
    */
  var Qualifier: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Qualifier] = js.undefined
  /**
    * Only update the policy if the revision ID matches the ID that's specified. Use this option to avoid modifying a policy that has changed since you last read it.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * Statement ID of the permission to remove.
    */
  var StatementId: NamespacedStatementId
}

object RemovePermissionRequest {
  @scala.inline
  def apply(
    FunctionName: FunctionName,
    StatementId: NamespacedStatementId,
    Qualifier: Qualifier = null,
    RevisionId: String = null
  ): RemovePermissionRequest = {
    val __obj = js.Dynamic.literal(FunctionName = FunctionName, StatementId = StatementId)
    if (Qualifier != null) __obj.updateDynamic("Qualifier")(Qualifier)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    __obj.asInstanceOf[RemovePermissionRequest]
  }
}

