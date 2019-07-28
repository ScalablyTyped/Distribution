package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var Data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var LogicalResourceId: String
  var PhysicalResourceId: String
  var RequestId: String
  var StackId: String
}

object CloudFormationCustomResourceResponseCommon {
  @scala.inline
  def apply(
    LogicalResourceId: String,
    PhysicalResourceId: String,
    RequestId: String,
    StackId: String,
    Data: StringDictionary[js.Any] = null
  ): CloudFormationCustomResourceResponseCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId, PhysicalResourceId = PhysicalResourceId, RequestId = RequestId, StackId = StackId)
    if (Data != null) __obj.updateDynamic("Data")(Data)
    __obj.asInstanceOf[CloudFormationCustomResourceResponseCommon]
  }
}

