package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInstanceRefreshesAnswer extends StObject {
  
  /**
    * The instance refreshes for the specified group, sorted by creation timestamp in descending order.
    */
  var InstanceRefreshes: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceRefreshes] = js.undefined
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.undefined
}
object DescribeInstanceRefreshesAnswer {
  
  inline def apply(): DescribeInstanceRefreshesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceRefreshesAnswer]
  }
  
  extension [Self <: DescribeInstanceRefreshesAnswer](x: Self) {
    
    inline def setInstanceRefreshes(value: InstanceRefreshes): Self = StObject.set(x, "InstanceRefreshes", value.asInstanceOf[js.Any])
    
    inline def setInstanceRefreshesUndefined: Self = StObject.set(x, "InstanceRefreshes", js.undefined)
    
    inline def setInstanceRefreshesVarargs(value: InstanceRefresh*): Self = StObject.set(x, "InstanceRefreshes", js.Array(value*))
    
    inline def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
