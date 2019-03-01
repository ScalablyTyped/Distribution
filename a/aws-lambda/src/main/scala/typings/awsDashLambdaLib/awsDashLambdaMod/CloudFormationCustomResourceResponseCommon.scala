package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var Data: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var LogicalResourceId: java.lang.String
  var PhysicalResourceId: java.lang.String
  var RequestId: java.lang.String
  var StackId: java.lang.String
}

object CloudFormationCustomResourceResponseCommon {
  @scala.inline
  def apply(
    LogicalResourceId: java.lang.String,
    PhysicalResourceId: java.lang.String,
    RequestId: java.lang.String,
    StackId: java.lang.String,
    Data: org.scalablytyped.runtime.StringDictionary[js.Any] = null
  ): CloudFormationCustomResourceResponseCommon = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LogicalResourceId")(LogicalResourceId)
    __obj.updateDynamic("PhysicalResourceId")(PhysicalResourceId)
    __obj.updateDynamic("RequestId")(RequestId)
    __obj.updateDynamic("StackId")(StackId)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[CloudFormationCustomResourceResponseCommon]
  }
}

