package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeCoverage extends StObject {
  
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
    * The date and time that the tests were run.
    */
  var expired: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The path of the test report file.
    */
  var filePath: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the code coverage report.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
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
  
  /**
    * The ARN of the report.
    */
  var reportARN: js.UndefOr[NonEmptyString] = js.undefined
}
object CodeCoverage {
  
  inline def apply(): CodeCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeCoverage]
  }
  
  extension [Self <: CodeCoverage](x: Self) {
    
    inline def setBranchCoveragePercentage(value: Percentage): Self = StObject.set(x, "branchCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setBranchCoveragePercentageUndefined: Self = StObject.set(x, "branchCoveragePercentage", js.undefined)
    
    inline def setBranchesCovered(value: NonNegativeInt): Self = StObject.set(x, "branchesCovered", value.asInstanceOf[js.Any])
    
    inline def setBranchesCoveredUndefined: Self = StObject.set(x, "branchesCovered", js.undefined)
    
    inline def setBranchesMissed(value: NonNegativeInt): Self = StObject.set(x, "branchesMissed", value.asInstanceOf[js.Any])
    
    inline def setBranchesMissedUndefined: Self = StObject.set(x, "branchesMissed", js.undefined)
    
    inline def setExpired(value: js.Date): Self = StObject.set(x, "expired", value.asInstanceOf[js.Any])
    
    inline def setExpiredUndefined: Self = StObject.set(x, "expired", js.undefined)
    
    inline def setFilePath(value: NonEmptyString): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    inline def setFilePathUndefined: Self = StObject.set(x, "filePath", js.undefined)
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLineCoveragePercentage(value: Percentage): Self = StObject.set(x, "lineCoveragePercentage", value.asInstanceOf[js.Any])
    
    inline def setLineCoveragePercentageUndefined: Self = StObject.set(x, "lineCoveragePercentage", js.undefined)
    
    inline def setLinesCovered(value: NonNegativeInt): Self = StObject.set(x, "linesCovered", value.asInstanceOf[js.Any])
    
    inline def setLinesCoveredUndefined: Self = StObject.set(x, "linesCovered", js.undefined)
    
    inline def setLinesMissed(value: NonNegativeInt): Self = StObject.set(x, "linesMissed", value.asInstanceOf[js.Any])
    
    inline def setLinesMissedUndefined: Self = StObject.set(x, "linesMissed", js.undefined)
    
    inline def setReportARN(value: NonEmptyString): Self = StObject.set(x, "reportARN", value.asInstanceOf[js.Any])
    
    inline def setReportARNUndefined: Self = StObject.set(x, "reportARN", js.undefined)
  }
}
