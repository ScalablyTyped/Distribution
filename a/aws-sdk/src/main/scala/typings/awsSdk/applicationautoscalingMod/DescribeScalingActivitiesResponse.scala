package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingActivitiesResponse extends StObject {
  
  /**
    * The token required to get the next set of results. This value is null if there are no more results to return.
    */
  var NextToken: js.UndefOr[XmlString] = js.native
  
  /**
    * A list of scaling activity objects.
    */
  var ScalingActivities: js.UndefOr[typings.awsSdk.applicationautoscalingMod.ScalingActivities] = js.native
}
object DescribeScalingActivitiesResponse {
  
  @scala.inline
  def apply(): DescribeScalingActivitiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingActivitiesResponse]
  }
  
  @scala.inline
  implicit class DescribeScalingActivitiesResponseMutableBuilder[Self <: DescribeScalingActivitiesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: XmlString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalingActivities(value: ScalingActivities): Self = StObject.set(x, "ScalingActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingActivitiesUndefined: Self = StObject.set(x, "ScalingActivities", js.undefined)
    
    @scala.inline
    def setScalingActivitiesVarargs(value: ScalingActivity*): Self = StObject.set(x, "ScalingActivities", js.Array(value :_*))
  }
}
