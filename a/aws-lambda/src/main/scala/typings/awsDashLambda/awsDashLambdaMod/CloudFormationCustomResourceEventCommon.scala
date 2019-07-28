package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceEventCommon extends js.Object {
  var LogicalResourceId: String
  var RequestId: String
  var ResourceProperties: Anon_Key
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
    ResourceProperties: Anon_Key,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceEventCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, RequestId = RequestId, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
}

