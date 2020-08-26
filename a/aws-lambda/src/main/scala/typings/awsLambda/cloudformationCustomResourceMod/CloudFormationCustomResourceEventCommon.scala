package typings.awsLambda.cloudformationCustomResourceMod

import typings.awsLambda.anon.DictKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceEventCommon extends js.Object {
  var LogicalResourceId: String = js.native
  var RequestId: String = js.native
  var ResourceProperties: DictKey = js.native
  var ResourceType: String = js.native
  var ResponseURL: String = js.native
  var ServiceToken: String = js.native
  var StackId: String = js.native
}

object CloudFormationCustomResourceEventCommon {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    RequestId: String,
    ResourceProperties: DictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEventCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceEventCommonOps[Self <: CloudFormationCustomResourceEventCommon] (val x: Self) extends AnyVal {
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
    def setLogicalResourceId(value: String): Self = this.set("LogicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceProperties(value: DictKey): Self = this.set("ResourceProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: String): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setResponseURL(value: String): Self = this.set("ResponseURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceToken(value: String): Self = this.set("ServiceToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
  }
  
}

