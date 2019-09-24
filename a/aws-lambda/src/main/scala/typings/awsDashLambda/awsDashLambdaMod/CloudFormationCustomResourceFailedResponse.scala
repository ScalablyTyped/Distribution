package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.awsDashLambdaStrings.FAILED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceFailedResponse
  extends CloudFormationCustomResourceResponseCommon
     with CloudFormationCustomResourceResponse {
  var Reason: String
  var Status: FAILED
}

object CloudFormationCustomResourceFailedResponse {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    Reason: String,
    RequestId: String,
    StackId: String,
    Status: FAILED,
    Data: StringDictionary[js.Any] = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceFailedResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, Reason = Reason, RequestId = RequestId, StackId = StackId, Status = Status)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho)
    __obj.asInstanceOf[CloudFormationCustomResourceFailedResponse]
  }
}

