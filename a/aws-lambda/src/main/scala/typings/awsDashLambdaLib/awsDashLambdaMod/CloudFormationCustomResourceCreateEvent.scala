package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceCreateEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Create
}

object CloudFormationCustomResourceCreateEvent {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    RequestId: java.lang.String,
    RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Create,
    ResourceProperties: awsDashLambdaLib.Anon_Key,
    ResourceType: java.lang.String,
    ResponseURL: java.lang.String,
    ServiceToken: java.lang.String,
    StackId: java.lang.String
  ): CloudFormationCustomResourceCreateEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, RequestId = RequestId, RequestType = RequestType, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceCreateEvent]
  }
}

