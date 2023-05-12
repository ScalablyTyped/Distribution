package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVariantImportJobsResponse extends StObject {
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of jobs.
    */
  var variantImportJobs: js.UndefOr[VariantImportJobItems] = js.undefined
}
object ListVariantImportJobsResponse {
  
  inline def apply(): ListVariantImportJobsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListVariantImportJobsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVariantImportJobsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setVariantImportJobs(value: VariantImportJobItems): Self = StObject.set(x, "variantImportJobs", value.asInstanceOf[js.Any])
    
    inline def setVariantImportJobsUndefined: Self = StObject.set(x, "variantImportJobs", js.undefined)
    
    inline def setVariantImportJobsVarargs(value: VariantImportJobItem*): Self = StObject.set(x, "variantImportJobs", js.Array(value*))
  }
}
