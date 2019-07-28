package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.Anon_Key
import typings.awsDashLambda.awsDashLambdaStrings.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceUpdateEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var OldResourceProperties: StringDictionary[js.Any]
  var PhysicalResourceId: String
  var RequestType: Update
}

object CloudFormationCustomResourceUpdateEvent {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    OldResourceProperties: StringDictionary[js.Any],
    PhysicalResourceId: String,
    RequestId: String,
    RequestType: Update,
    ResourceProperties: Anon_Key,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceUpdateEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, OldResourceProperties = OldResourceProperties, PhysicalResourceId = PhysicalResourceId, RequestId = RequestId, RequestType = RequestType, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
}

