package typings.awsSdk.clientsDevopsguruMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceInsightsReferenceData extends StObject {
  
  /**
    * The specific reference values used to evaluate the Performance Insights. For more information, see  PerformanceInsightsReferenceComparisonValues . 
    */
  var ComparisonValues: js.UndefOr[PerformanceInsightsReferenceComparisonValues] = js.undefined
  
  /**
    * The name of the reference data.
    */
  var Name: js.UndefOr[PerformanceInsightsReferenceName] = js.undefined
}
object PerformanceInsightsReferenceData {
  
  inline def apply(): PerformanceInsightsReferenceData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PerformanceInsightsReferenceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PerformanceInsightsReferenceData] (val x: Self) extends AnyVal {
    
    inline def setComparisonValues(value: PerformanceInsightsReferenceComparisonValues): Self = StObject.set(x, "ComparisonValues", value.asInstanceOf[js.Any])
    
    inline def setComparisonValuesUndefined: Self = StObject.set(x, "ComparisonValues", js.undefined)
    
    inline def setName(value: PerformanceInsightsReferenceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
