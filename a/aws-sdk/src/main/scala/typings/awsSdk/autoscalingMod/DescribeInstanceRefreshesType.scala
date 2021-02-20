package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceRefreshesType extends StObject {
  
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
  implicit class DescribeInstanceRefreshesTypeMutableBuilder[Self <: DescribeInstanceRefreshesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRefreshIds(value: InstanceRefreshIds): Self = StObject.set(x, "InstanceRefreshIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRefreshIdsUndefined: Self = StObject.set(x, "InstanceRefreshIds", js.undefined)
    
    @scala.inline
    def setInstanceRefreshIdsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "InstanceRefreshIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
