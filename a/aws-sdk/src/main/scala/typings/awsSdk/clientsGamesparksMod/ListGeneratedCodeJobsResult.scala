package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeneratedCodeJobsResult extends StObject {
  
  /**
    * The list of generated code jobs.
    */
  var GeneratedCodeJobs: js.UndefOr[GeneratedCodeJobDetailsList] = js.undefined
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
}
object ListGeneratedCodeJobsResult {
  
  inline def apply(): ListGeneratedCodeJobsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeneratedCodeJobsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGeneratedCodeJobsResult] (val x: Self) extends AnyVal {
    
    inline def setGeneratedCodeJobs(value: GeneratedCodeJobDetailsList): Self = StObject.set(x, "GeneratedCodeJobs", value.asInstanceOf[js.Any])
    
    inline def setGeneratedCodeJobsUndefined: Self = StObject.set(x, "GeneratedCodeJobs", js.undefined)
    
    inline def setGeneratedCodeJobsVarargs(value: GeneratedCodeJobDetails*): Self = StObject.set(x, "GeneratedCodeJobs", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
