package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverageReportSummary extends StObject {
  
  /**
    * The percentage of branches that are covered by your tests.
    */
  var branchCoveragePercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The number of conditional branches that are covered by your tests.
    */
  var branchesCovered: js.UndefOr[NonNegativeInt] = js.undefined
  
  /**
    * The number of conditional branches that are not covered by your tests.
    */
  var branchesMissed: js.UndefOr[NonNegativeInt] = js.undefined
  
  /**
    * The percentage of lines that are covered by your tests.
    */
  var lineCoveragePercentage: js.UndefOr[Percentage] = js.undefined
  
  /**
    * The number of lines that are covered by your tests.
    */
  var linesCovered: js.UndefOr[NonNegativeInt] = js.undefined
  
  /**
    * The number of lines that are not covered by your tests.
    */
  var linesMissed: js.UndefOr[NonNegativeInt] = js.undefined
}
object CodeCoverageReportSummary {
  
  inline def apply(): CodeCoverageReportSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeCoverageReportSummary]
  }
  
  extension [Self <: CodeCoverageReportSummary](x: Self) {
    
    inline def setBranchCoveragePercentage(value: Percentage): Self = StObject.set(x, "branchCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setBranchCoveragePercentageUndefined: Self = StObject.set(x, "branchCoveragePercentage", js.undefined)
    
    inline def setBranchesCovered(value: NonNegativeInt): Self = StObject.set(x, "branchesCovered", value.asInstanceOf[js.Any])
    
    inline def setBranchesCoveredUndefined: Self = StObject.set(x, "branchesCovered", js.undefined)
    
    inline def setBranchesMissed(value: NonNegativeInt): Self = StObject.set(x, "branchesMissed", value.asInstanceOf[js.Any])
    
    inline def setBranchesMissedUndefined: Self = StObject.set(x, "branchesMissed", js.undefined)
    
    inline def setLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "lineCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setLineCoveragePercentageUndefined: Self = StObject.set(x, "lineCoveragePercentage", js.undefined)
    
    inline def setLinesCovered(value: NonNegativeInt): Self = StObject.set(x, "linesCovered", value.asInstanceOf[js.Any])
    
    inline def setLinesCoveredUndefined: Self = StObject.set(x, "linesCovered", js.undefined)
    
    inline def setLinesMissed(value: NonNegativeInt): Self = StObject.set(x, "linesMissed", value.asInstanceOf[js.Any])
    
    inline def setLinesMissedUndefined: Self = StObject.set(x, "linesMissed", js.undefined)
  }
}
