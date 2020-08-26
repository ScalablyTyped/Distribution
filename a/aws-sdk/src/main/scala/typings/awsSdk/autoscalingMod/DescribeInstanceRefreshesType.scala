package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeInstanceRefreshesType extends js.Object {
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255 = js.native
  /**
    * One or more instance refresh IDs.
    */
  var InstanceRefreshIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceRefreshIds] = js.native
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}

object DescribeInstanceRefreshesType {
  @scala.inline
  def apply(AutoScalingGroupName: XmlStringMaxLen255): DescribeInstanceRefreshesType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceRefreshesType]
  }
  @scala.inline
  implicit class DescribeInstanceRefreshesTypeOps[Self <: DescribeInstanceRefreshesType] (val x: Self) extends AnyVal {
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
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstanceRefreshIdsVarargs(value: XmlStringMaxLen255*): Self = this.set("InstanceRefreshIds", js.Array(value :_*))
    @scala.inline
    def setInstanceRefreshIds(value: InstanceRefreshIds): Self = this.set("InstanceRefreshIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceRefreshIds: Self = this.set("InstanceRefreshIds", js.undefined)
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = this.set("MaxRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxRecords: Self = this.set("MaxRecords", js.undefined)
    @scala.inline
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

