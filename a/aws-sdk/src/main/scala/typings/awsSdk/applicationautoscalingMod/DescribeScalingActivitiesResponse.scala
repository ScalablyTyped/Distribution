package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingActivitiesResponse extends js.Object {
  
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
  implicit class DescribeScalingActivitiesResponseOps[Self <: DescribeScalingActivitiesResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: XmlString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScalingActivitiesVarargs(value: ScalingActivity*): Self = this.set("ScalingActivities", js.Array(value :_*))
    
    @scala.inline
    def setScalingActivities(value: ScalingActivities): Self = this.set("ScalingActivities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingActivities: Self = this.set("ScalingActivities", js.undefined)
  }
}
