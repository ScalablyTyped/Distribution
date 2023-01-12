package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceRefreshesType extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * One or more instance refresh IDs.
    */
  var InstanceRefreshIds: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.InstanceRefreshIds] = js.undefined
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeInstanceRefreshesType {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): DescribeInstanceRefreshesType = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeInstanceRefreshesType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeInstanceRefreshesType] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshIds(value: InstanceRefreshIds): Self = StObject.set(x, "InstanceRefreshIds", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshIdsUndefined: Self = StObject.set(x, "InstanceRefreshIds", js.undefined)
    
    inline def setInstanceRefreshIdsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "InstanceRefreshIds", js.Array(value*))
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
