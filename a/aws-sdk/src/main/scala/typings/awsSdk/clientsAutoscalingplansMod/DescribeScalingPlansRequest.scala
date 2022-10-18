package typings.awsSdk.clientsAutoscalingplansMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeScalingPlansRequest extends StObject {
  
  /**
    * The sources for the applications (up to 10). If you specify scaling plan names, you cannot specify application sources.
    */
  var ApplicationSources: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ApplicationSources] = js.undefined
  
  /**
    * The maximum number of scalable resources to return. This value can be between 1 and 50. The default value is 50.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.MaxResults] = js.undefined
  
  /**
    * The token for the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.NextToken] = js.undefined
  
  /**
    * The names of the scaling plans (up to 10). If you specify application sources, you cannot specify scaling plan names.
    */
  var ScalingPlanNames: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanNames] = js.undefined
  
  /**
    * The version number of the scaling plan. Currently, the only valid value is 1.  If you specify a scaling plan version, you must also specify a scaling plan name. 
    */
  var ScalingPlanVersion: js.UndefOr[typings.awsSdk.clientsAutoscalingplansMod.ScalingPlanVersion] = js.undefined
}
object DescribeScalingPlansRequest {
  
  inline def apply(): DescribeScalingPlansRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeScalingPlansRequest]
  }
  
  extension [Self <: DescribeScalingPlansRequest](x: Self) {
    
    inline def setApplicationSources(value: ApplicationSources): Self = StObject.set(x, "ApplicationSources", value.asInstanceOf[js.Any])
    
    inline def setApplicationSourcesUndefined: Self = StObject.set(x, "ApplicationSources", js.undefined)
    
    inline def setApplicationSourcesVarargs(value: ApplicationSource*): Self = StObject.set(x, "ApplicationSources", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setScalingPlanNames(value: ScalingPlanNames): Self = StObject.set(x, "ScalingPlanNames", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanNamesUndefined: Self = StObject.set(x, "ScalingPlanNames", js.undefined)
    
    inline def setScalingPlanNamesVarargs(value: ScalingPlanName*): Self = StObject.set(x, "ScalingPlanNames", js.Array(value*))
    
    inline def setScalingPlanVersion(value: ScalingPlanVersion): Self = StObject.set(x, "ScalingPlanVersion", value.asInstanceOf[js.Any])
    
    inline def setScalingPlanVersionUndefined: Self = StObject.set(x, "ScalingPlanVersion", js.undefined)
  }
}
