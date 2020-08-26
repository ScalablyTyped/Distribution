package typings.awsLambda.cloudformationCustomResourceMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFormationCustomResourceResponseCommon extends js.Object {
  var Data: js.UndefOr[StringDictionary[js.Any]] = js.native
  var LogicalResourceId: String = js.native
  var NoEcho: js.UndefOr[Boolean] = js.native
  var PhysicalResourceId: String = js.native
  var RequestId: String = js.native
  var StackId: String = js.native
}

object CloudFormationCustomResourceResponseCommon {
  @scala.inline
  def apply(LogicalResourceId: String, PhysicalResourceId: String, RequestId: String, StackId: String): CloudFormationCustomResourceResponseCommon = {
    val __obj = js.Dynamic.literal(LogicalResourceId = LogicalResourceId.asInstanceOf[js.Any], PhysicalResourceId = PhysicalResourceId.asInstanceOf[js.Any], RequestId = RequestId.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFormationCustomResourceResponseCommon]
  }
  @scala.inline
  implicit class CloudFormationCustomResourceResponseCommonOps[Self <: CloudFormationCustomResourceResponseCommon] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLogicalResourceId(value: String): Self = this.set("LogicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhysicalResourceId(value: String): Self = this.set("PhysicalResourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequestId(value: String): Self = this.set("RequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[js.Any]): Self = this.set("Data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("Data", js.undefined)
    @scala.inline
    def setNoEcho(value: Boolean): Self = this.set("NoEcho", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoEcho: Self = this.set("NoEcho", js.undefined)
  }
  
}

