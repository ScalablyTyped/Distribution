package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAutoScalingInstancesType extends StObject {
  
  /**
    * The IDs of the instances. You can specify up to MaxRecords IDs. If you omit this parameter, all Auto Scaling instances are described. If you specify an ID that does not exist, it is ignored with no error.
    */
  var InstanceIds: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceIds] = js.undefined
  
  /**
    * The maximum number of items to return with this call. The default value is 50 and the maximum value is 50.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.autoscalingMod.MaxRecords] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeAutoScalingInstancesType {
  
  @scala.inline
  def apply(): DescribeAutoScalingInstancesType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAutoScalingInstancesType]
  }
  
  @scala.inline
  implicit class DescribeAutoScalingInstancesTypeMutableBuilder[Self <: DescribeAutoScalingInstancesType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceIds(value: InstanceIds): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: XmlStringMaxLen19*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
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
