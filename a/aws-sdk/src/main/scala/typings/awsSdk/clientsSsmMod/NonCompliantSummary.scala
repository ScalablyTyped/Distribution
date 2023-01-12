package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonCompliantSummary extends StObject {
  
  /**
    * The total number of compliance items that aren't compliant.
    */
  var NonCompliantCount: js.UndefOr[ComplianceSummaryCount] = js.undefined
  
  /**
    * A summary of the non-compliance severity by compliance type
    */
  var SeveritySummary: js.UndefOr[typings.awsSdk.clientsSsmMod.SeveritySummary] = js.undefined
}
object NonCompliantSummary {
  
  inline def apply(): NonCompliantSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NonCompliantSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonCompliantSummary] (val x: Self) extends AnyVal {
    
    inline def setNonCompliantCount(value: ComplianceSummaryCount): Self = StObject.set(x, "NonCompliantCount", value.asInstanceOf[js.Any])
    
    inline def setNonCompliantCountUndefined: Self = StObject.set(x, "NonCompliantCount", js.undefined)
    
    inline def setSeveritySummary(value: SeveritySummary): Self = StObject.set(x, "SeveritySummary", value.asInstanceOf[js.Any])
    
    inline def setSeveritySummaryUndefined: Self = StObject.set(x, "SeveritySummary", js.undefined)
  }
}
