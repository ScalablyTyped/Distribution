package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingPlansRequest extends js.Object {
  
  /**
    * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
    */
  var ApplicationSources: js.UndefOr[typings.awsSdk.autoscalingplansMod.ApplicationSources] = js.native
  
  /**
    * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.autoscalingplansMod.MaxResults] = js.native
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.autoscalingplansMod.NextToken] = js.native
  
  /**
    * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
    */
  var ScalingPlanNames: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlanNames] = js.native
  
  /**
    * The version number of the scaling plan. If you specify a scaling plan version, you must also specify a scaling plan name.
    */
  var ScalingPlanVersion: js.UndefOr[typings.awsSdk.autoscalingplansMod.ScalingPlanVersion] = js.native
}
object DescribeScalingPlansRequest {
  
  @scala.inline
  def apply(): DescribeScalingPlansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlansRequest]
  }
  
  @scala.inline
  implicit class DescribeScalingPlansRequestOps[Self <: DescribeScalingPlansRequest] (val x: Self) extends AnyVal {
    
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
    def setApplicationSourcesVarargs(value: ApplicationSource*): Self = this.set("ApplicationSources", js.Array(value :_*))
    
    @scala.inline
    def setApplicationSources(value: ApplicationSources): Self = this.set("ApplicationSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationSources: Self = this.set("ApplicationSources", js.undefined)
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScalingPlanNamesVarargs(value: ScalingPlanName*): Self = this.set("ScalingPlanNames", js.Array(value :_*))
    
    @scala.inline
    def setScalingPlanNames(value: ScalingPlanNames): Self = this.set("ScalingPlanNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingPlanNames: Self = this.set("ScalingPlanNames", js.undefined)
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = this.set("ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScalingPlanVersion: Self = this.set("ScalingPlanVersion", js.undefined)
  }
}
