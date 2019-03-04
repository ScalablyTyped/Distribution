package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceSuccessResponse
  extends CloudFormationCustomResourceResponseCommon
     with CloudFormationCustomResourceResponse {
  var Reason: js.UndefOr[java.lang.String] = js.undefined
  var Status: awsDashLambdaLib.awsDashLambdaLibStrings.SUCCESS
}

object CloudFormationCustomResourceSuccessResponse {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    PhysicalResourceId: java.lang.String,
    RequestId: java.lang.String,
    StackId: java.lang.String,
    Status: awsDashLambdaLib.awsDashLambdaLibStrings.SUCCESS,
    Data: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    Reason: java.lang.String = null
  ): CloudFormationCustomResourceSuccessResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, RequestId = RequestId, StackId = StackId, Status = Status)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    if (Reason != null) __obj.updateDynamic("Reason")(Reason)
    __obj.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
  }
}

