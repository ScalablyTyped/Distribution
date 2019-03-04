package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceFailedResponse
  extends CloudFormationCustomResourceResponseCommon
     with CloudFormationCustomResourceResponse {
  var Reason: java.lang.String
  var Status: awsDashLambdaLib.awsDashLambdaLibStrings.FAILED
}

object CloudFormationCustomResourceFailedResponse {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    PhysicalResourceId: java.lang.String,
    Reason: java.lang.String,
    RequestId: java.lang.String,
    StackId: java.lang.String,
    Status: awsDashLambdaLib.awsDashLambdaLibStrings.FAILED,
    Data: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): CloudFormationCustomResourceFailedResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, Reason = Reason, RequestId = RequestId, StackId = StackId, Status = Status)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[CloudFormationCustomResourceFailedResponse]
  }
}

