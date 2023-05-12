package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnnotationImportJobsResponse extends StObject {
  
  /**
    * A list of jobs.
    */
  var annotationImportJobs: js.UndefOr[AnnotationImportJobItems] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}
object ListAnnotationImportJobsResponse {
  
  inline def apply(): ListAnnotationImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAnnotationImportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAnnotationImportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setAnnotationImportJobs(value: AnnotationImportJobItems): Self = StObject.set(x, "annotationImportJobs", value.asInstanceOf[js.Any])
    
    inline def setAnnotationImportJobsUndefined: Self = StObject.set(x, "annotationImportJobs", js.undefined)
    
    inline def setAnnotationImportJobsVarargs(value: AnnotationImportJobItem*): Self = StObject.set(x, "annotationImportJobs", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
