package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelDataQuality extends StObject {
  
  /**
    * Data quality constraints for a model.
    */
  var Constraints: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * Data quality statistics for a model.
    */
  var Statistics: js.UndefOr[MetricsSource] = js.undefined
}
object ModelDataQuality {
  
  inline def apply(): ModelDataQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelDataQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelDataQuality] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: MetricsSource): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setStatistics(value: MetricsSource): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
  }
}
