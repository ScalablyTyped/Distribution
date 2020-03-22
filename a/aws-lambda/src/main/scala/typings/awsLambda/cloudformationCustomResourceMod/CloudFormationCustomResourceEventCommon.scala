package typings.awsLambda.cloudformationCustomResourceMod

import typings.awsLambda.AnonDictKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceEventCommon extends js.Object {
  var LogicalResourceId: String
  var RequestId: String
  var ResourceProperties: AnonDictKey
  var ResourceType: String
  var ResponseURL: String
  var ServiceToken: String
  var StackId: String
}

object CloudFormationCustomResourceEventCommon {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    RequestId: String,
    ResourceProperties: AnonDictKey,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEventCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
}

