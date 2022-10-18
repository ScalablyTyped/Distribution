package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompliantSummary extends StObject {
  
  /**
    * The total number of resources that are compliant.
    */
  var CompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * A summary of the compliance severity by compliance type.
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.clientsSsmMod.SeveritySummary] = js.undefined
}
object CompliantSummary {
  
  inline def apply(): CompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompliantSummary]
  }
  
  extension [Self <: CompliantSummary](x: Self) {
    
    inline def setCompliantCount(value: ComplianceSummaryCount): Self = StObject.set(x, "CompliantCount", value.asInstanceOf[js.Any])
    
    inline def setCompliantCountUndefined: Self = StObject.set(x, "CompliantCount", js.undefined)
    
    inline def setSeveritySummary(value: SeveritySummary): Self = StObject.set(x, "SeveritySummary", value.asInstanceOf[js.Any])
    
    inline def setSeveritySummaryUndefined: Self = StObject.set(x, "SeveritySummary", js.undefined)
  }
}
