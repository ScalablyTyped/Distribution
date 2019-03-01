package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceUpdateEvent
  extends CloudFormationCustomResourceEventCommon
     with CloudFormationCustomResourceEvent {
  var OldResourceProperties: org.scalablytyped.runtime.StringDictionary[js.Any]
  var PhysicalResourceId: java.lang.String
  var RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Update
}

object CloudFormationCustomResourceUpdateEvent {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    OldResourceProperties: org.scalablytyped.runtime.StringDictionary[js.Any],
    PhysicalResourceId: java.lang.String,
    RequestId: java.lang.String,
    RequestType: awsDashLambdaLib.awsDashLambdaLibStrings.Update,
    ResourceProperties: awsDashLambdaLib.Anon_Key,
    ResourceType: java.lang.String,
    ResponseURL: java.lang.String,
    ServiceToken: java.lang.String,
    StackId: java.lang.String
  ): CloudFormationCustomResourceUpdateEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LogicalResourceId")(LogicalResourceId)
    __obj.updateDynamic("OldResourceProperties")(OldResourceProperties)
    __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    __obj.updateDynamic("RequestId")(RequestId)
    __obj.updateDynamic("RequestType")(RequestType)
    __obj.updateDynamic("ResourceProperties")(ResourceProperties)
    __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.updateDynamic("ResponseURL")(ResponseURL)
    __obj.updateDynamic("ServiceToken")(ServiceToken)
    __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CloudFormationCustomResourceUpdateEvent]
  }
}

