package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListThingRegistrationTaskReportsResponse extends StObject {
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The type of task report.
    */
  var reportType: js.UndefOr[ReportType] = js.undefined
  
  /**
    * Links to the task resources.
    */
  var resourceLinks: js.UndefOr[S3FileUrlList] = js.undefined
}
object ListThingRegistrationTaskReportsResponse {
  
  inline def apply(): ListThingRegistrationTaskReportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListThingRegistrationTaskReportsResponse]
  }
  
  extension [Self <: ListThingRegistrationTaskReportsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReportType(value: ReportType): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
    
    inline def setResourceLinks(value: S3FileUrlList): Self = StObject.set(x, "resourceLinks", value.asInstanceOf[js.Any])
    
    inline def setResourceLinksUndefined: Self = StObject.set(x, "resourceLinks", js.undefined)
    
    inline def setResourceLinksVarargs(value: S3FileUrl*): Self = StObject.set(x, "resourceLinks", js.Array(value*))
  }
}
