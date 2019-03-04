package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceEventCommon extends js.Object {
  var LogicalResourceId: java.lang.String
  var RequestId: java.lang.String
  var ResourceProperties: awsDashLambdaLib.Anon_Key
  var ResourceType: java.lang.String
  var ResponseURL: java.lang.String
  var ServiceToken: java.lang.String
  var StackId: java.lang.String
}

object CloudFormationCustomResourceEventCommon {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    RequestId: java.lang.String,
    ResourceProperties: awsDashLambdaLib.Anon_Key,
    ResourceType: java.lang.String,
    ResponseURL: java.lang.String,
    ServiceToken: java.lang.String,
    StackId: java.lang.String
  ): CloudFormationCustomResourceEventCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, RequestId = RequestId, ResourceProperties = ResourceProperties, ResourceType = ResourceType, ResponseURL = ResponseURL, ServiceToken = ServiceToken, StackId = StackId)
  
    __obj.asInstanceOf[CloudFormationCustomResourceEventCommon]
  }
}

