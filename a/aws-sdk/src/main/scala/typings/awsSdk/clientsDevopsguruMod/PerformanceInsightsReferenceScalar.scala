package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsReferenceScalar extends StObject {
  
  /**
    * The reference value.
    */
  var Value: js.UndefOr[PerformanceInsightsValueDouble] = js.undefined
}
object PerformanceInsightsReferenceScalar {
  
  inline def apply(): PerformanceInsightsReferenceScalar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsReferenceScalar]
  }
  
  extension [Self <: PerformanceInsightsReferenceScalar](x: Self) {
    
    inline def setValue(value: PerformanceInsightsValueDouble): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
