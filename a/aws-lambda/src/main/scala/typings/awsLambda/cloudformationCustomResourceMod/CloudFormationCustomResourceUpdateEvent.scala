package typings.awsLambda.cloudformationCustomResourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.AnonKeyServiceToken
import typings.awsLambda.awsLambdaStrings.Update
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
    ResourceProperties: AnonKeyServiceToken,
    ResourceType: String,
    ResponseURL: String,
    ServiceToken: String,
    StackId: String
  ): CloudFormationCustomResourceUpdateEvent = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], OldResourceProperties = OldResourceProperties.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], RequestType = RequestType.asInstanceOf[js.Any], ResourceProperties = ResourceProperties.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResponseURL = ResponseURL.asInstanceOf[js.Any], ServiceToken = ServiceToken.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
}

