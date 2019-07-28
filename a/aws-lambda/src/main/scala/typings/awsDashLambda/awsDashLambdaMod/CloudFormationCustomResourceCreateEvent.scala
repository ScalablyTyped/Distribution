package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Key
import typings.awsDashLambda.awsDashLambdaStrings.Create
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceCreateEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var RequestType: Create
}

object CloudFormationCustomResourceCreateEvent {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    RequestId: String,
    RequestType: Create,
    ResourceProperties: Anon_Key,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceCreateEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, RequestId = RequestId, RequestType = RequestType, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceCreateEvent]
  }
}

