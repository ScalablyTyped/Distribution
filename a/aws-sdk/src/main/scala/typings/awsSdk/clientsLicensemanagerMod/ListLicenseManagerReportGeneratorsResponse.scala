package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLicenseManagerReportGeneratorsResponse extends StObject {
  
  /**
    * Token for the next set of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A report generator that creates periodic reports about your license configurations.
    */
  var ReportGenerators: js.UndefOr[ReportGeneratorList] = js.undefined
}
object ListLicenseManagerReportGeneratorsResponse {
  
  inline def apply(): ListLicenseManagerReportGeneratorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLicenseManagerReportGeneratorsResponse]
  }
  
  extension [Self <: ListLicenseManagerReportGeneratorsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setReportGenerators(value: ReportGeneratorList): Self = StObject.set(x, "ReportGenerators", value.asInstanceOf[js.Any])
    
    inline def setReportGeneratorsUndefined: Self = StObject.set(x, "ReportGenerators", js.undefined)
    
    inline def setReportGeneratorsVarargs(value: ReportGenerator*): Self = StObject.set(x, "ReportGenerators", js.Array(value*))
  }
}
