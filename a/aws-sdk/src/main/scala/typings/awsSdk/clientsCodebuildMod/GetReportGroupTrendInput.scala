package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetReportGroupTrendInput extends StObject {
  
  /**
    * The number of reports to analyze. This operation always retrieves the most recent reports. If this parameter is omitted, the most recent 100 reports are analyzed.
    */
  var numOfReports: js.UndefOr[PageSize] = js.undefined
  
  /**
    * The ARN of the report group that contains the reports to analyze.
    */
  var reportGroupArn: NonEmptyString
  
  /**
    * The test report value to accumulate. This must be one of the following values:  Test reports:   DURATION  Accumulate the test run times for the specified reports.  PASS_RATE  Accumulate the percentage of tests that passed for the specified test reports.  TOTAL  Accumulate the total number of tests for the specified test reports.      Code coverage reports:   BRANCH_COVERAGE  Accumulate the branch coverage percentages for the specified test reports.  BRANCHES_COVERED  Accumulate the branches covered values for the specified test reports.  BRANCHES_MISSED  Accumulate the branches missed values for the specified test reports.  LINE_COVERAGE  Accumulate the line coverage percentages for the specified test reports.  LINES_COVERED  Accumulate the lines covered values for the specified test reports.  LINES_MISSED  Accumulate the lines not covered values for the specified test reports.    
    */
  var trendField: ReportGroupTrendFieldType
}
object GetReportGroupTrendInput {
  
  inline def apply(reportGroupArn: NonEmptyString, trendField: ReportGroupTrendFieldType): GetReportGroupTrendInput = {
    val __obj = js.Dynamic.literal(reportGroupArn = reportGroupArn.asInstanceOf[js.Any], trendField = trendField.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReportGroupTrendInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetReportGroupTrendInput] (val x: Self) extends AnyVal {
    
    inline def setNumOfReports(value: PageSize): Self = StObject.set(x, "numOfReports", value.asInstanceOf[js.Any])
    
    inline def setNumOfReportsUndefined: Self = StObject.set(x, "numOfReports", js.undefined)
    
    inline def setReportGroupArn(value: NonEmptyString): Self = StObject.set(x, "reportGroupArn", value.asInstanceOf[js.Any])
    
    inline def setTrendField(value: ReportGroupTrendFieldType): Self = StObject.set(x, "trendField", value.asInstanceOf[js.Any])
  }
}
