package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAutoScalingInstancesType extends js.Object {
  
  /**
    * The IDs of the instances. You can specify up to MaxRecords IDs. If you omit this parameter, all Auto Scaling instances are described. If you specify an ID that does not exist, it is ignored with no error.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceIds] = js.native
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 50.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.native
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}
object DescribeAutoScalingInstancesType {
  
  @scala.inline
  def apply(): DescribeAutoScalingInstancesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoScalingInstancesType]
  }
  
  @scala.inline
  implicit class DescribeAutoScalingInstancesTypeOps[Self <: DescribeAutoScalingInstancesType] (val x: Self) extends AnyVal {
    
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
    def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = this.set("InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = this.set("InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceIds: Self = this.set("InstanceIds", js.undefined)
    
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
