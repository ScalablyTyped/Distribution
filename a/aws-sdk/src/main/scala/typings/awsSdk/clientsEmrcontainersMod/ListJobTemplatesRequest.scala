package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListJobTemplatesRequest extends StObject {
  
  /**
    * The date and time after which the job templates were created.
    */
  var createdAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The date and time before which the job templates were created.
    */
  var createdBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The maximum number of job templates that can be listed.
    */
  var maxResults: js.UndefOr[JavaInteger] = js.undefined
  
  /**
    *  The token for the next set of job templates to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListJobTemplatesRequest {
  
  inline def apply(): ListJobTemplatesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListJobTemplatesRequest]
  }
  
  extension [Self <: ListJobTemplatesRequest](x: Self) {
    
    inline def setCreatedAfter(value: js.Date): Self = StObject.set(x, "createdAfter", value.asInstanceOf[js.Any])
    
    inline def setCreatedAfterUndefined: Self = StObject.set(x, "createdAfter", js.undefined)
    
    inline def setCreatedBefore(value: js.Date): Self = StObject.set(x, "createdBefore", value.asInstanceOf[js.Any])
    
    inline def setCreatedBeforeUndefined: Self = StObject.set(x, "createdBefore", js.undefined)
    
    inline def setMaxResults(value: JavaInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
