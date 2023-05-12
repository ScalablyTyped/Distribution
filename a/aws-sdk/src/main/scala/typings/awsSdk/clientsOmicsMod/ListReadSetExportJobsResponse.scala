package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetExportJobsResponse extends StObject {
  
  /**
    * A list of jobs.
    */
  var exportJobs: js.UndefOr[ExportReadSetJobDetailList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListReadSetExportJobsResponse {
  
  inline def apply(): ListReadSetExportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReadSetExportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetExportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setExportJobs(value: ExportReadSetJobDetailList): Self = StObject.set(x, "exportJobs", value.asInstanceOf[js.Any])
    
    inline def setExportJobsUndefined: Self = StObject.set(x, "exportJobs", js.undefined)
    
    inline def setExportJobsVarargs(value: ExportReadSetJobDetail*): Self = StObject.set(x, "exportJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
