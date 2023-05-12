package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReferenceImportJobsResponse extends StObject {
  
  /**
    * A lis of jobs.
    */
  var importJobs: js.UndefOr[ImportReferenceJobList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListReferenceImportJobsResponse {
  
  inline def apply(): ListReferenceImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReferenceImportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListReferenceImportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setImportJobs(value: ImportReferenceJobList): Self = StObject.set(x, "importJobs", value.asInstanceOf[js.Any])
    
    inline def setImportJobsUndefined: Self = StObject.set(x, "importJobs", js.undefined)
    
    inline def setImportJobsVarargs(value: ImportReferenceJobItem*): Self = StObject.set(x, "importJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
