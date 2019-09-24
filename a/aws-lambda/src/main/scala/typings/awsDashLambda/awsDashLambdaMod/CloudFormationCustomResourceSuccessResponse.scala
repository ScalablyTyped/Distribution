package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.awsDashLambdaStrings.SUCCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceSuccessResponse
  extends CloudFormationCustomResourceResponseCommon
     with CloudFormationCustomResourceResponse {
  var Reason: js.UndefOr[String] = js.undefined
  var Status: SUCCESS
}

object CloudFormationCustomResourceSuccessResponse {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    StackId: String,
    Status: SUCCESS,
    Data: StringDictionary[js.Any] = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined,
    Reason: String = null
  ): CloudFormationCustomResourceSuccessResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, RequestId = RequestId, StackId = StackId, Status = Status)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
  }
}

