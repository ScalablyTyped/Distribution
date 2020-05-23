package typings.awsLambda.cloudformationCustomResourceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var Data: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var LogicalResourceId: String
  var NoEcho: js.UndefOr[Boolean] = js.undefined
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
    Data: StringDictionary[js.Any] = null,
    NoEcho: js.UndefOr[Boolean] = js.undefined
  ): CloudFormationCustomResourceResponseCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    if (Data != null) __obj.updateDynamic("Data")(Data.asInstanceOf[js.Any])
    if (!js.isUndefined(NoEcho)) __obj.updateDynamic("NoEcho")(NoEcho.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceResponseCommon]
  }
}

