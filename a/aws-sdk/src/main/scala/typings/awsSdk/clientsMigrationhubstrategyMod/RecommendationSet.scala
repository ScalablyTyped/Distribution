package typings.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationSet extends StObject {
  
  /**
    *  The recommended strategy. 
    */
  var strategy: js.UndefOr[Strategy] = js.undefined
  
  /**
    *  The recommended target destination. 
    */
  var targetDestination: js.UndefOr[TargetDestination] = js.undefined
  
  /**
    *  The target destination for the recommendation set. 
    */
  var transformationTool: js.UndefOr[TransformationTool] = js.undefined
}
object RecommendationSet {
  
  inline def apply(): RecommendationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSet]
  }
  
  extension [Self <: RecommendationSet](x: Self) {
    
    inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
    
    inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    
    inline def setTargetDestination(value: TargetDestination): Self = StObject.set(x, "targetDestination", value.asInstanceOf[js.Any])
    
    inline def setTargetDestinationUndefined: Self = StObject.set(x, "targetDestination", js.undefined)
    
    inline def setTransformationTool(value: TransformationTool): Self = StObject.set(x, "transformationTool", value.asInstanceOf[js.Any])
    
    inline def setTransformationToolUndefined: Self = StObject.set(x, "transformationTool", js.undefined)
  }
}
