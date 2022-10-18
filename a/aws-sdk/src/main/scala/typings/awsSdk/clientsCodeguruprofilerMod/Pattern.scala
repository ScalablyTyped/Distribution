package typings.awsSdk.clientsCodeguruprofilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  /**
    *  A list of the different counters used to determine if there is a match. 
    */
  var countersToAggregate: js.UndefOr[Strings] = js.undefined
  
  /**
    * The description of the recommendation. This explains a potential inefficiency in a profiled application.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The universally unique identifier (UUID) of this pattern.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The name for this pattern.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *  A string that contains the steps recommended to address the potential inefficiency. 
    */
  var resolutionSteps: js.UndefOr[String] = js.undefined
  
  /**
    * A list of frame names that were searched during the analysis that generated a recommendation.
    */
  var targetFrames: js.UndefOr[TargetFrames] = js.undefined
  
  /**
    *  The percentage of time an application spends in one method that triggers a recommendation. The percentage of time is the same as the percentage of the total gathered sample counts during analysis. 
    */
  var thresholdPercent: js.UndefOr[Percentage] = js.undefined
}
object Pattern {
  
  inline def apply(): Pattern = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setCountersToAggregate(value: Strings): Self = StObject.set(x, "countersToAggregate", value.asInstanceOf[js.Any])
    
    inline def setCountersToAggregateUndefined: Self = StObject.set(x, "countersToAggregate", js.undefined)
    
    inline def setCountersToAggregateVarargs(value: String*): Self = StObject.set(x, "countersToAggregate", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setResolutionSteps(value: String): Self = StObject.set(x, "resolutionSteps", value.asInstanceOf[js.Any])
    
    inline def setResolutionStepsUndefined: Self = StObject.set(x, "resolutionSteps", js.undefined)
    
    inline def setTargetFrames(value: TargetFrames): Self = StObject.set(x, "targetFrames", value.asInstanceOf[js.Any])
    
    inline def setTargetFramesUndefined: Self = StObject.set(x, "targetFrames", js.undefined)
    
    inline def setTargetFramesVarargs(value: TargetFrame*): Self = StObject.set(x, "targetFrames", js.Array(value*))
    
    inline def setThresholdPercent(value: Percentage): Self = StObject.set(x, "thresholdPercent", value.asInstanceOf[js.Any])
    
    inline def setThresholdPercentUndefined: Self = StObject.set(x, "thresholdPercent", js.undefined)
  }
}
