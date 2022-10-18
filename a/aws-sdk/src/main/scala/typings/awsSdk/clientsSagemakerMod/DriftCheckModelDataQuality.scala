package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DriftCheckModelDataQuality extends StObject {
  
  /**
    * The drift check model data quality constraints.
    */
  var Constraints: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * The drift check model data quality statistics.
    */
  var Statistics: js.UndefOr[MetricsSource] = js.undefined
}
object DriftCheckModelDataQuality {
  
  inline def apply(): DriftCheckModelDataQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriftCheckModelDataQuality]
  }
  
  extension [Self <: DriftCheckModelDataQuality](x: Self) {
    
    inline def setConstraints(value: MetricsSource): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setStatistics(value: MetricsSource): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
  }
}
