package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReadSetImportJobsResponse extends StObject {
  
  /**
    * A list of jobs.
    */
  var importJobs: js.UndefOr[ImportReadSetJobList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListReadSetImportJobsResponse {
  
  inline def apply(): ListReadSetImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReadSetImportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReadSetImportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setImportJobs(value: ImportReadSetJobList): Self = StObject.set(x, "importJobs", value.asInstanceOf[js.Any])
    
    inline def setImportJobsUndefined: Self = StObject.set(x, "importJobs", js.undefined)
    
    inline def setImportJobsVarargs(value: ImportReadSetJobItem*): Self = StObject.set(x, "importJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
