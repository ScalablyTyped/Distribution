package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelQuality extends StObject {
  
  /**
    * Model quality constraints.
    */
  var Constraints: js.UndefOr[MetricsSource] = js.undefined
  
  /**
    * Model quality statistics.
    */
  var Statistics: js.UndefOr[MetricsSource] = js.undefined
}
object ModelQuality {
  
  inline def apply(): ModelQuality = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelQuality]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelQuality] (val x: Self) extends AnyVal {
    
    inline def setConstraints(value: MetricsSource): Self = StObject.set(x, "Constraints", value.asInstanceOf[js.Any])
    
    inline def setConstraintsUndefined: Self = StObject.set(x, "Constraints", js.undefined)
    
    inline def setStatistics(value: MetricsSource): Self = StObject.set(x, "Statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "Statistics", js.undefined)
  }
}
