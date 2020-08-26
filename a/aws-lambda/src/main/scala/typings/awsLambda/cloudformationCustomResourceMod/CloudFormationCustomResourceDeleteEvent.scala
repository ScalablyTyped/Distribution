package typings.awsLambda.cloudformationCustomResourceMod

import typings.awsLambda.anon.DictKey
import typings.awsLambda.awsLambdaStrings.Delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceDeleteEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var PhysicalResourceId: String = js.native
  var RequestType: Delete = js.native
}

object CloudFormationCustomResourceDeleteEvent {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    RequestType: Delete,
    ResourceProperties: DictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceDeleteEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceDeleteEvent]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceDeleteEventOps[Self <: CloudFormationCustomResourceDeleteEvent] (val x: Self) extends AnyVal {
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
    def setPhysicalResourceId(value: String): Self = this.set("PhysicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestType(value: Delete): Self = this.set("RequestType", value.asInstanceOf[js.Any])
  }
  
}

