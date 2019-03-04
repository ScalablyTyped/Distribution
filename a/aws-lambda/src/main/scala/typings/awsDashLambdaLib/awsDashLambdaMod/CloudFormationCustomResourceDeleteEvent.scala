package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceDeleteEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var PhysicalResourceId: java.lang.String
  var RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Delete
}

object CloudFormationCustomResourceDeleteEvent {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    PhysicalResourceId: java.lang.String,
    RequestId: java.lang.String,
    RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Delete,
    ResourceProperties: awsDashLambdaLib.Anon_Key,
    ResourceType: java.lang.String,
    ResponseURL: java.lang.String,
    ServiceToken: java.lang.String,
    StackId: java.lang.String
  ): CloudFormationCustomResourceDeleteEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, RequestId = RequestId, RequestType = RequestType, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceDeleteEvent]
  }
}

