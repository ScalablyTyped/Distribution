package typings.awsSdk.autoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeScalingPlansRequest extends StObject {
  
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
  implicit class DescribeScalingPlansRequestMutableBuilder[Self <: DescribeScalingPlansRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplicationSources(value: ApplicationSources): Self = StObject.set(x, "ApplicationSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplicationSourcesUndefined: Self = StObject.set(x, "ApplicationSources", js.undefined)
    
    @scala.inline
    def setApplicationSourcesVarargs(value: ApplicationSource*): Self = StObject.set(x, "ApplicationSources", js.Array(value :_*))
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScalingPlanNames(value: ScalingPlanNames): Self = StObject.set(x, "ScalingPlanNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanNamesUndefined: Self = StObject.set(x, "ScalingPlanNames", js.undefined)
    
    @scala.inline
    def setScalingPlanNamesVarargs(value: ScalingPlanName*): Self = StObject.set(x, "ScalingPlanNames", js.Array(value :_*))
    
    @scala.inline
    def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalingPlanVersionUndefined: Self = StObject.set(x, "ScalingPlanVersion", js.undefined)
  }
}
