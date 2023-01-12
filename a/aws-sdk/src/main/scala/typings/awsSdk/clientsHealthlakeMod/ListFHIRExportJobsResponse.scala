package typings.awsSdk.clientsHealthlakeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFHIRExportJobsResponse extends StObject {
  
  /**
    *  The properties of listed FHIR export jobs, including the ID, ARN, name, and the status of the job. 
    */
  var ExportJobPropertiesList: typings.awsSdk.clientsHealthlakeMod.ExportJobPropertiesList
  
  /**
    *  A pagination token used to identify the next page of results to return for a ListFHIRExportJobs query. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsHealthlakeMod.NextToken] = js.undefined
}
object ListFHIRExportJobsResponse {
  
  inline def apply(ExportJobPropertiesList: ExportJobPropertiesList): ListFHIRExportJobsResponse = {
    val __obj = js.Dynamic.literal(ExportJobPropertiesList = ExportJobPropertiesList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFHIRExportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListFHIRExportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setExportJobPropertiesList(value: ExportJobPropertiesList): Self = StObject.set(x, "ExportJobPropertiesList", value.asInstanceOf[js.Any])
    
    inline def setExportJobPropertiesListVarargs(value: ExportJobProperties*): Self = StObject.set(x, "ExportJobPropertiesList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
