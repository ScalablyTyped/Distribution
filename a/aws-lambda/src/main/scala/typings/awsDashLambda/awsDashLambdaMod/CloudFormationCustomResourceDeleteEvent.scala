package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Key
import typings.awsDashLambda.awsDashLambdaStrings.Delete
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceDeleteEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var PhysicalResourceId: String
  var RequestType: Delete
}

object CloudFormationCustomResourceDeleteEvent {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    RequestType: Delete,
    ResourceProperties: Anon_Key,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceDeleteEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, RequestId = RequestId, RequestType = RequestType, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceDeleteEvent]
  }
}

