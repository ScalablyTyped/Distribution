package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTrafficDistributionGroupResponse extends StObject {
  
  /**
    * Information about the traffic distribution group.
    */
  var TrafficDistributionGroup: js.UndefOr[typings.awsSdk.clientsConnectMod.TrafficDistributionGroup] = js.undefined
}
object DescribeTrafficDistributionGroupResponse {
  
  inline def apply(): DescribeTrafficDistributionGroupResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeTrafficDistributionGroupResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeTrafficDistributionGroupResponse] (val x: Self) extends AnyVal {
    
    inline def setTrafficDistributionGroup(value: TrafficDistributionGroup): Self = StObject.set(x, "TrafficDistributionGroup", value.asInstanceOf[js.Any])
    
    inline def setTrafficDistributionGroupUndefined: Self = StObject.set(x, "TrafficDistributionGroup", js.undefined)
  }
}
