package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionValueContribution extends StObject {
  
  /**
    * The severity score of the value.
    */
  var ContributionScore: js.UndefOr[Score] = js.undefined
  
  /**
    * The value of the dimension.
    */
  var DimensionValue: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.DimensionValue] = js.undefined
}
object DimensionValueContribution {
  
  inline def apply(): DimensionValueContribution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValueContribution]
  }
  
  extension [Self <: DimensionValueContribution](x: Self) {
    
    inline def setContributionScore(value: Score): Self = StObject.set(x, "ContributionScore", value.asInstanceOf[js.Any])
    
    inline def setContributionScoreUndefined: Self = StObject.set(x, "ContributionScore", js.undefined)
    
    inline def setDimensionValue(value: DimensionValue): Self = StObject.set(x, "DimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "DimensionValue", js.undefined)
  }
}
