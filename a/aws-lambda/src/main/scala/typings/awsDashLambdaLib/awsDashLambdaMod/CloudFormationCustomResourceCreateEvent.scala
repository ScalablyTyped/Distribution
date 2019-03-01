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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LogicalResourceId")(LogicalResourceId)
    __obj.updateDynamic("RequestId")(RequestId)
    __obj.updateDynamic("RequestType")(RequestType)
    __obj.updateDynamic("ResourceProperties")(ResourceProperties)
    __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.updateDynamic("ResponseURL")(ResponseURL)
    __obj.updateDynamic("ServiceToken")(ServiceToken)
    __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CloudFormationCustomResourceCreateEvent]
  }
}

