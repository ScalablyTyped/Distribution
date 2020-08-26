package typings.awsLambda.cloudformationCustomResourceMod

import typings.awsLambda.awsLambdaStrings.SUCCESS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceSuccessResponse
  extends CloudFormationCustomResourceResponseCommon
     with CloudFormationCustomResourceResponse {
  var Reason: js.UndefOr[String] = js.native
  var Status: SUCCESS = js.native
}

object CloudFormationCustomResourceSuccessResponse {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    StackId: String,
    Status: SUCCESS
  ): CloudFormationCustomResourceSuccessResponse = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceSuccessResponse]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceSuccessResponseOps[Self <: CloudFormationCustomResourceSuccessResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStatus(value: SUCCESS): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: String): Self = this.set("Reason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReason: Self = this.set("Reason", js.undefined)
  }
  
}

