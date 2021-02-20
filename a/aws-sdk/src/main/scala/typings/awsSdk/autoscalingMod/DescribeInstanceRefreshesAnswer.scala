package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeInstanceRefreshesAnswer extends StObject {
  
  /**
    * The instance refreshes for the specified group.
    */
  var InstanceRefreshes: js.UndefOr[typings.awsSdk.autoscalingMod.InstanceRefreshes] = js.native
  
  /**
    * A string that indicates that the response contains more items than can be returned in a single response. To receive additional items, specify this string for the NextToken value when requesting the next set of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
}
object DescribeInstanceRefreshesAnswer {
  
  @scala.inline
  def apply(): DescribeInstanceRefreshesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInstanceRefreshesAnswer]
  }
  
  @scala.inline
  implicit class DescribeInstanceRefreshesAnswerMutableBuilder[Self <: DescribeInstanceRefreshesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInstanceRefreshes(value: InstanceRefreshes): Self = StObject.set(x, "InstanceRefreshes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceRefreshesUndefined: Self = StObject.set(x, "InstanceRefreshes", js.undefined)
    
    @scala.inline
    def setInstanceRefreshesVarargs(value: InstanceRefresh*): Self = StObject.set(x, "InstanceRefreshes", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
